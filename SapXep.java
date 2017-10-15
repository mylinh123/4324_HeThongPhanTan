import java.rmi.*;

public interface SapXep extends Remote
{
    public String getGreetingMessage(String args []) throws RemoteException;
}