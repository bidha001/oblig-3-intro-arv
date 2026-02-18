

import edu.ntnu.bidata.prog2.ReplaceTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

    @Test
    void shouldReplaceAllOccurrences() {
        ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");

        String result = command.execute("text with target and target");

        assertEquals("text with replacement and replacement", result);
    }

    @Test
    void shouldReturnSameTextIfTargetNotFound() {
        ReplaceTextCommand command = new ReplaceTextCommand("zzz", "y");

        String result = command.execute("text without match");

        assertEquals("text without match", result);
    }
}
