package br.com.etec.richard.rentalAPI.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String moviename;

    @ManyToOne
    @JoinColumn(name = "idgender")
    private Gender idgender;

    @ManyToOne
    @JoinColumn(name = "idactor")
    private Actor idactor;

}
