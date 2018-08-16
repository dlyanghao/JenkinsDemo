package work.yanghao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("test.do")
    public String jenkinsTest(String info){

        System.out.println(info);
        return "success.html";
    }
}
