import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class MainTest {

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testMainTaskEN() {
        Main.Bootstrapper bootstrapper = new Main.Bootstrapper(null);

        String str = "en\nHello\nWorld\nKek\nShtepa123\nshtepa.jr@gmail.com";
        System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        bootstrapper.start();
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testMainTaskUA() {
        Main.Bootstrapper bootstrapper = new Main.Bootstrapper(null);

        String str = "ua\nHello\nWorld\nKek\nShtepa123\nshtepa.jr@gmail.com";
        System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        bootstrapper.start();
    }

}
