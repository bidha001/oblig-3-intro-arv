import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeWordsTextCommandTest {
    @Test
    public void shouldCapitalizeEveryWord() {
        edu.ntnu.bidata.prog2.CapitalizeWordsTextCommand command = new edu.ntnu.bidata.prog2.CapitalizeWordsTextCommand();

        String result = command.execute("hello world from java");

        assertEquals("Hello World From Java", result);
    }
}
