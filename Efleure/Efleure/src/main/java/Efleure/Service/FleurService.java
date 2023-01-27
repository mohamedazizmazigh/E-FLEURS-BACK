package Efleure.Service;

import Efleure.Entity.Fleur;
import Efleure.Repository.FleurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FleurService {
    @Autowired
    FleurRepo fleurRepo;

    public Fleur AjouterFleur(Fleur fleur){
        return fleurRepo.save(fleur);
    }

    public List<Fleur> AfficheFleur(){
        return fleurRepo.findAll();
    }

    public String suppfleur(Integer id){
        fleurRepo.deleteById(id) ;
            return "fleur supprime";


    }
    public String ModifierFleur(Integer id, Fleur fleur){
               fleurRepo.findById(id)
                      .map(f-> {
                          f.setNomFleur(fleur.getNomFleur());
                          f.setDescription(fleur.getDescription());
                          return fleurRepo.save(f);
                      }).orElseThrow(()->new RuntimeException("fleur service"));

    return "ok";}
}
