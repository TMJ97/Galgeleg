package galgeleg;

public interface GalgelegI extends java.rmi.Remote {
    void nulstil() throws java.rmi.RemoteException;

    void logStatus() throws java.rmi.RemoteException;

    void gætBogstav(String bogstav) throws java.rmi.RemoteException;

    int getAntalForkerteBogstaver() throws java.rmi.RemoteException;

    String getSynligtOrd() throws java.rmi.RemoteException;

    boolean erSpilletSlut() throws java.rmi.RemoteException;

    boolean erSpilletTabt() throws java.rmi.RemoteException;

    boolean erSpilletVundet() throws java.rmi.RemoteException;
}
