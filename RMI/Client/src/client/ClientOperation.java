package client;
import model.Contact;
import rmiinterface.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClientOperation {
    private static RMIInterface look_up;

    public static void main(String[] args)
            throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMIInterface) Naming.lookup("//85.187.158.121:1099/MyServer");
        //String txt = JOptionPane.showInputDialog("What is your name?");

        Contact response = look_up.getContact();
        JOptionPane.showMessageDialog(null, response.getName() + " " + response.getTelefone());

    }
}
