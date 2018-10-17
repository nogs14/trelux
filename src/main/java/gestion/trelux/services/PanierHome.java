/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Panier;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface PanierHome  extends Remote{
    public Panier findById(String id) throws RemoteException;
    public boolean inserer(Panier personne) throws RemoteException;
    public List<Panier> listPanier () throws RemoteException;
    
}
