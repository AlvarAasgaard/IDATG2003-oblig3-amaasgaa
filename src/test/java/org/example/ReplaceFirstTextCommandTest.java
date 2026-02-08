package org.example;

import org.example.replacetext.ReplaceFirstTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceFirstTextCommandTest {
  @Test
  void testReplaceFirstText() {
    TextCommand command = new ReplaceFirstTextCommand("is", "was");
    String input = "Here is a test where there is alot of words";

    String result = command.execute(input);

    assertEquals("Here was a test where there is alot of words", result);
  }

  @Test
  void testExecuteWithEmptyString() {
    TextCommand command = new ReplaceFirstTextCommand("is", "was");
    assertEquals("", command.execute(""));
  }
}