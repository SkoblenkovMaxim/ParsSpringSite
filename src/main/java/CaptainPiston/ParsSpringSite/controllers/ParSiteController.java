package CaptainPiston.ParsSpringSite.controllers;

import CaptainPiston.ParsSpringSite.ParSiteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParSiteController {
    @GetMapping("/")
    public String parSiteService() {
        return new ParSiteService().home();
    }
//    public String home() {
//        return "polls";
//    }
}
