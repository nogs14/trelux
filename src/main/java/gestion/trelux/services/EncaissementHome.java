/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Ecaissement;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface EncaissementHome extends Remote{
    public Ecaissement findById(String id) throws RemoteException;
    public boolean inserer(Ecaissement encaissement) throws RemoteException;
    public List<Ecaissement> listEncaissement () throws RemoteException;
    
}
