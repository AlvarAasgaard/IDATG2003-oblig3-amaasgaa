package org.example.capitalizeText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizeTextCommandTest {
  @Test
  void TestExecuteStandardInput(){
    CapitalizeTextCommand command = new CapitalizeTextCommand("");
    assertEquals("Norge", command.execute("norge"));
  }
  @Test
  void TestExecuteEmptyAndNull(){
    CapitalizeTextCommand command = new CapitalizeTextCommand("");
    assertEquals("No text to capitalize", command.execute(null));
    assertEquals("No text to capitalize", command.execute(""));
  }
}
