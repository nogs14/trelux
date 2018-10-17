/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author ACTIF
 */
public class Main extends Application{
  private Stage primaryStage;
  private BorderPane mainview;	

    public static void main(String args[])
	{
		launch(args);
		
	}

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage=primaryStage;
        primaryStage.setTitle("TreluxCom");
        initialisation();
    }
    public void initialisation()
    {
        try{
             Parent adam=FXMLLoader.load(Main.class.getResource("/fxml/Accueil1.fxml"));
              
              Scene scene=new Scene(adam);
              primaryStage.setScene(scene);
              scene.setFill(Color.TRANSPARENT);
              primaryStage.show();
        }
        catch(Exception e){e.printStackTrace();}
       System.out.println("ca marche"); 
    }
    
}
