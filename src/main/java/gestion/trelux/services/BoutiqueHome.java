/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Boutique;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface BoutiqueHome extends Remote{
    public Boutique findById(String id) throws RemoteException;
    public boolean inserer(Boutique boutique) throws RemoteException;
    public List<Boutique> listBoutique () throws RemoteException;
    
}
