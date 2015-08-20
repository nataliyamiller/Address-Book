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

  @Test
  public void getPhones_initiallyReturnsEmptyArrayList() {
    Contact testContact = new Contact ("Michael", "Smith");
    assertTrue(testContact.getPhones() instanceof ArrayList);
  }

  @Test
  public void all_returnsAllInstancesOfPhone_true() {
    Contact firstContact = new Contact("Michael", "Smith");
    Contact secondContact = new Contact("Leslie", "Dow");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
  }

  @Test
  public void clear_removesAllContactInstancesFromMemory() {
    Contact testContact = new Contact("Michael", "Smith");
    testContact.clear();
    assertTrue(testContact.all().size() == 0);
  }

}
