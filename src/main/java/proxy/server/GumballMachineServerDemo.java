package proxy.server;

import state.context.GumballMachine;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineServerDemo {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine("park", 5);
    try {
      GumballMachineServer gumballMachineServer = new GumballMachineServer(gumballMachine);
//      Naming.rebind("gumballmachine", gumballMachineServer);
//      System.err.println("System is ready");

      // Instantiating the implementation class
//      ImplExample obj = new ImplExample();

      // Exporting the object of implementation class
      // (here we are exporting the remote object to the stub)
      GumballMachineRemote stub = (GumballMachineRemote) UnicastRemoteObject.exportObject(gumballMachineServer, 0);

      // Binding the remote object (stub) in the registry
      Registry registry = LocateRegistry.getRegistry();

      registry.rebind("gumballmachine", stub);
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
