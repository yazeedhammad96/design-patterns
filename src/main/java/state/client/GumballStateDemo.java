package state.client;

import state.context.GumballMachine;

public class GumballStateDemo {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine("park", 2);
    gumballMachine.insertQuarter();
    gumballMachine.insertQuarter();
    gumballMachine.ejectQuarter();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.ejectQuarter();
    gumballMachine.turnCrank();

    gumballMachine.insertQuarter();
    gumballMachine.insertQuarter();
    gumballMachine.ejectQuarter();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.ejectQuarter();
    gumballMachine.turnCrank();

  }
}