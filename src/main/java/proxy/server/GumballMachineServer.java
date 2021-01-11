package proxy.server;

import state.context.GumballMachine;
import state.states.State;

import java.io.Serializable;
import java.rmi.RemoteException;

public class GumballMachineServer implements GumballMachineRemote, Serializable {
  private static final long serialVersionUID = 2L;
  GumballMachineRemote gumballMachine;


  public GumballMachineServer(GumballMachineRemote gumballMachine) throws RemoteException {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public String getLocation() throws RemoteException {
    return gumballMachine.getLocation();
  }

  @Override
  public State getState() throws RemoteException {
    return gumballMachine.getState();
  }

  @Override
  public int getCount() throws RemoteException {
    return gumballMachine.getCount();
  }
}
