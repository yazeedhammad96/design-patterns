package proxy.server;

import state.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
  public String getLocation()  throws RemoteException;
  public State getState()  throws RemoteException;
  public int getCount()  throws RemoteException;
}
