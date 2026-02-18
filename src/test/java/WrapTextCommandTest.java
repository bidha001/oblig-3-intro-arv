import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapTextCommandTest {
    @Test
    public void shouldWrapWholeText(){
        edu.ntnu.bidata.prog2.WrapTextCommand command = new edu.ntnu.bidata.prog2.WrapTextCommand("<p>", "</p>");
        String result = command.execute("Heisann Byesann.");

        assertEquals("<p>Heisann Byesann.</p>", result);
    }
}
