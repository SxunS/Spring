package capter5;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.web.servlet.view.InternalResourceView;
import org.sxuns.spring.capter5.spitter.data.SpittleRepository;
import org.sxuns.spring.capter5.spitter.domain.Spittle;
import org.sxuns.spring.capter5.spitter.web.HomeController;
import org.sxuns.spring.capter5.spitter.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        ResultActions home = mockMvc.perform(MockMvcRequestBuilders.get("/homePage"))
                .andExpect(view().name("home"));
    }

    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> expectSpittles = createSpittleList(20);
        SpittleRepository spittleRepository = mock(SpittleRepository.class);
        when(spittleRepository.findSpittles(Long.MAX_VALUE,20))
                .thenReturn(expectSpittles);
        SpittleController controller = new SpittleController(spittleRepository);
        MockMvc build = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        build.perform(MockMvcRequestBuilders.get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"));
                //.andExpect(MockMvcResultMatchers.model().attribute("spittleList",CoreMatchers.hasItem(expectSpittles.toArray())));
    }

    private List<Spittle> createSpittleList(int count){
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle=" + i, new Date()));
        }
        return spittles;
    }
}
