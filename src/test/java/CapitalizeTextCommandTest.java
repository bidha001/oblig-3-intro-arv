import edu.ntnu.idatx2003.capitalize.CapitalizeTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeTextCommandTest {
    @Test
    public void shouldCapitalizeFirstLetter() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();

        String result = command.execute("hello world");

        assertEquals("Hello world", result);
    }

    @Test
    public void shouldReturnEmptyIfInputIsEmpty() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();

        String result = command.execute("");

        assertEquals("", result);
    }

}
