package cn.nuke666.canteencomment.web;

import cn.nuke666.canteencomment.service.CanteenService;
import cn.nuke666.canteencomment.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("test")
    @ResponseBody
    public String test(Model model) {
        return "测试文本...";
    }

}
