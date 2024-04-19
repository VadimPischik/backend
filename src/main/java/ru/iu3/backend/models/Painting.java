package ru.iu3.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;


@Entity
@Table(name = "paintings")
@Access(AccessType.FIELD)
public class Painting {


    public Painting() { }
    public Painting(Long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public long id;

    @Column(name = "name", nullable = false, unique = true)
    public String name;

    @JsonIgnore
    @Column(name = "artistid")
    public int artistid;

    @Column(name = "museumid")
    public int museumid;

    @JsonIgnore
    @Column(name = "year")
    public String year;


}
