import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;
public class SapXepImplementation extends UnicastRemoteObject
        implements SapXep {

        

    public SapXepImplementation() throws RemoteException {
        //There is no action need in this moment.
    }
    
    @Override
    public String getGreetingMessage(String args[]) throws RemoteException {
       String s="";
      Arrays.sort(args);
        for(String arg : args )
        {
            
        	 s= s + arg+" ";
        }   
        return s;
    }
}
