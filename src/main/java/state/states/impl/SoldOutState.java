package state.states.impl;

import state.context.GumballMachine;
import state.states.State;

public class SoldOutState implements State {
  private static final long serialVersionUID = 4L;
  transient GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert a quarter!, we already sold out");

  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't ejectQuarter!, we already sold out");

  }

  @Override
  public void turnCrank() {
    System.out.println("You can't turnCrank!, we already sold out");

  }

  @Override
  public void dispense() {
    System.out.println("You can't dispense!, we already sold out");

  }
}
