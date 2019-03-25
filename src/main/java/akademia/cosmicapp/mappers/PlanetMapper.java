package akademia.cosmicapp.mappers;

import akademia.cosmicapp.commons.Mapper;

import akademia.cosmicapp.models.Planet;
import akademia.cosmicapp.models.Tag;
import akademia.cosmicapp.models.dtos.PlanetDto;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PlanetMapper implements Mapper<Planet, PlanetDto> {

    @Override
    public PlanetDto map(Planet f) {

        List<String> tags = f
                .getTags()
                .stream()
                .map(TagsToStringList.INSTANCE)
                .collect(Collectors.toList());

        return PlanetDto
                .builder()
                .planetName(f.getPlanetName())
                .distanceFromSun(f.getDistanceFromSun())
                .lengthOfYear(f.getLengthOfYear())
                .oneWayLightTimeToTheSun(f.getOneWayLightTimeToTheSun())
                .planetType(f.getPlanetType())
                .planetInfo(f.getPlanetInfo())
                .planetImage(f.getPlanetImage())
                .tags(tags)
                .build();
    }

    @Override
    public Planet revers(PlanetDto to) {
        return Planet
                .builder()
                .planetName(to.getPlanetName())
                .distanceFromSun(to.getDistanceFromSun())
                .lengthOfYear(to.getLengthOfYear())
                .oneWayLightTimeToTheSun(to.getOneWayLightTimeToTheSun())
                .planetType(to.getPlanetType())
                .planetInfo(to.getPlanetInfo())
                .planetImage(to.getPlanetImage())
                .build();
    }
    private enum TagsToStringList implements Function<Tag,String>{
        INSTANCE;

        @Override
        public String apply(Tag tag) {
            return tag.getTitle();
        }
    }
}
