package Efleure.Controller;

import Efleure.Entity.Fleur;
import Efleure.Service.FleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Fleur")
@CrossOrigin("http://localhost:3000/")
public class Controller {
    @Autowired
    FleurService fleurService;

    @PostMapping("/ajoutfleur")
    public Fleur ajoutFleur(@RequestBody Fleur fleur){
        return fleurService.AjouterFleur(fleur);
    }
    @GetMapping("/afficheFleur")
    public List<Fleur> afficheFleur(){
        return fleurService.AfficheFleur();
    }

    @DeleteMapping("/supprimerfleur/{id}")
    public String supprimer (@PathVariable Integer id){
        return fleurService.suppfleur(id);
    }
    @PutMapping("/modifierFleur")
    public String modifierFleur(@RequestBody Fleur fleur){

        return fleurService.ModifierFleur(fleur.getIdFleur(),fleur);

    }
}
