package FirstProject;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderImpl extends UnicastRemoteObject implements Adder {
    protected AdderImpl() throws RemoteException{
        super();

    }

    @Override
    public int add(int x, int y) throws RemoteException{
        return x + y;
    }
    }