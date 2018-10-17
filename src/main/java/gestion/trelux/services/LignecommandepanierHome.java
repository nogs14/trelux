/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Lignecommandepanier;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface LignecommandepanierHome extends Remote{
    public Lignecommandepanier findById(String id) throws RemoteException;
    public boolean inserer(Lignecommandepanier lignepanier) throws RemoteException;
    public List<Lignecommandepanier> listLignePanier () throws RemoteException;
}