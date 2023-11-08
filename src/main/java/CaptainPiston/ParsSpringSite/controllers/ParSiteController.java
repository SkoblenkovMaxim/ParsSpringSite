package CaptainPiston.ParsSpringSite.controllers;

import CaptainPiston.ParsSpringSite.ParSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class ParSiteController {
    private final ParSiteService parSiteService;

    @Autowired
    public ParSiteController(ParSiteService parSiteService) {
        this.parSiteService = parSiteService;
    }

    @Override
    public String toString() {
        return " " + parSiteService;
    }
}
