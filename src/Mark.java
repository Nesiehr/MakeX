/**
 * Represents the two possible marks ("X" and "O").
 */
public enum Mark {

  X("X"), O("O");

  private String character;

  Mark(String character) {
    this.character = character;
  }

  public String getMark() {
    return character;
  }

}
