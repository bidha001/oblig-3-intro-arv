package edu.ntnu.idatx2003;

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
}
