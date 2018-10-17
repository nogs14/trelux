/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Privilege;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface PrivilegeHome extends Remote{
    public Privilege findById(String id) throws RemoteException;
    public boolean inserer(Privilege privilege) throws RemoteException;
    public List<Privilege> listPrivilege () throws RemoteException;
    
}
