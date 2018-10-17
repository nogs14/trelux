/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Produit;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface ProduitHome extends Remote {
    public Produit findById(String id) throws RemoteException;
    public boolean inserer(Produit produit) throws RemoteException;
    public List<Produit> listProduit () throws RemoteException;
    
}
