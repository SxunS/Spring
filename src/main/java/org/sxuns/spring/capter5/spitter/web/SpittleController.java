package org.sxuns.spring.capter5.spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.sxuns.spring.capter5.spitter.data.SpittleRepository;
import org.sxuns.spring.capter5.spitter.vo.Spitter;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 * @author s_xun
 */
@Controller
@RequestMapping("/spittle")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(Model model){
        Spitter spitter = new Spitter();
        model.addAttribute("spitter",spitter);
        return "thymeleafRegisterForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegisteration(@RequestParam("profilePicture") MultipartFile profilePicture, @Valid Spitter spitter, Errors errors, Model model, HttpServletRequest request) throws IOException {
        if (errors.hasErrors()){
            model.addAttribute("errors",errors);
            model.addAttribute("spitter",spitter);
            return "thymeleafRegisterForm";
        }
        File file = new File(profilePicture.getOriginalFilename());
        profilePicture.transferTo(file);
        spittleRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUserName();
    }
}
