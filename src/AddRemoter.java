import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddRemoter extends UnicastRemoteObject implements Adder {
    @Override
    public int adder(int x, int y) throws RemoteException {
        return x+y;
    }
    AddRemoter() throws RemoteException {
        super();
    }
}
