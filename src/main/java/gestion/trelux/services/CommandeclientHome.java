/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Commandeclient;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface CommandeclientHome extends Remote{
    public Commandeclient findById(String id) throws RemoteException;
    public boolean inserer(Commandeclient commandeClient) throws RemoteException;
    public List<Commandeclient> listFamilleBoisson () throws RemoteException;
    
}
