package com.codeup.springblog.SQL;

import javax.persistence.*;

@Entity
@Table(name="Pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private double age;

    @Column(nullable = false, length = 100)
    private String species;
}


//id
//name
//age
//species

