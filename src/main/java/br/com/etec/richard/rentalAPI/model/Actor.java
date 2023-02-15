package br.com.etec.richard.rentalAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 200)
    private String nameactor;

    @JsonIgnore
    @OneToMany(mappedBy = "author")
    private List<Movie> movies = new ArrayList<>();

}
