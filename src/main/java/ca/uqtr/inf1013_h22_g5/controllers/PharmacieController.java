package ca.uqtr.inf1013_h22_g5.controllers;

import ca.uqtr.inf1013_h22_g5.dto.PharmacieDTO;
import ca.uqtr.inf1013_h22_g5.dto.PharmacieDTO;
import ca.uqtr.inf1013_h22_g5.services.PharmacieService;
import ca.uqtr.inf1013_h22_g5.services.PharmacieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static ca.uqtr.inf1013_h22_g5.utils.Constants.APP_ROOT;

@RestController
public class PharmacieController {

    @Autowired
    private PharmacieService pharmacieService;

    @PostMapping(value = APP_ROOT + "/pharmacie/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public PharmacieDTO save(@RequestBody PharmacieDTO PharmacieDTO){
        return pharmacieService.save(PharmacieDTO);
    }

    @GetMapping(value = APP_ROOT + "/pharmacie/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<PharmacieDTO> findById(@PathVariable("id") Integer id){
        return pharmacieService.findById(id);
    }

    @GetMapping(value = APP_ROOT + "/pharmacies/all")
    public List<PharmacieDTO> findAll(){
        return pharmacieService.findAll();
    }

    @DeleteMapping(value = APP_ROOT + "/pharmacie/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        pharmacieService.delete(id);
    }
}
