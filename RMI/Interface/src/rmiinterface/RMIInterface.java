package rmiinterface;
import model.Contact;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by project on 26/04/2021
 */

public interface RMIInterface extends Remote{
    public String helloTo(String name) throws RemoteException;

    public Contact getContact() throws  RemoteException;
}
