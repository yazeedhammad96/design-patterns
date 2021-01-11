package state.states.impl;

import state.context.GumballMachine;
import state.states.State;

public class HasQuarterState implements State {
  private static final long serialVersionUID = 3L;
  transient GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You already have inserted a quarter!");

  }

  @Override
  public void ejectQuarter() {
    System.out.println("Ejecting a quarter");
    gumballMachine.setCurrentState(gumballMachine.getHasNoQuarter());
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning a crank, enjoy your gum!");
    gumballMachine.setCurrentState(gumballMachine.getSold());
  }

  @Override
  public void dispense() {
    System.out.println("No Gumball dispense");
  }
}
