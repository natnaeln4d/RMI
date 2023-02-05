import java.net.MalformedURLException;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Myserver {
    public static void main(String[] args) throws RemoteException, MalformedURLException, ConnectException {
        Adder stub=new AddRemoter();
        Naming.rebind("rmi://localhost:8000/son",stub);
        System.out.println("server\n" +
                "Deo");


    }
}
