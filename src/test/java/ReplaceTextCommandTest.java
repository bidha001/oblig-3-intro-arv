

import edu.ntnu.idatx2003.replace.ReplaceTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

    @Test
    void shouldReplaceAllOccurrences() {
        ReplaceTextCommand command = new ReplaceTextCommand("Ding", "Dong");

        String result = command.execute("Ding Ding Dong");

        assertEquals("Dong Dong Dong", result);
    }

    @Test
    void shouldReturnSameTextIfTargetNotFound() {
        ReplaceTextCommand command = new ReplaceTextCommand("NOPE", "YES");

        String result = command.execute("Ding Ding Dong");

        assertEquals("Ding Ding Dong", result);
    }
}
