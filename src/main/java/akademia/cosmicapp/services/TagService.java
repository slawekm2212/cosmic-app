package akademia.cosmicapp.services;

import akademia.cosmicapp.commons.Mapper;
import akademia.cosmicapp.controllers.TagController;
import akademia.cosmicapp.mappers.TagMapper;
import akademia.cosmicapp.models.Tag;
import akademia.cosmicapp.repositories.TagRepository;
import org.springframework.stereotype.Service;

@Service
public class TagService {
    private TagRepository tagRepository;
    private TagMapper tagMapper;

    public TagService(TagRepository tagRepository, TagMapper tagMapper) {
        this.tagRepository = tagRepository;
        this.tagMapper = tagMapper;
    }
}
