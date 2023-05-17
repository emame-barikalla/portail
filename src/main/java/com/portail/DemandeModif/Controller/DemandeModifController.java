package com.portail.DemandeModif.Controller;

import com.portail.DemandeModif.Entity.DemandeModification;
import com.portail.DemandeModif.Service.IDemandeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Api("API pour les opérations CRUD sur les demandes de modification.")
@RestController
@RequestMapping("/api/demandemodification")
@CrossOrigin(origins = "http://localhost:4200/",allowCredentials="true")

public class DemandeModifController {
    private final IDemandeService IDemandeService;
    public DemandeModifController(IDemandeService IDemandeService) {
        this.IDemandeService = IDemandeService;
    }
    @ApiOperation(value = "Récupère la liste des demandes ")
    @GetMapping
    public List<DemandeModification> findAllDemandes() {
        return IDemandeService.findAllDemandes();
    }
    @ApiOperation(value = "Récupère une demande grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<DemandeModification> findById(@PathVariable("id") Long id){
        return 	IDemandeService.findById(id);
    }
    @ApiOperation(value = "ajouter une demande ")
    @PostMapping("/add")
    public DemandeModification savedemande(@RequestBody DemandeModification demandeModification) {
        return IDemandeService.saveDemande(demandeModification);
    }
    @ApiOperation(value = "modifier une demande ")
    @PutMapping("/update")
    public DemandeModification updatedemande(@RequestBody DemandeModification demandeModification) {
        return IDemandeService.updateDemande(demandeModification);
    }
    @ApiOperation(value = "supprimer une demande ")
    @DeleteMapping("/{id}")
    public void deletedemande(@PathVariable("id") Long id) {
        IDemandeService.deletedemande(id);
    }
}




