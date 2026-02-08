package org.example.wrapText;

import org.example.TextCommand;

/**
 * This class represents a command that wraps a
 * given string with given opening and end sequence.
 *
 * This class implements {@link TextCommand}
 */

public class WrapTextCommand implements TextCommand{
  /**
   * The string that comes before the text.
   */
  protected String opening;
  /**
   * The string that comes after the text.
   */
  protected String end;

  /**
   * Constructs a new WrapTextCommand with the specified opening and end strings.
   * @param opening the string before the text.
   * @param end the string after the text.
   */
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  /**
   * Gets the opening string used for wrapping.
   * @return the opening string.
   */

  public String getOpening() {
    return opening;
  }

  /**
   * Gets the end string used for wrapping.
   * @return the end string.
   */
  public String getEnd() {
    return end;
  }

  /**
   * Executes the wrapping command on the provided text.
   * <p>
   *   If both opening and end strings are null, the original text is returned.
   *   if the input text is null or empty, a default message is returned.
   * </p>
   *
   * @param text the input text to be wrapped.
   * @return the wrapped string, or a default error message.
   */
  @Override
  public String execute(String text){
    if (this.opening == null || end == null){
      return text;
    }
    if (text == null ||  text.isEmpty()){
      return "No text to wrap";
    }
    return opening + text + end;
  }
}
