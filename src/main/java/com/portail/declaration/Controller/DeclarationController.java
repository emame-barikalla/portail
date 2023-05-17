package com.portail.declaration.Controller;

import com.portail.declaration.Service.IDeclarationService;
import com.portail.declaration.Entity.Declaration;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Api("API pour les opérations CRUD sur les declaration.")
@RestController
@RequestMapping("/api/declaration")
@CrossOrigin(origins = "http://localhost:4200/",allowCredentials="true")
public class DeclarationController {

    private final IDeclarationService ideclarationservice;


    public DeclarationController(IDeclarationService ideclarationservice) {
        this.ideclarationservice = ideclarationservice;
    }
    @ApiOperation(value = "Récupère la liste des declarations ")
    @GetMapping("/all")
    public List<Declaration> findAlldeclaration() {
        return ideclarationservice.findAlldeclarations();
    }
    @ApiOperation(value = "Récupère une declaration grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<Declaration>  finddeclarationById(@PathVariable Long id) {
        return ideclarationservice.findById(id);
    }
    @ApiOperation(value = "ajouter une declaration ")

    @PostMapping("/add")
    public Declaration savedec(@RequestBody Declaration declaration) {
        return ideclarationservice.savedeclaration(declaration);
    }
    @ApiOperation(value = "modifier une declaration ")
    @PutMapping("/update")
    public Declaration updatedec(@RequestBody Declaration declaration) {
        return ideclarationservice.updatedeclaration(declaration);
    }
    @ApiOperation(value = "supprimer une declaration  ")
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id) {
        ideclarationservice.deletedeclaration(id);
    }
}