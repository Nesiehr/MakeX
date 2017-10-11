import java.util.ArrayList;

/**
 * Produces an X pattern of variable size.
 */
public class MakeXPattern implements MakePattern {

  private final ArrayList<ArrayList<Mark>> pattern;

  /**
   * Creates an X pattern with the given size.
   * @param size - width and height of the pattern
   * @throws IllegalArgumentException - if size is negative or an even number
   */
  public MakeXPattern(int size) throws IllegalArgumentException {

    if (size % 2 == 0 || size <= 0) {
      throw new IllegalArgumentException("Invalid Size.");
    }

    this.pattern = new ArrayList<>();

    int center = ((size - 1) / 2);

    for (int x = 0; x < size; x++) {
      this.pattern.add(new ArrayList<>());
      for (int y = 0; y < size; y++) {
        if (Math.abs(center - x) + center == y) {
          this.pattern.get(x).add(Mark.X);
        } else if (Math.abs(Math.abs(center - x) - center) == y) {
          this.pattern.get(x).add(Mark.X);
        } else {
          this.pattern.get(x).add(Mark.O);
        }
      }
    }

  }

  @Override
  public String displayPattern() {
    String pattern = "";
    for (int i = 0; i < this.pattern.size(); i++) {
      for (Mark m : this.pattern.get(i)) {
        pattern = pattern.concat(m.getMark());
      }
      if (i < this.pattern.size() - 1) {
        pattern = pattern.concat("\n");
      }
    }
    return pattern;
  }

}