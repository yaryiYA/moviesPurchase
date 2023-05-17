package com.example.projectnine.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "film")
public class Film extends AbstractEntity {
    @Column(name = "title")
    private String title;

    @Column(name = "country")
    private String country;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "film_directors",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "directors_id"))
    private Set<Director> directors = new LinkedHashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Film film = (Film) o;
        return getId() != null && Objects.equals(getId(), film.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}