package edu.wctc.springbootassignment.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/")
    public String showIndex() {return "index";}
}