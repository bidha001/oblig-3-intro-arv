

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

    @Test
    void shouldReplaceAllOccurrences() {
        edu.ntnu.bidata.prog2.ReplaceTextCommand command = new edu.ntnu.bidata.prog2.ReplaceTextCommand("target", "replacement");

        String result = command.execute("text with target and target");

        assertEquals("text with replacement and replacement", result);
    }

    @Test
    void shouldReturnSameTextIfTargetNotFound() {
        edu.ntnu.bidata.prog2.ReplaceTextCommand command = new edu.ntnu.bidata.prog2.ReplaceTextCommand("zzz", "y");

        String result = command.execute("text without match");

        assertEquals("text without match", result);
    }
}
