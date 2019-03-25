package akademia.cosmicapp.mappers;

import akademia.cosmicapp.commons.Mapper;
import akademia.cosmicapp.models.Tag;
import akademia.cosmicapp.models.dtos.TagDto;
import org.springframework.stereotype.Component;

@Component
public class TagMapper implements Mapper<Tag, TagDto> {
    @Override
    public TagDto map(Tag from) {
        return null;
    }

    @Override
    public Tag revers(TagDto to) {
        return null;
    }
    //todo
    //TagDto
}
