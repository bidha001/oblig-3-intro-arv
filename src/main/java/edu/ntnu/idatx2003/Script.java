package edu.ntnu.idatx2003;

import java.util.List;

public class Script {
    //creates an empty container(like a box), <TextCommand> what type of object are allowed inside,
    // command is the name od the box.
    private List<TextCommand> commands;

    public Script(List<TextCommand> commands) {
        this.commands = commands;
    }

    //execute(String text): takes a text and will return a new text.
    public String execute(String text) {
        String result = text; // create a new variable call result.

        for (TextCommand command : commands) {
            result = command.execute(result);
        }
        return result;
    }
}
