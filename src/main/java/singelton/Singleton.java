package singelton;

import java.io.Serializable;

public final class Singleton implements Serializable {

  private static final long serialVersionUID = -7604766932017737115L;

  // The field must be declared volatile so that double check lock would work
  // correctly.
  private static volatile Singleton instance;

  private Singleton() {

  }

  public static Singleton getInstance() {
    // The approach taken here is called double-checked locking (DCL). It
    // exists to prevent race condition between multiple threads that may
    // attempt to get singleton instance at the same time, creating separate
    // instances as a result.
    //
    // It may seem that having the `result` variable here is completely
    // pointless. There is, however, a very important caveat when
    // implementing double-checked locking in Java, which is solved by
    // introducing this local variable.

    Singleton result = instance;
    if (result != null) {
      return result;
    }
    synchronized (Singleton.class) {
      if (instance == null) {
        instance = new Singleton();
      }
      return instance;
    }
  }

  /**
   * This implemented method could help in case of Serialization/Deserialization of a Singleton class.
   * This method is being called when preparing the deserialized object before returning it to the caller.
   * It has nothing to do with the reflection API.
   */

  protected Object readResolve() {
    return getInstance();
  }
}