/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Inventaire;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface InventaireHome extends Remote{
    public Inventaire findById(String id) throws RemoteException;
    public boolean inserer(Inventaire inventaire) throws RemoteException;
    public List<Inventaire> listInventaire() throws RemoteException;
    
}
