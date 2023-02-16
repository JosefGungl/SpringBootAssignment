package edu.wctc.springbootassignment.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class doItController {

    @RequestMapping("/step1")
    public String showStep1() {return "pages/write-down";}

    @RequestMapping("/step2")
    public String showStep2() {return "pages/plan-the-day";}

    @RequestMapping("/step3")
    public String showStep3() {return "pages/do-it";}

}