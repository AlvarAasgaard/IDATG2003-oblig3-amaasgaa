package org.example;


import java.util.List;

/**
 * This class represents the Script, it runs multiple commands from a list.
 */

public class Script {
  private List<TextCommand> commands;

  /**
   * Constructs an instance of the Script.
   * @param commands the list of commands to run in the script.
   */
  public Script(List<TextCommand> commands){
    this.commands = commands;
  }

  /**
   * The execution of the commands in the script, it runs each command in the list once.
   * @param text the text to execute the script on.
   * @return result the text that has been put through the script.
   */
  public String execute(String text){
    String result = text;

    for (TextCommand command : commands){
      result = command.execute(result);
    }
    return result;
  }
}