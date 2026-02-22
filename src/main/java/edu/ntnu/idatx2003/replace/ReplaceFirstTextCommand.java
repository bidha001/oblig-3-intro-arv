package edu.ntnu.idatx2003.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand{
    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        return text.replaceFirst(getTarget(), getReplacement());
    }

    public static void main(String[] args) {
        String text = "Ding Ding Dong";
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("Ding", "Dong");

        String result = command.execute(text);

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);
    }
}
