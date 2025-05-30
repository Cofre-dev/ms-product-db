package cl.duoc.ms_product_db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="products")
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;
    @Column(name="stock")
    private int stock;
    @Column(name="sku")
    private String sku;
    @Column(name="available")
    private boolean available;
        
}
