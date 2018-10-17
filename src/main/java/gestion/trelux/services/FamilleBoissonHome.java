/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Familleboisson;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface FamilleBoissonHome extends Remote{
    public Familleboisson findById(String id) throws RemoteException;
    public boolean inserer(Familleboisson fammilleB) throws RemoteException;
    public List<Familleboisson> listFamilleBoisson () throws RemoteException;
    
}
