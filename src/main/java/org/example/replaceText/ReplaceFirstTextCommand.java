package org.example.replaceText;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
    }

  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    return text.replaceFirst(this.target, this.replacement);
  }
}
