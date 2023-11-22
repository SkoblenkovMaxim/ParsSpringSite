package CaptainPiston.ParsSpringSite.controllers;

import CaptainPiston.ParsSpringSite.ParSiteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Component
@RestController
public class ParSiteController {
    private final ParSiteService parSiteService;

    public ParSiteController(ParSiteService parSiteService) {
        this.parSiteService = parSiteService;
    }
    @GetMapping("/")
    public String controller() throws IOException {
        return parSiteService.getPolls();
    }
}
