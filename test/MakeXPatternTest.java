import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Provides tests for the public facing displayPattern method on the MakeXPattern class.
 */
public class MakeXPatternTest {

  /**
   * Tests displaying a pattern of size one.
   */
  @Test
  public void displayXPatternSizeOne() {
    MakeXPattern sizeOne = new MakeXPattern(1);
    assertEquals(sizeOne.displayPattern(), "X");
  }

  /**
   * Tests displaying a pattern of size five.
   */
  @Test
  public void displayXPatternSizeFive() {
    MakeXPattern sizeFive = new MakeXPattern(5);
    assertEquals(sizeFive.displayPattern(), "XOOOX\n" +
            "OXOXO\n" +
            "OOXOO\n" +
            "OXOXO\n" +
            "XOOOX");
  }

  /**
   * Tests displaying a pattern of size two.
   */
  @Test(expected = IllegalArgumentException.class)
  public void displayXPatternSizeTwo() {
    MakeXPattern sizeTwo = new MakeXPattern(2);
  }

  /**
   * Tests displaying a pattern of size two.
   */
  @Test(expected = IllegalArgumentException.class)
  public void displayXPatternSizeNegative() {
    MakeXPattern sizeNegative = new MakeXPattern(-1);
  }

}