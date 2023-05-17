package com.example.projectnine.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "order")
public class Order extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;


    @Column(name = "price", precision = 19, scale = 2)
    private BigDecimal price;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "order_films",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "films_id"))
    private Set<Film> films = new LinkedHashSet<>();

}