package org.example.wrapText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WrapTextCommandTest {
  @Test
  void TestGetters(){
    String opening = "Opening";
    String end = "End";

    WrapTextCommand wrapTextCommand = new WrapTextCommand(opening, end);

    assertEquals(opening, wrapTextCommand.getOpening());
    assertEquals(end, wrapTextCommand.getEnd());
  }
  @Test
  void TestExecuteWithNull(){
    WrapTextCommand command = new WrapTextCommand("(", ")");

    assertEquals("No text to wrap", command.execute(null));
    assertEquals("No text to wrap", command.execute(""));
  }
}
