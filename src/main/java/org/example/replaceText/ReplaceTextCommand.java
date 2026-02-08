package org.example.replaceText;

import org.example.TextCommand;

/**
 * A command that replaces all occurrences of a specific target string
 * with a replacement string.
 */
public class ReplaceTextCommand implements TextCommand {

  /** The sequence of characters to be found and replaced. */
  protected String target;
  /** The sequence of characters to insert instead of the target. */
  protected String replacement;

  /**
   * Constructs a new ReplaceTextCommand.
   *
   * @param target      the string to be replaced.
   * @param replacement the string to replace it with.
   */
  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * Returns the target string that this command looks for.
   *
   * @return the target string.
   */
  public String getTarget() {
    return target;
  }

  /**
   * Returns the string that will be used as a replacement.
   *
   * @return the replacement string.
   */
  public String getReplacement() {
    return replacement;
  }

  /**
   * Executes the command by replacing all occurrences of the target
   * string in the given text.
   *
   * @param text the input string to be processed.
   * @return the modified string with all replacements made,
   * or null if the input text is null.
   */
  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    return text.replace(target, replacement);
  }
}
