/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.services;

import gestion.trelux.metier.Calendrierservice;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ACTIF
 */
public interface CalendrierserviceHome extends Remote{
    public Calendrierservice findById(String id) throws RemoteException;
    public boolean inserer(Calendrierservice calendrier) throws RemoteException;
    public List<Calendrierservice> listCalendrier () throws RemoteException;
    
}
