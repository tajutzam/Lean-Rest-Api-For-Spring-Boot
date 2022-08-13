package zam.dev.springbootrestapinew.model.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    @Column(name = "id" , length = 8)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;

    @Getter
    @Column(name="name" , length = 32)
    private String name;

    @Getter
    @Column(name = "description"  , length =64 )
    private String description;

    @Getter
    @Column(name = "prize" , length = 32)
    private double prize;

}
