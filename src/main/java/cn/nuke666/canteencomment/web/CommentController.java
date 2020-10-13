package cn.nuke666.canteencomment.web;

import cn.nuke666.canteencomment.service.CanteenService;
import cn.nuke666.canteencomment.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class CommentController {

    @Resource
    CommentService commentService;

    @Resource
    CanteenService canteenService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("canteens", canteenService.getCanteenList());
        model.addAttribute("comments", commentService.getCommentList());
        return "index";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("create", true);
        model.addAttribute("canteens", canteenService.getCanteenList());
        return "createoredit";
    }

    @GetMapping("edit")
    public String edit(Model model) {
        model.addAttribute("edit", true);
        model.addAttribute("canteens", canteenService.getCanteenList());
        return "createoredit";
    }

}
