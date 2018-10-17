/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Personne;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface PersonneHome extends Remote{
    public Personne findById(String id) throws RemoteException;
    public boolean inserer(Personne personne) throws RemoteException;
    public List<Personne> listPersonne () throws RemoteException;
    public Personne connection(String loginfield, String passwordfield);
}
