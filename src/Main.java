import java.io.InputStreamReader;

/**
 * Main class for making patterns.
 */
public class Main {

  public static void main(String[] args) {
    MakePatternController controller = new MakePatternController(
            new InputStreamReader(System.in),
            System.out
    );
    try {
      controller.makeXPattern();
    } catch (IllegalStateException e) {
      e.printStackTrace();
    }
  }
}
