package edu.ntnu.idatx2003.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String[] words = text.split(" "); // Split the text into words
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(super.execute(words[i])); // use the parent class to capitalize each word, ding -> Ding.

            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "ding ding dong";
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();

        String result = command.execute(text);

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);
    }
}
