/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Devis;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface DevisHome extends Remote{
    public Devis findById(String id) throws RemoteException;
    public boolean inserer(Devis devis) throws RemoteException;
    public List<Devis> listDevis() throws RemoteException;
    
}
