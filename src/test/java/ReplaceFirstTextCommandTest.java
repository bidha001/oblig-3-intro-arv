import edu.ntnu.idatx2003.ReplaceFirstTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceFirstTextCommandTest {
    @Test
    public void shouldReplaceOnlyFirstOccurrence(){
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
        String result = command.execute("target and target");

        assertEquals("replacement and target", result);

    }
}
