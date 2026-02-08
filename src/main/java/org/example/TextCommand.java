package org.example;

/**
 * Interface for commands that perform transformations on a text string.
 */
public interface TextCommand {
  /**
   * Executes a specific text transformation.
   *
   * @param text the input string to be transformed.
   * @return the resulting string after the transformation.
   */
  public String execute(String text);
}
