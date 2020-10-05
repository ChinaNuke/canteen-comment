package com.nuke666.canteencomment.web;

import com.nuke666.canteencomment.model.Demo;
import com.nuke666.canteencomment.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping("/{id}")
    public String getTest(Model model, @PathVariable Integer id) {
        Demo demo = demoRepository.findById(id).get();
        model.addAttribute("fieldB", demo.getFieldB());
        return "demo";
    }
}
