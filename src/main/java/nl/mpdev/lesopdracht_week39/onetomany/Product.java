//package nl.mpdev.lesopdracht_week39.onetomany;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.security.PrivateKey;
//
//@Entity
//@Data
//@Table(name = "Products")
//public class Product {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Integer id;
//
//  private String text;
//
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "category_id")
//  private Category category;
//
//}
