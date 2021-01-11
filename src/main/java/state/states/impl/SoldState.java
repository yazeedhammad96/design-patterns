package state.states.impl;

import state.context.GumballMachine;
import state.states.State;

public class SoldState implements State {
  private static final long serialVersionUID = 5L;
  transient GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait we already giving u a gumball");

  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't eject, u already have turned the crank");
  }

  @Override
  public void turnCrank() {
    System.out.println("You can't turnCrank, u already have turned the crank");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getInitialCount() > 0) {
      gumballMachine.setCurrentState(gumballMachine.getHasNoQuarter());
      System.out.println("Insert a quarter");
    } else {
      gumballMachine.setCurrentState(gumballMachine.getSoldOut());
      System.out.println("We don't have any gums any more");
    }
  }
}
