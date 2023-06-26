package com.BenStore.BenStore.Categories;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Shoes")
@ToString
@EqualsAndHashCode
public class Shoes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "marca")
    private String marca;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "talle")
    private String talle;

    @Getter @Setter @Column(name = "precio")
    private String precio;

}
