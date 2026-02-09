package org.example.capitalizeText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizeSelectionTextCommandTest {
  @Test
  void TestGetSelectionReturnsRightString(){
    String givenSelection = "Test1";
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("placeholder", givenSelection);

    assertEquals(givenSelection, command.getSelection());
  }
  @Test
  void TestExecuteFunctionsNormally(){
    String givenSelection = "java";
    CapitalizeSelectionTextCommand command2 = new CapitalizeSelectionTextCommand("", givenSelection);
    assertEquals("This is a Java test", command2.execute("This is a java test"));
  }
  @Test
  void TestExecuteWithMultipleOccurrences(){
    String givenSelection = "java";
    String input = "java is what java is";
    String expected = "Java is what Java is";

    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("", givenSelection);

    assertEquals(expected, command.execute(input));
  }
  @Test
  void TestForEmptyOrNull(){
    String givenSelection = "placeholder";
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("", givenSelection);

    assertEquals("No text to capitalize", command.execute(null));
    assertEquals("No text to capitalize", command.execute(""));
  }
}
