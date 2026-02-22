import edu.ntnu.idatx2003.wrap.WrapLinesTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapLinesTextCommandTest {
    @Test
    public void shouldWrapEachLineSeperately(){
        WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");

        String input = "Ding Ding Ding\nDong Dong Dong";
        String expected = "<p>Ding Ding Ding</p>\n<p>Dong Dong Dong</p>";

        String result = command.execute(input);

        assertEquals(expected, result);
    }
}
