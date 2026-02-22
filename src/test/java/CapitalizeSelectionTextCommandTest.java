import edu.ntnu.idatx2003.capitalize.CapitalizeSelectionTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeSelectionTextCommandTest {
    @Test
    public void shouldCapitalizeSelectedWordOnly() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("ding");

        String input = "ding ding Dong";
        String expected = "Ding Ding Dong";

        String result = command.execute(input);

        assertEquals(expected, result);
    }
}
