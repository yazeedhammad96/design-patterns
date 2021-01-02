package state.states.impl;

import state.context.GumballMachine;
import state.states.State;

public class HasNoQuarterState implements State {
  GumballMachine gumballMachine;

  public HasNoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You inserted a quarter!");
    gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't ejectQuarter, you have not inserted a quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("You can't turnCrank, you have not inserted a quarter");

  }

  @Override
  public void dispense() {
    System.out.println("You can't dispense, you have not inserted a quarter");
  }
}
