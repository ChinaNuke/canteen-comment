package cn.nuke666.canteencomment.web;

import cn.nuke666.canteencomment.service.CanteenService;
import cn.nuke666.canteencomment.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private CommentService commentService;

    @Resource
    private CanteenService canteenService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("canteens", canteenService.getCanteenList());
        model.addAttribute("comments", commentService.getCommentList());
        return "list";
    }

    @GetMapping("/create")
    public String create() {
        return "createoredit";
    }
}
