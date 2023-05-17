package com.portail.DemandeAvance.Controller;

import com.portail.DemandeAvance.Entity.DemandeAvance;
import com.portail.DemandeAvance.Service.IDemandeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Api("API pour les opérations CRUD sur les demandes d'avance.")
@RestController
@RequestMapping("/api/demandeavance")
@CrossOrigin(origins = "http://localhost:4200/",allowCredentials="true")

public class DemandeAvanceController {
    private final IDemandeService IDemandeService;
    public DemandeAvanceController(IDemandeService IDemandeService) {
        this.IDemandeService = IDemandeService;
    }
    @ApiOperation(value = "Récupère la liste des demandes ")
    @GetMapping
    public List<DemandeAvance> findAllDemandes() {
        return IDemandeService.findAllDemandes();
    }
    @ApiOperation(value = "Récupère une demande grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<DemandeAvance> findById(@PathVariable("id") Long id){
        return 	IDemandeService.findById(id);
    }
    @ApiOperation(value = "ajouter une demande ")
    @PostMapping("/add")
    public DemandeAvance savedemande(@RequestBody DemandeAvance demandeAvance) {
        return IDemandeService.saveDemande(demandeAvance);
    }
    @ApiOperation(value = "modifier une demande ")
    @PutMapping("/update")
    public DemandeAvance updatedemande(@RequestBody DemandeAvance demandeAvance) {
        return IDemandeService.updateDemande(demandeAvance);
    }
    @ApiOperation(value = "supprimer une demande ")
    @DeleteMapping("/{id}")
    public void deletedemande(@PathVariable("id") Long id) {
        IDemandeService.deletedemande(id);
    }
}




