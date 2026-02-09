package org.example.replaceText;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceTextCommandTest {
  @Test
  void TestGetters(){
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    assertEquals("target", command.getTarget());
    assertEquals("replacement", command.getReplacement());
  }

  @Test
  void TestExecuteReplacesAllMatches() {
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    String input = "text with target and target";

    String result = command.execute(input);

    assertEquals("text with replacement and replacement", result);
  }

  @Test
  void TestExecuteDoesNotEditEmptyText() {
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    assertEquals("", command.execute(""));
  }
}
