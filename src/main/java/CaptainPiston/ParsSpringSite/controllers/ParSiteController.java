package CaptainPiston.ParsSpringSite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParSiteController {
    @GetMapping("/")
    public String home() {
        return "polls";
    }
}
