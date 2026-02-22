package edu.ntnu.idatx2003.wrap;

import edu.ntnu.idatx2003.TextCommand;

public class WrapTextCommand implements TextCommand {
    private String opening;
    private String end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }

    @Override
    public String execute(String text) {
        return opening + text + end;
    }

    public static void main(String[] args) {
        String test = "Ding Ding Dong";
        WrapTextCommand command = new WrapTextCommand("<b>", "</b>");

        String result = command.execute(test);

        System.out.println("Original: " + test);
        System.out.println("Modified: " + result);
    }
}
