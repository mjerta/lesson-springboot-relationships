package nl.mpdev.lesopdracht_week39.onetoone;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "RelatedOneToOnes")
public class RelatedOneToOne {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String text;
}
