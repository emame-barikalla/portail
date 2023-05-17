package com.portail.DemandeAttestation.Controller;

import com.portail.DemandeAttestation.Entity.DemandeAttestation;
import com.portail.DemandeAttestation.Service.IDemandeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Api("API pour les opérations CRUD sur les demandes d'attestation.")
@RestController
@RequestMapping("/api/demandeattestation")
@CrossOrigin(origins = "http://localhost:4200/",allowCredentials="true")

public class DemandeAttestationController {
    private final IDemandeService IDemandeService;
    public DemandeAttestationController(IDemandeService IDemandeService) {
        this.IDemandeService = IDemandeService;
    }
    @ApiOperation(value = "Récupère la liste des demandes ")
    @GetMapping
    public List<DemandeAttestation> findAllDemandes() {
        return IDemandeService.findAllDemandes();
    }
    @ApiOperation(value = "Récupère une demande grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<DemandeAttestation> findById(@PathVariable("id") Long id){
        return 	IDemandeService.findById(id);
    }
    @ApiOperation(value = "ajouter une demande ")
    @PostMapping("/add")
    public DemandeAttestation savedemande(@RequestBody DemandeAttestation demandeAttestation) {
        return IDemandeService.saveDemande(demandeAttestation);
    }
    @ApiOperation(value = "modifier une demande ")
    @PutMapping("/update")
    public DemandeAttestation updatedemande(@RequestBody DemandeAttestation demandeAttestation) {
        return IDemandeService.updateDemande(demandeAttestation);
    }
    @ApiOperation(value = "supprimer une demande ")
    @DeleteMapping("/{id}")
    public void deletedemande(@PathVariable("id") Long id) {
        IDemandeService.deletedemande(id);
    }
}




