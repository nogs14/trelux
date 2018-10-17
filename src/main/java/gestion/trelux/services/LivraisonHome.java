/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Livraison;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface LivraisonHome extends Remote{
    public Livraison findById(String id) throws RemoteException;
    public boolean inserer(Livraison livraison) throws RemoteException;
    public List<Livraison> listLivraison () throws RemoteException;
    
}
