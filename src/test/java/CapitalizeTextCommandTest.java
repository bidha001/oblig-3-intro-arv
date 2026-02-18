import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeTextCommandTest {
    @Test
    public void shouldCapitalizeFirstLetter() {
        edu.ntnu.bidata.prog2.CapitalizeTextCommand command = new edu.ntnu.bidata.prog2.CapitalizeTextCommand();

        String result = command.execute("hello world");

        assertEquals("Hello world", result);
    }

    @Test
    public void shouldReturnEmptyIfInputIsEmpty() {
        edu.ntnu.bidata.prog2.CapitalizeTextCommand command = new edu.ntnu.bidata.prog2.CapitalizeTextCommand();

        String result = command.execute("");

        assertEquals("", result);
    }

}
