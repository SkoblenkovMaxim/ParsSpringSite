package captainpiston.parsing.controllers;

import captainpiston.parsing.ParSiteServiceImpl;
import captainpiston.parsing.Poll;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Component
@RestController
@RequestMapping("")
public class ParSiteController {
    private final ParSiteServiceImpl parSiteServiceImpl;

    public ParSiteController(ParSiteServiceImpl parSiteServiceImpl) {
        this.parSiteServiceImpl = parSiteServiceImpl;
    }
    @GetMapping("")
    public List<Poll> controller() {
       return parSiteServiceImpl.getPolls();
    }
}
