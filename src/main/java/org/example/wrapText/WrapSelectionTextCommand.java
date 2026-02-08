package org.example.wrapText;

/**
 * This class represents a command that wraps only a selection of the text string.
 * This class extends {@link WrapTextCommand}
 */

public class WrapSelectionTextCommand extends WrapTextCommand{
  private final String selection;

  /**
   * Constructs a new WrapSelectionTextCommand
   * @param opening the opening string that comes before the selected text.
   * @param end the ending string that comes after the selected text.
   * @param selection the selected part of the text that will be wrapped.
   */
  public WrapSelectionTextCommand(String opening, String end, String selection){
    super(opening, end);
    this.selection = selection;
  }

  /**
   * Gets the selection of the string that is going to be wrapped.
   * @return the selection string.
   */

  public String getSelection(){
    return selection;
  }

  /**
   * Executes the command by wrapping all occurences of the selection string.
   * @param text the input text to be wrapped.
   * @return the text with occurrences of selection wrapped, or an error message if input is null/empty.
   */

  @Override
  public String execute(String text){
    if (text == null || text.isEmpty()){
      return "No text to wrap";
    }
    if (selection == null || selection.isEmpty()){
      return text;
    }
    String wrapped = super.execute(selection);
    return text.replace(selection, wrapped);
  }
}
