package rmi;

public class ImplExample implements Hello {

   public static final String MESSAGE = "This is an example RMI program";

   // Implementing the interface method
   public String printMsg() {
      System.out.println(MESSAGE);
      return MESSAGE;
   }  
}
