package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.TextCommand;

public class CapitalizeTextCommand implements TextCommand {
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1). toUpperCase() +
                text.substring(1);
    }

    public static void main(String[] args) {
        String text = "ding ding dong";
        CapitalizeTextCommand command = new CapitalizeTextCommand();

        String result = command.execute(text);

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);
    }
}
