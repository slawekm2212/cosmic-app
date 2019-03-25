package akademia.cosmicapp.services;

import akademia.cosmicapp.models.Planet;
import akademia.cosmicapp.models.dtos.PlanetDto;
import akademia.cosmicapp.repositories.PlanetRepository;
import akademia.cosmicapp.mappers.PlanetMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;
    private PlanetMapper planetMapper;

    public PlanetService(PlanetRepository planetRepository, PlanetMapper planetMapper) {
        this.planetRepository = planetRepository;
        this.planetMapper = planetMapper;
    }
    /*
    DAO
     */

    public List<Planet> getPlanets() {
        return planetRepository.findAll();
    }

    public List<PlanetDto> getPlanetsDto() {
        /*
    DTO
     I Sposob
        List<PlanetDto> planetDtos = new ArrayList<>();
        planetRepository.findAll()
                .stream()
                .map(p -> planetDtos.add(planetMapper.map(p)))
                .collect(Collectors.toList());

        return planetDtos;
            }
        */
        // sposob II
        return planetRepository
                .findAll()
                .stream()
                .map(planetMapper::map)
                .collect(Collectors.toList());

    }
    public Planet addPlanet(PlanetDto planetDto) {
        return planetRepository.save(planetMapper.revers(planetDto));
    }
    public void deletePlanet(String planetName) {
        planetRepository.deleteByPlanetName(planetName);
    }
    public void updatePlanet(PlanetDto planetDto) {
        planetRepository
                .findByPlanetName(planetDto.getPlanetName())
                .ifPresent(p -> {
                    p.setDistanceFromSun(planetDto.getDistanceFromSun());
                    p.setOneWayLightTimeToTheSun(planetDto.getOneWayLightTimeToTheSun());
                    p.setLengthOfYear(planetDto.getLengthOfYear());
                    p.setPlanetType(planetDto.getPlanetType());
                    p.setPlanetInfo(planetDto.getPlanetInfo());
                    p.setPlanetImage(planetDto.getPlanetImage());

                    planetRepository.save(p);
                });
    }
    public List<PlanetDto> getPlanetsByDistanceFromSun(Long distance){
        return planetRepository
                .findPlanetsByDistanceFromSun(distance)
                .stream()
                .map(planetMapper::map)
                .collect(Collectors.toList());
    }
}
