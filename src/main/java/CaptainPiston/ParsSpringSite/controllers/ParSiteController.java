package CaptainPiston.ParsSpringSite.controllers;

import CaptainPiston.ParsSpringSite.ParSiteService;
import CaptainPiston.ParsSpringSite.Poll;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Component
@RestController
@RequestMapping("/")
public class ParSiteController {
    private final ParSiteService parSiteService;

    public ParSiteController(ParSiteService parSiteService) {
        this.parSiteService = parSiteService;
    }
    @GetMapping("/")
    public List<Poll> controller() throws IOException {
       return parSiteService.getPolls();
    }
}
