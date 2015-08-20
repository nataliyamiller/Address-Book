import java.util.ArrayList;

public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName;
  private String mLastName;
  private int mId;
  // private int mId;
  // private ArrayList<Task> mTasks = new ArrayList<Task>();

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

  public static ArrayList<Contact> all() {
    return instances;
  }

}
