/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Jour;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface JourHome extends Remote{
    public Jour findById(String id) throws RemoteException;
    public boolean inserer(Jour jour) throws RemoteException;
    public List<Jour> listJour () throws RemoteException;
    
}
