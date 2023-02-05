import java.net.MalformedURLException;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Myclient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException, ConnectException, java.net.ConnectException {
        Adder stub=(Adder) Naming.lookup("rmi://localhost:5000/son");
        System.out.println(stub.adder(2,6));

    }
}
