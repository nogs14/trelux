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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;

/**
 * FXML Controller class
 *
 * @author ACTIF
 */
public class AccueilClientController implements Initializable {
     ApplicationContext context;
     Bibliotheque bibliotheque,loader;
     private Stage primaryStage;
  @FXML
    private Button btnconnecter;

    @FXML
    private Button btnInscription;

    @FXML
    void seConnecter(ActionEvent event) {
     loader.loadWindow("/fxml/Connexion.fxml","Page de connexion", event);
    }

    @FXML
    void sInscrire(ActionEvent event) {
       loader.loadWindow("/fxml/Inscription1.fxml","Page d'inscription", event);
    }

     @FXML
    void quitter(ActionEvent event) {
    System.exit(0);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      context=SpringClass.getContext();
      loader=context.getBean("bibliotheque",Bibliotheque.class);
    }    
    
}
