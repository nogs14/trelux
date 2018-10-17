/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Factureclient;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface FactureclientHome extends Remote{
    public Factureclient findById(String id) throws RemoteException;
    public boolean inserer(Factureclient factureClient) throws RemoteException;
    public List<Factureclient> listFactureClient () throws RemoteException;
    
}
