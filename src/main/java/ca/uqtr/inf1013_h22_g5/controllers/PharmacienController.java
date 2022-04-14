package ca.uqtr.inf1013_h22_g5.controllers;

import ca.uqtr.inf1013_h22_g5.dto.PharmacienDTO;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;
import ca.uqtr.inf1013_h22_g5.services.PharmacienService;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static ca.uqtr.inf1013_h22_g5.utils.Constants.APP_ROOT;

@RestController
public class PharmacienController {

    @Autowired
    private PharmacienService pharmacienService;

    @PostMapping(value = APP_ROOT + "/pharmacien/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public PharmacienDTO save(@RequestBody PharmacienDTO pharmacienDTO){
        return pharmacienService.save(pharmacienDTO);
    }

    @GetMapping(value = APP_ROOT + "/pharmacien/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<PharmacienDTO> findById(@PathVariable("id") Integer id){
        return pharmacienService.findById(id);
    }

    @GetMapping(value = APP_ROOT + "/pharmaciens/all")
    public List<PharmacienDTO> findAll(){
        return pharmacienService.findAll();
    }

    @DeleteMapping(value = APP_ROOT + "/pharmacien/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        pharmacienService.delete(id);
    }

}
