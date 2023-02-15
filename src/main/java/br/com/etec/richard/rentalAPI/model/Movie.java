package br.com.etec.richard.rentalAPI.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column(length = 200)
    private String moviename;

    @ManyToOne
    @JoinColumn(name = "idgender")
    private Integer idgender;

    @ManyToOne
    @JoinColumn(name = "idauthor")
    private Integer idactor;

}
