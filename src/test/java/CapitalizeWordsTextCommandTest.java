import edu.ntnu.idatx2003.CapitalizeWordsTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeWordsTextCommandTest {
    @Test
    public void shouldCapitalizeEveryWord() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();

        String result = command.execute("hello world from java");

        assertEquals("Hello World From Java", result);
    }
}
