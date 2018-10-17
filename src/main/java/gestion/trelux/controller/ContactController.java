/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.controller;

import gestion.trelux.utilitaire.Bibliotheque;
import gestion.trelux.utilitaire.SpringClass;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.context.ApplicationContext;

/**
 * FXML Controller class
 *
 * @author ACTIF
 */
public class ContactController implements Initializable {
    Bibliotheque biblio;
    ApplicationContext context;
    
      @FXML
    private Button retour;
       @FXML
    void clickerRetour(ActionEvent event) {
    biblio.loadWindow("/fxml/Accueil.fxml","Page d'accueil", event);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      // context = SpringClass.getContext();
       biblio=new Bibliotheque();
    }    
    
}
