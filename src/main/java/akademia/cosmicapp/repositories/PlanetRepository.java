package akademia.cosmicapp.repositories;

import akademia.cosmicapp.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
