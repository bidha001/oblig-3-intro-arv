import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceFirstTextCommandTest {
    @Test
    public void shouldReplaceOnlyFirstOccurrence(){
        edu.ntnu.bidata.prog2.ReplaceFirstTextCommand command = new edu.ntnu.bidata.prog2.ReplaceFirstTextCommand("target", "replacement");
        String result = command.execute("target and target");

        assertEquals("replacement and target", result);

    }
}
