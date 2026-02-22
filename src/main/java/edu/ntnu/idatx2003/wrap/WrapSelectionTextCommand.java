package edu.ntnu.idatx2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand{
    private String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }

    @Override
    public String execute(String text) {
        return text.replace(selection,
                getOpening() + selection + getEnd());
    }

    public static void main(String[] args) {
        String test = "Ding Ding Dong";
        WrapSelectionTextCommand command = new WrapSelectionTextCommand("<b>", "</b>", "Dong");

        String result = command.execute(test);

        System.out.println("Original: " + test);
        System.out.println("Modified: " + result);
    }
}
