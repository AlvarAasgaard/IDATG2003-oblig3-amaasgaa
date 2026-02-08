package org.example.capitalizeText;

/**
 * A command that capitalizes only specific occurrences of a selected string
 * within a larger text body.
 * <p>
 * This class extends {@link CapitalizeTextCommand} and applies its
 * capitalization logic specifically to the chosen selection.
 * </p>
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;

  /**
   * Constructs a new CapitalizeSelectionTextCommand.
   *
   * @param text a configuration or default string for the superclass.
   * @param selection the specific string to be targeted for capitalization.
   */
  public CapitalizeSelectionTextCommand(String text, String selection){
    super(text);
    this.selection = selection;
  }

  /**
   * Returns the string selected for capitalization.
   *
   * @return the current selection string.
   */
  public String getSelection() {
    return selection;
  }

  /**
   * Capitalizes all occurrences of the selection string within the provided text.
   * <p>
   * The method identifies the selection, uses the parent's capitalization logic
   * on it, and replaces all instances in the input text with the capitalized version.
   * </p>
   *
   * @param text the input string containing the selection to be modified.
   * @return the modified text with the selected portions capitalized,
   * or an error message if the input is null or empty.
   */
  @Override
  public String execute(String text){
    if (text == null || text.isEmpty()){
      return "No text to capitalize";
    }
    if (selection.isEmpty()){
      return text;
    }

    String capitalized = super.execute(selection);

    return text.replace(selection, capitalized);


  }
}
