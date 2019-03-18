package akademia.cosmicapp.controllers;

import akademia.cosmicapp.models.Planet;
import akademia.cosmicapp.services.PlanetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class PlanetController {
    private PlanetService planetServic;

    public PlanetController(PlanetService planetServic) {
        this.planetServic = planetServic;
    }
}
