/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Livreur;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface LivreurHome extends Remote{
    public Livreur findById(String id) throws RemoteException;
    public boolean inserer(Livreur livreur) throws RemoteException;
    public List<Livreur> listLivreur () throws RemoteException;
    
}
