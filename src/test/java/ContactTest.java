import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void newContact_instantiatesCorrectly() {
    Contact testContact = new Contact ("Michael", "Smith");
    assertEquals(true, testContact instanceof Contact);
  }

}
