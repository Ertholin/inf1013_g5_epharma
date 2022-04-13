package ca.uqtr.inf1013_h22_g5.controllers;

import ca.uqtr.inf1013_h22_g5.dto.PharmacienDTO;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;
import ca.uqtr.inf1013_h22_g5.services.PharmacienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PharmacienController {

    @Autowired
    private PharmacienService pharmacienService;

    @PostMapping(value = "/pharmacien/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public PharmacienDTO save(@RequestBody Pharmacien pharmacien){
        return pharmacienService.save(pharmacien);
    }

    @GetMapping(value = "/pharmacien/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Pharmacien> findById(@PathVariable("id") Long id){
        return pharmacienService.findById(id);
    }

    @GetMapping(value = "/pharmacien/all")
    public List<Pharmacien> findAll(){
        return pharmacienService.findAll();
    }

    @DeleteMapping(value = "/pharmacien/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        pharmacienService.delete(id);
    }

}
