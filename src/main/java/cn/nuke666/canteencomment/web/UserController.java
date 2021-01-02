package cn.nuke666.canteencomment.web;

import cn.nuke666.canteencomment.model.User;
import cn.nuke666.canteencomment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new RuntimeException();
        }
        userService.save(userForm);
        return "redirect:/login?registered";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout, String registered) {
        return "login";
    }

}
