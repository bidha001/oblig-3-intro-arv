import edu.ntnu.idatx2003.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScriptTest {
    @Test
    public void shouldExecuteCommandsInSequence() {

        TextCommand replace = new ReplaceTextCommand("hello", "hi");

        TextCommand capitalize = new CapitalizeTextCommand();

        TextCommand wrap = new WrapTextCommand("<p>", "</p>");

        Script script = new Script(List.of(replace, capitalize, wrap));

        String result = script.execute("hello world");

        assertEquals("<p>Hi world</p>", result);
    }
}
