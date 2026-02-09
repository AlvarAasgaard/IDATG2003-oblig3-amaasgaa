package org.example.wrapText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WrapSelectionTextCommandTest {
  @Test
  void testGetSelectionReturnsCorrectString(){
    String selection = "important";
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("test","test", selection);
    assertEquals(selection,command.getSelection());
  }
  @Test
  void testExecuteWrapsSpecificSelection(){
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("\"", "\"","sitation");
    String input = "There is a sitation in this string.";
    String expected = "There is a \"sitation\" in this string.";

    assertEquals(expected,command.execute(input));
  }
  @Test
  void testExecuteWithNullAndEmptyString(){
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("test","test","something");
    String expected = "No text to wrap";

    assertEquals(expected,command.execute(null));
    assertEquals(expected,command.execute(""));

  }

  @Test
  void testExecuteReturnsUneditedStringWhenNoMatchingSelection(){
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("/", "/","Nonexistant");
    String input = "This string is unedited";
    String expected = "This string is unedited";
    assertEquals(expected,command.execute(input));
  }
}
