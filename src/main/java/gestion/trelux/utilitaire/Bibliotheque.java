/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.utilitaire;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Optional;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.util.Duration;
import javax.imageio.ImageIO;
import org.controlsfx.control.Notifications;

/**
 *
 * @author ACTIF
 */
public class Bibliotheque {
    public String buttonRadio(RadioButton f,RadioButton m)
    {  String sexe=null;
        if(f.isSelected())
	{
            m.setSelected(false);
            sexe =  f.getText();
	}
	else if(m.isSelected())
	{
            f.setSelected(false);
            sexe =  m.getText();
	}
        return sexe;
    }
    
    public String chargingAndMovingPicture(ImageView photo, String nom) throws IOException 
    {
         BufferedImage image;
       FileChooser fileChooser = new FileChooser();
       fileChooser.getExtensionFilters().addAll(
    	    	new ExtensionFilter("*.JPG", "*.jpg"),
    	    	new ExtensionFilter("*.PNG", "*.png"),
    	    	new ExtensionFilter("*.GIF", "*.gif"));
       File file = fileChooser.showOpenDialog(photo.getScene().getWindow());
       
       String fic = file.getAbsolutePath();
       String recup = fic.toString().substring(fic.length()-3,fic.length());
       
       //URL url = new URL(fic);
       image = ImageIO.read(file);
       int num = (int) (Math.random()*500000);
       String nomImage = nom+"_"+num+"."+recup;
       ImageIO.write(image, recup, new File(nomImage));
		 
		// --> file:/C:/MyImages/myphoto.jpg
		String localUrl = null;
		try 
		{
			localUrl = file.toURI().toURL().toString();
		} 
		catch (MalformedURLException e) 
		{
			System.out.println("Chemin d'acces a un probleme!");
		}
		Image image2 = new Image(localUrl);
		photo.setImage(image2);
	    return nomImage;
	}
    public void loadWindow (String loc , String title , ActionEvent event){
            try {
                Parent parent = FXMLLoader.load(getClass().getResource(loc));
                Stage stage = new Stage(StageStyle.DECORATED);
                stage.setTitle(title);
//                stage.initStyle(StageStyle.UNDECORATED);
//                stage.setMaximized(true);
                stage.setScene(new Scene(parent));
                stage.show();
                //((Node)(event.getSource())).getScene().getWindow().hide();
                stage.setOnCloseRequest(e -> closeWindowRequest(e) );
            } catch (IOException ex) {
            ex.printStackTrace();
                System.out.println(ex.getMessage());                    
//System.out.println("Impossible de charger la fenetre");
            }
        }
    public Boolean closeWindowButton(ActionEvent event){
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog with Custom Actions");
            alert.setHeaderText("Look, a Confirmation Dialog with Custom Actions");
            alert.setContentText("Choose your option.");
            ButtonType buttonTypeY = new ButtonType("OUI" , ButtonBar.ButtonData.YES);
            ButtonType buttonTypeN = new ButtonType("NON" , ButtonBar.ButtonData.NO);
            ButtonType buttonTypeC = new ButtonType("Annuler", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(buttonTypeY, buttonTypeN, buttonTypeC);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == buttonTypeY){
                 stage.close();
                 return true;
              } else if (result.get() == buttonTypeN) {
                 stage.close();
                 return true;
              } else if (result.get() == buttonTypeC) {
               alert.hide();
               return false;
              }
            return false;
        }
     public void closeWindowRequest(WindowEvent event){
            event.consume();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog with Custom Actions");
            alert.setHeaderText("Look, a Confirmation Dialog with Custom Actions");
            alert.setContentText("Choose your option.");
            ButtonType buttonTypeY = new ButtonType("OUI" , ButtonBar.ButtonData.YES);
            ButtonType buttonTypeN = new ButtonType("NON" , ButtonBar.ButtonData.NO);
            ButtonType buttonTypeC = new ButtonType("Annuler", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(buttonTypeY, buttonTypeN, buttonTypeC);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == buttonTypeY){
                 Platform.exit();
                // HibernateUtil.closeSession();
              } else if (result.get() == buttonTypeN) {
                 Platform.exit();
                // HibernateUtil.closeSession();
              } else if (result.get() == buttonTypeC) {
               alert.hide();
              }
        }
      public void notification(String titre, String message , String image){
                                     Image img = new Image(image);
                         Notifications notificationBuilder = Notifications.create()
                        .title(titre)
                        .text(message)
                        .graphic(new ImageView(img))
                        .hideAfter(Duration.seconds(2))
                        .position(Pos.TOP_LEFT);
                        notificationBuilder.show();
        }
}
