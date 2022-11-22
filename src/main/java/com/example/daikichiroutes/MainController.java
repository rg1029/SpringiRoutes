package com.example.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "hello world!";
    }

    @RequestMapping("/daikichi")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("daikichi/today")
    public String today(){
        return "today you will find luck";
    }

    @RequestMapping("/daikichi/tommorow")
    public String tommorow (){
        return "tommorow, an opportunity";
    }

    @RequestMapping("/daikichi/travel")
    public String tommorowtravel (){
        return "tommorow, an opportunity to travel";
    }
    @RequestMapping("/daikichi/lotto")
    public String lotto (){
        return "will it be odd or even";
    }

    @RequestMapping("/daikichi/travel/{destination}")
    public String showDesination(@PathVariable("destination")String destination){
        return "Congratulations you will be flying to " + destination;

    }

    @RequestMapping("/daikichi/lotto/{lotteryNum}")
    public String showLotto(@PathVariable("lotteryNum") int lotteryNum){
        if ((lotteryNum % 2) == 0){
            return "you will take a grand journey in the future, but be wary of tempting offers";
        } else{
            return "You have enjoyed the fruites of your labor but now is a great time with family friends.";
        }
    }


}
