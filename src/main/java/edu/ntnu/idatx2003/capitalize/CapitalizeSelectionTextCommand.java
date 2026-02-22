package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
    private String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }

    @Override
    public String execute(String text) {
        String capitalized = super.execute(selection);
        return text.replace(selection, capitalized);
    }

    public static void main(String[] args) {
        String text = "ding ding dong";
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("ding");

        String result = command.execute(text);

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);
    }
}
