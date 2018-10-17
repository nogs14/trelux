/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.controller;

import gestion.trelux.metier.Client;
import gestion.trelux.metier.ClientId;
import gestion.trelux.metier.Personne;
import gestion.trelux.services.ClientHome;
import gestion.trelux.utilitaire.Bibliotheque;
import gestion.trelux.utilitaire.SpringClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import org.springframework.context.ApplicationContext;

/**
 * FXML Controller class
 *
 * @author ACTIF
 */
public class Inscription1Controller implements Initializable {
     ApplicationContext context;
    ClientHome homeclient;
    Client client;
   Personne personne;
   ClientId clientID;
   Bibliotheque biblio;
   String genre="masculin";

      @FXML
    private TextField txtPrenom;

    @FXML
    private TextField txtLieu;

    @FXML
    private RadioButton masculin;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtTel;

    @FXML
    private TextField txtEmail;

    @FXML
    private ToggleGroup sexe;

    @FXML
    private TextField txtAdresse;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtMotPasse;

    @FXML
    private TextField txtCin;

    @FXML
    private RadioButton feminin;

    @FXML
    private TextField txtNom;

    @FXML
    void choisirSexe(ActionEvent event) {
       genre=biblio.buttonRadio(feminin,masculin);
    }

   
    @FXML
    void inscription(ActionEvent event) {
        if(txtNom.getText().equals("")||txtPrenom.getText().equals("")||txtCin.getText().equals("")||txtDate.getText().equals("")||txtLieu.getText().equals(""))
        {
          biblio.notification("Attention!!","Vous devez remplir tous les champs","/images/wrong.png");  
        }
        else
        {
            try{
                personne.setIdpersonne(txtCin.getText());
                personne.setPrenom(txtPrenom.getText());
                personne.setNom(txtNom.getText());
                personne.setDatenaiss(txtDate.getText());
                personne.setLieunaiss(txtLieu.getText());
                personne.setAdresse(txtAdresse.getText());
                personne.setLogin(txtLogin.getText());
                personne.setMotpasse(txtMotPasse.getText());
                personne.setEmail(txtEmail.getText());
                personne.setTelephone(txtTel.getText());
                personne.setSexe(genre);
                personne.setCategorie("client");
                client.setPersonne(personne);
                client.setCategorie("categorie");
                client.setVip("vip");
                client.setLabel(0);
                clientID.setCodeclient("client1");
                clientID.setIdpersonne(txtCin.getText());
                client.setId(clientID);
                try{
                     homeclient=(ClientHome)Naming.lookup("rmi://localhost:1099/homeClient");
                     homeclient.inserer(client);
                     biblio.loadWindow("/fxml/Connexion.fxml","Page de connexion", event);
                }
              catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Inscription1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            }
            catch(Exception e){}
        }

    }

    @FXML
    void actualiser(ActionEvent event) {
      txtNom.setText("");
      txtCin.setText("");
      txtPrenom.setText("");
      txtAdresse.setText("");
      txtDate.setText("");
      txtLieu.setText("");
      txtLogin.setText("");
      txtMotPasse.setText("");
      txtTel.setText("");
      txtEmail.setText("");
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         context=SpringClass.getContext();
       personne=context.getBean("personne",Personne.class);
       client=context.getBean("client",Client.class);
       clientID=context.getBean("clientId",ClientId.class);
       biblio=context.getBean("bibliotheque",Bibliotheque.class);
       
    }
       
    
}
