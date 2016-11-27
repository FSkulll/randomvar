package edu.randomvar.mvc.web;

import edu.randomvar.mvc.domain.Users;
import edu.randomvar.mvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class AccountController {

    @Qualifier("userService")
    @Autowired
    private UsersService usersService;

    @RequestMapping("/")
    public String startPage(){return "redirect:/login";}

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("user", new Users());
        return "register";
    }

    @RequestMapping(value = "/create" ,method = RequestMethod.POST)
    public String addUser(@Valid Users user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) return "register";
        usersService.addUser(user);
        return "redirect:/index";
    }
}
