package com.group3.waternonprofit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class MattController {
        @RequestMapping("/matt")
        public String aboutus(){
            return "mattindex";
        }
}
