import java.util.ArrayList;

public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName;
  private String mLastName;
  private int mId;
  private ArrayList<Phone> mPhones = new ArrayList<Phone>();

  public Contact (String firstName, String lastName) {
    mFirstName = firstName;
    mLastName = mLastName;
    instances.add(this);
    mId = instances.size();
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public int getId() {
    return mId;
  }

  public ArrayList<Phone> getPhones() {
    return mPhones;
  }

  public void addPhone(Phone phoneToAdd) {
    mPhones.add(phoneToAdd);
  }

  public static ArrayList<Contact> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public static Contact find(int id) {
    try {
      return instances.get(id-1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
