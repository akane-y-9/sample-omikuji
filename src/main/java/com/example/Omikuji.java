package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Omikuji {
    @RequestMapping("/omikuji")
    public String start(){
        double fn = Math.random();
        if(fn >= 0.7){
            return "Daikichi.html";
        }else if (fn >= 0.4){
            return "Chukichi.html";
        }else if(fn >= 0.1){
            return "Kichi.html";
        }else {
            return "Kyo.html";
        }
    }
}
