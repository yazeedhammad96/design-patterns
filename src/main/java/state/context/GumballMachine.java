package state.context;

import state.states.State;
import state.states.impl.HasNoQuarterState;
import state.states.impl.HasQuarterState;
import state.states.impl.SoldOutState;
import state.states.impl.SoldState;

public class GumballMachine {
  State hasQuarter;
  State hasNoQuarter;
  State sold;
  State soldOut;
  State currentState;
  int initialCount;

  public GumballMachine(int initialCount) {
    this.hasQuarter = new HasQuarterState(this);
    this.hasNoQuarter = new HasNoQuarterState(this);
    this.sold = new SoldState(this);
    this.soldOut = new SoldOutState(this);
    currentState = soldOut;
    this.initialCount = initialCount;
    if (initialCount > 0) {
      setCurrentState(getHasNoQuarter());
    } else {
      setCurrentState(getSoldOut());
    }
  }


  public void insertQuarter() {
    getCurrentState().insertQuarter();
  }


  public void ejectQuarter() {
    getCurrentState().ejectQuarter();
  }


  public void turnCrank() {
    getCurrentState().turnCrank();
    getCurrentState().dispense();
  }

  public void releaseBall() {
    if (initialCount > 0) {
      initialCount--;
      System.out.println("A gum ball rolling out");
    }
  }

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  public void setInitialCount(int initialCount) {
    this.initialCount = initialCount;
  }

  public State getHasQuarter() {
    return hasQuarter;
  }

  public State getHasNoQuarter() {
    return hasNoQuarter;
  }

  public State getSold() {
    return sold;
  }

  public State getSoldOut() {
    return soldOut;
  }

  public State getCurrentState() {
    return currentState;
  }

  public int getInitialCount() {
    return initialCount;
  }

}
