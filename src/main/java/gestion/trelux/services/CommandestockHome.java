/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Commandestock;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface CommandestockHome extends Remote{
    public Commandestock findById(String id) throws RemoteException;
    public boolean inserer(Commandestock commandeStock) throws RemoteException;
    public List<Commandestock> listCommandeStock() throws RemoteException;
    
}
