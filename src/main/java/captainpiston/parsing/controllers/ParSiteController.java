package captainpiston.parsing.controllers;

import captainpiston.parsing.ParSiteService;
import captainpiston.parsing.Poll;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public List<Poll> controller() {
       return parSiteService.getPolls();
    }
}
