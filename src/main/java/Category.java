import java.util.ArrayList;

public class Category {
  private static ArrayList<Category> instances = new ArrayList<Category>();

  private String mName;
  private int mId;

  public Category (String name) {
    mName = name;
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public ArrayList<Category> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

}
