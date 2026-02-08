package org.example.capitalizeText;

/**
 * This class represents a command to capitalize the first word in a sentence.
 */
public class CapitalizeTextCommand {
  /**
   * The text string to be capitalized
   */
  protected String text;

  /**
   * Constructs a new CapitalizeTextCommand.
   * @param text the text string to be capitalized.
   */
  public CapitalizeTextCommand(String text){
    this.text = text;
  }

  /**
   * The execution command to capitalize the chosen text.
   * @param text the text string to be capitalized.
   * @return the capitalized text.
   */
  public String execute(String text){
    if (text == null || text.isEmpty()){
      return "No text to capitalize";
    }
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
