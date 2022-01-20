package com.zeronthirty.ecommerce.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name= "state")
@Getter
@Setter
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

}
