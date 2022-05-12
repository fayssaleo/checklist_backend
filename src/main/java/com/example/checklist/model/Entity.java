package com.example.checklist.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@javax.persistence.Entity
@Table(name="entity")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "entity",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("entity")
    // @JoinColumn(name = "id_departement")
    private List<Role> roles;
}
