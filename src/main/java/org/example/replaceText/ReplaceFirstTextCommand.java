package org.example.replaceText;

import java.util.regex.Pattern;
/**
 * A command that replaces only the first occurrence of a target string
 * with a replacement string.
 * <p>
 * This class extends {@link ReplaceTextCommand} and overrides the
 * execution to limit the replacement to the first match found.
 * </p>
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  /**
   * Constructs a new ReplaceFirstTextCommand.
   *
   * @param target      the string to be replaced.
   * @param replacement the string to replace it with.
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
    }

  /**
   * Replaces the first occurrence of the target string.
   * Uses Pattern.quote to ensure the target is treated as literal text, not a regex.
   * @param text the input string to process.
   * @return the text with the first replacement made, or null if input is null.
   */
  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    return text.replaceFirst(Pattern.quote(this.target), this.replacement);
  }
}
