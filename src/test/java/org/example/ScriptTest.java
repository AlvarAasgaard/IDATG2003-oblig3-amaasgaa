package org.example;

import org.example.capitalizeText.CapitalizeWordTextCommand;
import org.example.replaceText.ReplaceTextCommand;
import org.example.wrapText.WrapSelectionTextCommand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScriptTest {
  @Test
  void testExecuteWithOneCommand(){
    List<TextCommand> oneCommandList = new ArrayList<TextCommand>();
    oneCommandList.add(new ReplaceTextCommand("Hi", "Hello"));

    Script script = new Script(oneCommandList);

    String result = script.execute("Hi world");

    assertEquals("Hello world", result);
  }

  @Test
  void testExecuteWithMultipleCommands(){
    List<TextCommand> pipeline = new ArrayList<>();
    pipeline.add(new ReplaceTextCommand("hi", "hello"));
    pipeline.add(new CapitalizeWordTextCommand(""));
    pipeline.add(new WrapSelectionTextCommand("!", "!","Hello"));

    Script script = new Script(pipeline);

    //process: "hi world" -> "hello world" -> "Hello World" -> "!Hello! World"
    String result = script.execute("hi world");
    assertEquals("!Hello! World", result);
  }

  @Test
  void testExecuteWithEmptyList(){
    Script script = new Script(new ArrayList<>());
    String result = script.execute("test");
    assertEquals("test", result);
  }

  @Test
  void testExecuteWithNullInput(){
    List<TextCommand> pipeline = new ArrayList<>();
    pipeline.add(new CapitalizeWordTextCommand(""));
    Script script = new Script(pipeline);

    assertEquals("No text given.", script.execute(null));
  }
}
