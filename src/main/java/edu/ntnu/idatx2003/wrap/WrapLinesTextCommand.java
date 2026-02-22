package edu.ntnu.idatx2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand{
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text){
        String[] lines = text.split("\n"); //separates the text into lines.
        //StringBuilder is a class in Java that lets us build a string step by step. variable result point to an object.
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            result.append(getOpening())
                    .append(lines[i])
                    .append(getEnd());

            if (i < lines.length - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Ding Ding Dong\nDong Dong Ding";
        WrapLinesTextCommand command = new WrapLinesTextCommand("<b>", "</b>");

        String result = command.execute(text);

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);

    }
}
