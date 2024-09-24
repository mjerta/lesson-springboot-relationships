package nl.mpdev.lesopdracht_week39.manytomany;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String text;
//  private User user;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable (
    name = "post_categories",
    joinColumns = @JoinColumn(name = "post_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id")
  )
  private List<Category> categories = new ArrayList<>();
}
