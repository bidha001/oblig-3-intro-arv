import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapLinesTextCommandTest {
    @Test
    public void shouldWrapEachLineSeperately(){
        edu.ntnu.bidata.prog2.WrapLinesTextCommand command = new edu.ntnu.bidata.prog2.WrapLinesTextCommand("<p>", "</p>");

        String input = "first line\nsecond line";
        String expected = "<p>first line</p>\n<p>second line</p>";

        String result = command.execute(input);

        assertEquals(expected, result);
    }
}
