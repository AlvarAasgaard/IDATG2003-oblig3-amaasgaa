package org.example;

public class WrapTextCommand implements TextCommand{
  protected String opening;
  protected String end;
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }

  @Override
  public String execute(String text){
    if (this.opening == null && end == null){
      return text;
    }
    if (text == null ||  text.isEmpty()){
      return "No text to wrap";
    }
    return opening + text + end;
  }
}
