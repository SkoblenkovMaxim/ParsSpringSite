package CaptainPiston.ParsSpringSite.controllers;

import CaptainPiston.ParsSpringSite.ParSiteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class ParSiteController {
    private final ParSiteService parSiteService;

    public ParSiteController(ParSiteService parSiteService) {
        this.parSiteService = parSiteService;
    }
    @GetMapping("/")
    public String home() {
        return parSiteService.pss();
    }
}
