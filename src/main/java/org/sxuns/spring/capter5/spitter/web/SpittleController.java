package org.sxuns.spring.capter5.spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.sxuns.spring.capter5.spitter.data.SpittleRepository;
import org.sxuns.spring.capter5.spitter.vo.Spitter;

import javax.validation.Valid;

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
    public String showRegisterForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegisteration(@Valid Spitter spitter, Errors errors){
        if (errors.hasErrors()){
            return "registerForm";
        }
        spittleRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUserName();
    }
}
