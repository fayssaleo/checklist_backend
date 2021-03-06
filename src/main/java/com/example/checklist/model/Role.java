package com.example.checklist.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@javax.persistence.Entity
@Table(name="role")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Role  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @JsonIgnoreProperties("role")
    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<UserDao> userDaos;

    @JsonIgnoreProperties("roles")
    @ManyToOne
    private Entity entity;
}
