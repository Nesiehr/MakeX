import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Controller for displaying patterns.
 */
public class MakePatternController implements IMakePatternController {
  final Readable input;
  final Appendable output;

  /**
   * Creates a controller that accepts readable input and appendable output.
   * @param input - a readable input
   * @param output - an appendable output
   * @throws IllegalStateException - if input or output are null
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

  /**
   * Helper method for ensuring that output is not null.
   * @param outputString - the string to be output
   */
  private void send(String outputString) {
    try {
      this.output.append(outputString);
    } catch (IOException e) {
      return;
    }
  }

  @Override
  public void makeXPattern() {
    Scanner scan = new Scanner(this.input);
    boolean running = true;
    String stringInput = "";

    this.send("Input: ");

    while(running) {
      if (scan.hasNext()) {
        stringInput = scan.next();
      }

      if (stringInput.equals("q") || stringInput.equals("Q")) {
        this.send("Program Ended.\n");
        running = false;
      } else {
        try {
          int size = Integer.parseInt(stringInput);
          MakeXPattern pattern = new MakeXPattern(size);
          this.send(pattern.displayPattern() + "\n");
          this.send("Input: ");
        } catch (Exception e) {
          this.send("Please make sure you input a valid number (no evens!) or q.\n");
          this.send("Input: ");
        }
        stringInput = "";
      }
    }
  }
}