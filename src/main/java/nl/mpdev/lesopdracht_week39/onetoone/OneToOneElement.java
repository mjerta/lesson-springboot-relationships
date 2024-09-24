package nl.mpdev.lesopdracht_week39.onetoone;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "OneToOneElements")
public class OneToOneElement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "RelatedOneToOne_id", referencedColumnName = "id")
  private RelatedOneToOne relatedData;

}
