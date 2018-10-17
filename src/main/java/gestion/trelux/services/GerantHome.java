/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Gerant;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface GerantHome extends Remote{
    public Gerant findById(String id) throws RemoteException;
    public boolean inserer(Gerant gerant) throws RemoteException;
    public List<Gerant> listPersonne () throws RemoteException;
    
}
