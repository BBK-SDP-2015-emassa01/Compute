/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Esha
 */
public interface Compute extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;

    
    
}
