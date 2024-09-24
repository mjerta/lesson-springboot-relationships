package nl.mpdev.lesopdracht_week39.manytomany;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  @ManyToMany(mappedBy = "categories")
  private List<Post> posts = new ArrayList<>();

}
