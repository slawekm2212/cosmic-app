package akademia.cosmicapp.repositories;

import akademia.cosmicapp.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}