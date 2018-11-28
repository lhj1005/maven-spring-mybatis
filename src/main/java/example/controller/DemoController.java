package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class DemoController {
//    @RequestMapping("/index")
//    public ModelAndView index(){
//        System.out.println("进来了吗？");
//        ModelAndView modelAndView= new ModelAndView();
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }

    @RequestMapping("/index")
    public String index(){
        System.out.println("进来了吗？");
        return "index";
    }
}
