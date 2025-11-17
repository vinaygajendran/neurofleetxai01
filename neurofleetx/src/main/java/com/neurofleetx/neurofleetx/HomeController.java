package com.neurofleetx.neurofleetx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }
    
    @PostMapping("/submitform")
    public String submitForm(@RequestParam("name") String name, 
                            @RequestParam("steps") int steps, 
                            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("steps", steps);
        return "result";
    }

    @PostMapping("/addrobot")
    public String addrobot(@RequestParam("name") String name, 
                            @RequestParam("steps") int steps, 
                            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("steps", steps);
        return "result";
    }
}

