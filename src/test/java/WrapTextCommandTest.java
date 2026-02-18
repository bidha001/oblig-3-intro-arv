import edu.ntnu.idatx2003.wrap.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapTextCommandTest {
    @Test
    public void shouldWrapWholeText(){
        WrapTextCommand command = new WrapTextCommand("<p>", "</p>");
        String result = command.execute("Heisann Byesann.");

        assertEquals("<p>Heisann Byesann.</p>", result);
    }
}
