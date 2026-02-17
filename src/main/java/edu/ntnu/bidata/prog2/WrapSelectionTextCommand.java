package edu.ntnu.bidata.prog2;

public class WrapSelectionTextCommand extends WrapTextCommand{
    private String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }
}
