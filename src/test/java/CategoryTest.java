import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

  @Test
  public void getName_returnsName_true() {
    Category testCategory = new Category("Home");
    assertEquals("Home", testCategory.getName());
  }

  @Test
  public void getId_returnsCategoryId() {
    Category testCategory = new Category("Home");
    assertTrue(testCategory.all().size() == testCategory.getId());
  }

  @Test
  public void getTasks_initiallyReturnsEmptyArrayList() {
    Category testCategory = new Category("Home");
    assertTrue(testCategory.getTasks() instanceof ArrayList);
  }

  @Test
  public void all_returnsAllInstancesOfTask_true() {
    Category firstCategory = new Category("Home");
    Category secondCategory = new Category("Garden");
    assertTrue(Category.all().contains(firstCategory));
    assertTrue(Category.all().contains(secondCategory));
  }
}
