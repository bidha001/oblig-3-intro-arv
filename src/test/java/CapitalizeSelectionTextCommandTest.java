import edu.ntnu.bidata.prog2.CapitalizeSelectionTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeSelectionTextCommandTest {
    @Test
    public void shouldCapitalizeSelectedWordOnly() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("selection");

        String input = "text with selection and other selection";
        String expected = "text with Selection and other Selection";

        String result = command.execute(input);

        assertEquals(expected, result);
    }
}
