/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Lignedevis;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface LignedevisHome extends Remote{
    public Lignedevis findById(String id) throws RemoteException;
    public boolean inserer(Lignedevis lignedevis) throws RemoteException;
    public List<Lignedevis> listLigneDevis () throws RemoteException;
    
}
