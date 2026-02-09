package org.example;


import java.util.List;

public class Script {
  private List<TextCommand> commands;

  public Script(List<TextCommand> commands){
    this.commands = commands;
  }

  public String execute(String text){
    String result = text;

    for (TextCommand command : commands){
      result = command.execute(result);
    }
    return result;
  }
}