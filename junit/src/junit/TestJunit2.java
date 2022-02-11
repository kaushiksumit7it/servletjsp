package junit;

import org.junit.Test;

import com.javatpoint.logic.MessageUtil;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
    //  message = "Hi!" + "Robert";
      message = "hello";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
