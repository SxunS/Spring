package org.sxuns.spring.capter5.spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author s_xun
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/homePage",method = RequestMethod.GET)
    public String home(){
        return "homeTiles";
    }
    @RequestMapping("/thymeleafHome")
    public String thymeleafHome(){
        return "thymeleafHome";
    }
}
