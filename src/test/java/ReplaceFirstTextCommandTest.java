import edu.ntnu.idatx2003.replace.ReplaceFirstTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceFirstTextCommandTest {
    @Test
    public void shouldReplaceOnlyFirstOccurrence(){
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("Dong", "Ding");
        String result = command.execute("Ding Ding Dong");

        assertEquals("Ding Ding Ding", result);

    }
}
