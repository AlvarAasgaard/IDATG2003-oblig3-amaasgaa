package org.example.wrapText;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class represents a command that wraps each individual line
 * of a text block with a specified opening and ending sequence.
 * <p>
 *   This class extends {@link WrapTextCommand} and overrides the execute command
 *   to process the text line-by-line.
 * </p>
 *
 */
public class WrapLinesTextCommand extends WrapTextCommand{
  /**
   * Constructs a new WrapLinesTextCommand with the specified opening and closing string.
   * @param opening the string before the text.
   * @param end the string after the text.
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  /**
   * Executes the wrapping command by processing the text line by line.
   * <p>
   *   The method splits the input string into lines using the newline character (\n),
   *   and then wraps each line and then joins them back together.
   * </p>
   * @param text the input text conatining one or more lines.
   * @return a new string where the text with each line wrapped, or an error message if the text is empty.
   */
  @Override
  public String execute(String text) {
    if (text == null ||  text.isEmpty()){
      return "No text to wrap";
    }

    return Arrays.stream(text.split("\n")).
        map(line -> opening + line + end).
        collect(Collectors.joining("\n"));
  }
}
