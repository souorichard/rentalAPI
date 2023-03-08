package br.com.etec.richard.rentalAPI.controller;

import br.com.etec.richard.rentalAPI.model.Gender;
import br.com.etec.richard.rentalAPI.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genders")
public class GenderController {

    @Autowired
    private GenderRepository genderRepository;

    public List<Gender> list() {
        return genderRepository.findAll();
    }

}
