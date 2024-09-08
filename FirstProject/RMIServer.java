package FirstProject;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            Adder adder = new AdderImpl();
            Naming.rebind("rmi://localhost/AdderS", adder);
            System.out.println("RMI Server is running...");

            }
            catch (Exception e){
                System.out.println("server exception: " + e.toString());
                e.printStackTrace();
            }
        }
    }
    

