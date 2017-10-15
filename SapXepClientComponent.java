import java.rmi.*;

public class SapXepClientComponent 
{
    private static final String host = "localhost";

    public static void main(String[] args) 
    {
        try 
        {
            //We obtain a reference to the object from the registry and next,
            //it will be typecasted into the most appropiate type.
            SapXep greeting_message = (SapXep) Naming.lookup("rmi://" 
                    + host + "/Hello");

            //Next, we will use the above reference to invoke the remote
            //object method.
            System.out.println("Message received: " + 
                    greeting_message.getGreetingMessage(args));
        } 
        catch (ConnectException conEx) 
        {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
