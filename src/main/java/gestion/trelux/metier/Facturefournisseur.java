package gestion.trelux.metier;
// Generated 9 juin 2018 15:16:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Facturefournisseur generated by hbm2java
 */
public class Facturefournisseur  implements java.io.Serializable {


     private String codefacture;
     private Commandestock commandestock;
     private String datefacture;
     private Set fournisseurs = new HashSet(0);

    public Facturefournisseur() {
    }

	
    public Facturefournisseur(String codefacture) {
        this.codefacture = codefacture;
    }
    public Facturefournisseur(String codefacture, Commandestock commandestock, String datefacture, Set fournisseurs) {
       this.codefacture = codefacture;
       this.commandestock = commandestock;
       this.datefacture = datefacture;
       this.fournisseurs = fournisseurs;
    }
   
    public String getCodefacture() {
        return this.codefacture;
    }
    
    public void setCodefacture(String codefacture) {
        this.codefacture = codefacture;
    }
    public Commandestock getCommandestock() {
        return this.commandestock;
    }
    
    public void setCommandestock(Commandestock commandestock) {
        this.commandestock = commandestock;
    }
    public String getDatefacture() {
        return this.datefacture;
    }
    
    public void setDatefacture(String datefacture) {
        this.datefacture = datefacture;
    }
    public Set getFournisseurs() {
        return this.fournisseurs;
    }
    
    public void setFournisseurs(Set fournisseurs) {
        this.fournisseurs = fournisseurs;
    }




}


