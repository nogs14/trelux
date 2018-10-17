/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Detailsmessage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface DetailsmessageHome extends Remote{
    public Detailsmessage findById(String id) throws RemoteException;
    public boolean inserer(Detailsmessage detailMessage) throws RemoteException;
    public List<Detailsmessage> listDetailMessage () throws RemoteException;
    
}
