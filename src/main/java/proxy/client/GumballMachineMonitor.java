package proxy.client;

import proxy.server.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMachineMonitor {
  GumballMachineRemote gumballMachineRemote;

  public GumballMachineMonitor(GumballMachineRemote gumballMachineRemote) {
    this.gumballMachineRemote = gumballMachineRemote;

  }
  public void report() throws RemoteException {
    System.out.println(gumballMachineRemote.getCount());
    System.out.println(gumballMachineRemote.getLocation());
    System.out.println(gumballMachineRemote.getState());
  }
}
