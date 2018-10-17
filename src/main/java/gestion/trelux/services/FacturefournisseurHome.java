/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Facturefournisseur;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface FacturefournisseurHome extends Remote{
    public Facturefournisseur findById(String id) throws RemoteException;
    public boolean inserer(Facturefournisseur factureFour) throws RemoteException;
    public List<Facturefournisseur> listFactureFour () throws RemoteException;
        
}
