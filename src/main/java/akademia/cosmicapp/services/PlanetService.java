package akademia.cosmicapp.services;

import akademia.cosmicapp.repositories.PlanetRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }
}
