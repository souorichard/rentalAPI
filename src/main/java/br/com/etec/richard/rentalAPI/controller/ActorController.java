package br.com.etec.richard.rentalAPI.controller;

import br.com.etec.richard.rentalAPI.model.Actor;
import br.com.etec.richard.rentalAPI.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> list() {
        return actorRepository.findAll();
    }

}
