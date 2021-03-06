package gestion.trelux.metier;
// Generated 9 juin 2018 15:16:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Livreur generated by hbm2java
 */
public class Livreur  implements java.io.Serializable {


     private LivreurId id;
     private Employe employe;
     private String disponibilte;
     private Set livraisons = new HashSet(0);

    public Livreur() {
    }

	
    public Livreur(LivreurId id, Employe employe) {
        this.id = id;
        this.employe = employe;
    }
    public Livreur(LivreurId id, Employe employe, String disponibilte, Set livraisons) {
       this.id = id;
       this.employe = employe;
       this.disponibilte = disponibilte;
       this.livraisons = livraisons;
    }
   
    public LivreurId getId() {
        return this.id;
    }
    
    public void setId(LivreurId id) {
        this.id = id;
    }
    public Employe getEmploye() {
        return this.employe;
    }
    
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    public String getDisponibilte() {
        return this.disponibilte;
    }
    
    public void setDisponibilte(String disponibilte) {
        this.disponibilte = disponibilte;
    }
    public Set getLivraisons() {
        return this.livraisons;
    }
    
    public void setLivraisons(Set livraisons) {
        this.livraisons = livraisons;
    }




}


