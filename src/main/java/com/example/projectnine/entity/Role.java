package com.example.projectnine.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {
    @Column(name = "title")
    private String title;

}