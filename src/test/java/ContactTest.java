import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void newContact_instantiatesCorrectly() {
    Contact testContact = new Contact ("Michael", "Smith");
    assertEquals(true, testContact instanceof Contact);
  }

  @Test
  public void getId_returnsContactId() {
    Contact testContact = new Contact ("Michael", "Smith");
    assertTrue(testContact.all().size() == testContact.getId());
  }

  

}
