package com.example.projectnine.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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
@Table(name = "director")
public class Director extends AbstractEntity {
    @Column(name = "first_name")
    private String firstName;
    @Size(min = 0,max=20)
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "position")
    private String position;

    @ManyToMany
    @JoinTable(name = "director_films",
            joinColumns = @JoinColumn(name = "director_id"),
            inverseJoinColumns = @JoinColumn(name = "films_id"))
    private Set<Film> films = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Director director = (Director) o;
        return getId() != null && Objects.equals(getId(), director.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}