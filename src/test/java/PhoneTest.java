import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Phone_InstantiatesCorrectly_true() {
    Phone testPhone = new Phone("543", "9715455", "cell");
    assertEquals(true, testPhone instanceof Phone);
  }

  @Test
  public void Phone_returnsPhoneNumberFormatted() {
    Phone testPhone = new Phone("543", "9715455", "cell");
    assertEquals("(543)9715455", testPhone.getPhoneNumber());
  }

}
