package com.springbootboilerplate.security.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1246526077883281623L;

    public Role() {

    }
    public Role(String name) {
        super();
        this.name =name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    @JsonIgnore()
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // other getters and setters are hidden for brevity
}
