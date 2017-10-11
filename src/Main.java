import java.io.InputStreamReader;

/**
 *
 */
public class Main {

  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    MakePatternController controller = new MakePatternController(
            new InputStreamReader(System.in),
            System.out
    );
  }

}
