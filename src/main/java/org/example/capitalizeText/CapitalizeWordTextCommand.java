package org.example.capitalizeText;

/**
 * This class represents a command that capitalizes the
 * first letters of all the words in a given text string.
 * <p>
 *   It extends the {@link CapitalizeTextCommand} to provide specific logic.
 * </p>
 */
public class CapitalizeWordTextCommand extends CapitalizeTextCommand{
  /**
   * Constructs a new CapitalizeWordTextCommand
   * @param text the text to capitalize each word in.
   */
  public CapitalizeWordTextCommand(String text){
    super(text);
  }

  /**
   * The execution of the command to capitalize each word.
   * <p>
   *   It checks if the input text is empty or null, then splits the
   *   string into words based on spaces. Each word is transformed by making the first character
   *   uppercase and the subsequent characters lowercase.
   * </p>
   * @param text the text string to be capitalized.
   * @return the proceeded string with each word capitalized
   * or an error message if invalid input.
   */
  @Override
  public String execute(String text){
    if (text == null || text.isEmpty()){
      return "No text given.";
    }
    String[] words = text.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i=0; i<words.length; i++){
      String word = words[i];

      if (!word.isEmpty()){
        String capitalized = super.execute(word);
        result.append(capitalized);
      }
      if (i < words.length-1){
        result.append(" ");
      }
    }
    return result.toString();
  }

}
