package com.group3.waternonprofit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BiliController {
    @RequestMapping("/bili")
    public String contactus(){

        return "billindex";
    }
}
