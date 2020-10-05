package cn.nuke666.canteencomment.web;

import cn.nuke666.canteencomment.model.Demo;
import cn.nuke666.canteencomment.repository.DemoRepository;
import cn.nuke666.canteencomment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @Resource
    private CommentService commentService;

    @GetMapping("/{id}")
    public String getTest(Model model, @PathVariable Integer id) {
        Demo demo = demoRepository.findById(id).get();
        model.addAttribute("fieldB", demo.getFieldB());
        return "demo";
    }

    @GetMapping("/bs")
    public String demo1() {
        return "demo";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("comments", commentService.getCommentList());
        return "list";
    }
}
