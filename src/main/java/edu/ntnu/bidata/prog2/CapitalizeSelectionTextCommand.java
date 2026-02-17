package edu.ntnu.bidata.prog2;

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
}
