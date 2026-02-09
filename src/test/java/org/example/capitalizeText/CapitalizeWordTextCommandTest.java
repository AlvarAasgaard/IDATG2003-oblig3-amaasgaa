package org.example.capitalizeText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizeWordTextCommandTest {
  @Test
  void TestExecuteMultipleWords(){
    CapitalizeWordTextCommand command = new CapitalizeWordTextCommand("");
    assertEquals("This Is A Test", command.execute("this is a test"));
  }
  @Test
  void TestExecutePreservesSpaces(){
    CapitalizeWordTextCommand command = new CapitalizeWordTextCommand("");
    assertEquals("Hello  World", command.execute("Hello  World"));
  }
  @Test
  void TestExecuteWithNull(){
    CapitalizeWordTextCommand command = new CapitalizeWordTextCommand("");
    assertEquals("No text given.", command.execute(null));
    assertEquals("No text given.", command.execute(""));
  }
}
