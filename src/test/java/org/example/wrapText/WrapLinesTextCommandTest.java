package org.example.wrapText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WrapLinesTextCommandTest {
  @Test
  void TestContructorAndGetters(){
    WrapLinesTextCommand command = new WrapLinesTextCommand("(",")");
    assertEquals("(",command.getOpening());
    assertEquals(")",command.getEnd());
  }
  @Test
  void testExecuteWrapsMultipleLines(){
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>","</p>");
    String input = "Line1\nLine2\nLine3";
    String expected = "<p>Line1</p>\n<p>Line2</p>\n<p>Line3</p>";

    assertEquals(expected, command.execute(input));
  }
  @Test
  void testExecuteWithNullInput(){
    WrapLinesTextCommand command = new WrapLinesTextCommand("(",")");
    assertEquals("No text to wrap",command.execute(null));
    assertEquals("No text to wrap",command.execute(""));
  }

}
