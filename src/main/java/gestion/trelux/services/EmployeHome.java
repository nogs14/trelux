/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Employe;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface EmployeHome extends Remote{
    public Employe findById(String id) throws RemoteException;
    public boolean inserer(Employe employe) throws RemoteException;
    public List<Employe> listEmploye () throws RemoteException;
    
}
