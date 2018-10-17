/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Conditionnement;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface ConditionnementHome extends Remote{
    public Conditionnement findById(String id) throws RemoteException;
    public boolean inserer(Conditionnement conditionnement) throws RemoteException;
    public List<Conditionnement> listConditionnement() throws RemoteException;
    
}
