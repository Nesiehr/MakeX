import java.util.Objects;

/**
 *
 */
public class MakePatternController {

  final Readable input;
  final Appendable output;

  /**
   *
   * @param input
   * @param output
   * @throws IllegalStateException
   */
  public MakePatternController(Readable input, Appendable output) throws IllegalStateException {
    try {
      Objects.requireNonNull(input);
      Objects.requireNonNull(output);
    } catch (NullPointerException e) {
      throw new IllegalStateException();
    }
    this.input = input;
    this.output = output;
  }

}