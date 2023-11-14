package CaptainPiston.ParsSpringSite;

import org.springframework.stereotype.Service;

@Service
public class ParSiteService {
    private MkService mkService;

    public ParSiteService(MkService mkService) {
        this.mkService = mkService;
    }

    public String pss() {
        return mkService.serviceHome();
    }
}
