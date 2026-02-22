package edu.ntnu.idatx2003;

//defines a type of text command, that any class that is a TextCommand must have a method called execute
//that takes test and return text.
public interface TextCommand {
    String execute(String text);
}
