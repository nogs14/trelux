package gestion.trelux.metier;
// Generated 9 juin 2018 15:16:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Employe generated by hbm2java
 */
public class Employe  implements java.io.Serializable {


     private EmployeId id;
     private Personne personne;
     private Set caissiers = new HashSet(0);
     private Set calendrierservices = new HashSet(0);
     private Set livreurs = new HashSet(0);
     private Set gerants = new HashSet(0);

    public Employe() {
    }

	
    public Employe(EmployeId id, Personne personne) {
        this.id = id;
        this.personne = personne;
    }
    public Employe(EmployeId id, Personne personne, Set caissiers, Set calendrierservices, Set livreurs, Set gerants) {
       this.id = id;
       this.personne = personne;
       this.caissiers = caissiers;
       this.calendrierservices = calendrierservices;
       this.livreurs = livreurs;
       this.gerants = gerants;
    }
   
    public EmployeId getId() {
        return this.id;
    }
    
    public void setId(EmployeId id) {
        this.id = id;
    }
    public Personne getPersonne() {
        return this.personne;
    }
    
    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    public Set getCaissiers() {
        return this.caissiers;
    }
    
    public void setCaissiers(Set caissiers) {
        this.caissiers = caissiers;
    }
    public Set getCalendrierservices() {
        return this.calendrierservices;
    }
    
    public void setCalendrierservices(Set calendrierservices) {
        this.calendrierservices = calendrierservices;
    }
    public Set getLivreurs() {
        return this.livreurs;
    }
    
    public void setLivreurs(Set livreurs) {
        this.livreurs = livreurs;
    }
    public Set getGerants() {
        return this.gerants;
    }
    
    public void setGerants(Set gerants) {
        this.gerants = gerants;
    }




}

