/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.controller;

import gestion.trelux.metier.Personne;
import gestion.trelux.services.PersonneHome;
import gestion.trelux.utilitaire.Bibliotheque;
import gestion.trelux.utilitaire.SpringClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;

/**
 * FXML Controller class
 *
 * @author ACTIF
 */
public class ConnexionController implements Initializable {
    ApplicationContext context;
    PersonneHome personneHome;
    Personne personne;
    Bibliotheque biblio;
    @FXML
    private Button annuler;

    @FXML
    private PasswordField motPasse;

    @FXML
    private Button connexion;

    @FXML
    private TextField login;

    @FXML
    void seLoger(ActionEvent event) throws NotBoundException, MalformedURLException, RemoteException {
       String log=login.getText();
       String pwd=motPasse.getText();
       
        if (!(log.isEmpty()) && !(pwd.isEmpty())) {
            try {
                 personneHome=(PersonneHome)Naming.lookup("rmi://localhost:1099/homePersonne");
                personne = personneHome.connection(log, pwd);
                String profil = personne.getCategorie();
                if (profil.equals("client")) {
                    /**
                     * ***************
                     * les clients
                     */
                    biblio.loadWindow("/fxml/Client.fxml", "Client Page", event);
                }
                else if(profil.equals("admin"))
                {
                    biblio.loadWindow("/fxml/Administrateur.fxml", "Admi Page", event);
                }
                 else if(profil.equals("gerant"))
                {
                    biblio.loadWindow("/fxml/Gerant.fxml", "Admi Page", event);
                }
                  else if(profil.equals("fournisseur"))
                {
                    biblio.loadWindow("/fxml/Fournisseur.fxml", "Admi Page", event);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrecte");
                }

            } catch (NoResultException nre) {
                System.out.println("Erreur connexion " + nre);
                JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrecte");

            }

        }

    
       
    }

    @FXML
    void clickerAnnuler(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        context=SpringClass.getContext();
        personne=context.getBean("personne",Personne.class);
        biblio=context.getBean("bibliotheque",Bibliotheque.class);
        
    } 
    
    
}
