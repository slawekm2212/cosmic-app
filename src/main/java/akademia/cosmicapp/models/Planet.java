package akademia.cosmicapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data // gett, sett, toString, hash, equals
@Builder
@Entity
@Table(name="planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "planet_name")
    private String planetName;

    @Column(name = "distance_from_sun")
    private long distanceFromSun;

    @Column(name = "one_way_light_time_to_the_sun")
    private double oneWayLightTimeToTheSun;

    @Column(name = "leght_of_year")
    private long lengthOfYear;

    @Column(name = "planet_type")
    private String planetType;

    @Column(name = "planet_info")
    private String planetInfo;

    @Column(name = "planet_image")
    private String planetImage;

    @ManyToMany(cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE}
            )
    @JoinTable(
            name = "planet_tag",
            joinColumns = @JoinColumn(name = "planet_id"),
            inverseJoinColumns = @JoinColumn(name = "")
    )
    private Set<Tag> tags = new HashSet<>();



}
