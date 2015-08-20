import java.time.LocalDateTime;
import java.util.ArrayList;

public class Phone{
  private static ArrayList<Phone> instances = new ArrayList<Phone>();

  private String mAreaCode;
  private String mNumber;
  private String mType;
  private int mId;

  public Phone (String areaCode, String number, String type) {
    mAreaCode = areaCode;
    mNumber = number;
    mType = type;
    instances.add(this);
    mId = instances.size();
  }

  public String getPhoneNumber() {
    return "(" + mAreaCode + ")" + mNumber;
  }

}
