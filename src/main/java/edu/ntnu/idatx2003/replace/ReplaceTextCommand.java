package edu.ntnu.idatx2003.replace;

import edu.ntnu.idatx2003.TextCommand;

public class ReplaceTextCommand implements TextCommand {
    private String target;
    private String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    public String getTarget(){
        return target;
    }

    public String getReplacement(){
        return replacement;
    }

    @Override
    public String execute(String text) {
        return text.replace(target, replacement);
    }

    public static void main(String[] args) {
        String text = "ding ding dong";
        ReplaceTextCommand command = new ReplaceTextCommand("dong", "ding");
        String result = command.execute(text);

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);
    }
}
