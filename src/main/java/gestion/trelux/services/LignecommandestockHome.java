/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Lignecommandestock;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface LignecommandestockHome extends Remote{
    public Lignecommandestock findById(String id) throws RemoteException;
    public boolean inserer(Lignecommandestock ligneCommande) throws RemoteException;
    public List<Lignecommandestock> listLigneCommande () throws RemoteException;
    
}