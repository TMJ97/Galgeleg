package galgeleg;

import java.rmi.Naming;

public class GalgelegServer {
    public static void main(String[] arg) throws Exception {
        //Som set i Kontoserver.java (Javabog-oop, author: Jacob Nordfalk)
        java.rmi.registry.LocateRegistry.createRegistry(1098);
        GalgelegI spil = new Galgelogik();
        Naming.rebind("rmi://localhost:1098/galgelegtjeneste", spil);
        System.out.println("Galgelegtjeneste registreret.");
    }
}
