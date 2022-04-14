package ca.uqtr.inf1013_h22_g5.controllers;

import ca.uqtr.inf1013_h22_g5.dto.MedicamentDTO;
import ca.uqtr.inf1013_h22_g5.services.MedicamentService;
import ca.uqtr.inf1013_h22_g5.services.PharmacienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static ca.uqtr.inf1013_h22_g5.utils.Constants.APP_ROOT;

@RestController
public class MedicamentController {

    @Autowired
    private MedicamentService medicamentService;

    @PostMapping(value = APP_ROOT + "/medicament/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public MedicamentDTO save(@RequestBody MedicamentDTO dto){
        return medicamentService.save(dto);
    }

    @GetMapping(value = APP_ROOT + "/medicament/{id}")
    public Optional<MedicamentDTO> findById(@PathVariable("id") Integer id){
        return medicamentService.findById(id);
    }

    @GetMapping(value = APP_ROOT + "/medicament/{nom}")
    public Optional<MedicamentDTO> findMedicamentByNom(@PathVariable("nom") String nom){
        return medicamentService.findMedicamentByNom(nom);
    }

    @GetMapping(value = APP_ROOT + "/medicament/{marque}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<MedicamentDTO> findMedicamentByMarque(@PathVariable("marque") String marque){
        return medicamentService.findMedicamentByMarque(marque);
    }

    @GetMapping(value = APP_ROOT + "/medicament/{prix}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<MedicamentDTO> findMedicamentByPrix(@PathVariable("prix") double prix){
        return medicamentService.findMedicamentByPrix(prix);
    }

    @GetMapping(value = APP_ROOT + "/medicaments/all")
    public List<MedicamentDTO> findAll(){
        return medicamentService.findAll();
    }
    @DeleteMapping(value = APP_ROOT + "/medicament/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        medicamentService.delete(id);
    }



}
