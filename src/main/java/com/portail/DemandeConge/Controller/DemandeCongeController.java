package com.portail.DemandeConge.Controller;

import com.portail.DemandeConge.Entity.DemandeConge;
import com.portail.DemandeConge.Service.IDemandeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Api("API pour les opérations CRUD sur les demandes de conge.")
@RestController
@RequestMapping("/api/demandeconge")
@CrossOrigin(origins = "http://localhost:4200/")

public class DemandeCongeController {
    private final IDemandeService IDemandeService;
    public DemandeCongeController(IDemandeService IDemandeService) {
        this.IDemandeService = IDemandeService;
    }
    @ApiOperation(value = "Récupère la liste des demandes ")
    @GetMapping
    public List<DemandeConge> findAllDemandes() {
        return IDemandeService.findAllDemandes();
    }
    @ApiOperation(value = "Récupère une demande grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<DemandeConge> findById(@PathVariable("id") Long id){
        return 	IDemandeService.findById(id);
    }
    @ApiOperation(value = "ajouter une demande ")
    @PostMapping("/add")
    public DemandeConge savedemande(@RequestBody DemandeConge demandeConge) {
        return IDemandeService.saveDemande(demandeConge);
    }
    @ApiOperation(value = "modifier une demande ")
    @PutMapping("/update")
    public DemandeConge updatedemande(@RequestBody DemandeConge demandeConge) {
        return IDemandeService.updateDemande(demandeConge);
    }
    @ApiOperation(value = "supprimer une demande ")
    @DeleteMapping("/{id}")
    public void deletedemande(@PathVariable("id") Long id) {
        IDemandeService.deletedemande(id);
    }
}




