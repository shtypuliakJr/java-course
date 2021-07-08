import org.junit.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyThread extends Thread {
    InputStream inputStream;
    List<String> list;

    public MyThread(InputStream inputStream, List<String> list) {
        this.inputStream = inputStream;
        this.list = list;
    }

    @Override
    public void run() {
        List<String> list = new ArrayList<>(Arrays.asList("en", "Hello", "World", "Kek", "Shtepa123"));

        System.setIn(new ByteArrayInputStream(list.get(0).getBytes(StandardCharsets.UTF_8)));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MainTest {
    @Test
    @EnabledOnOs(OS.LINUX)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
    public void testMainTask() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Main.Bootstrapper bootstrapper = new Main.Bootstrapper(null);
        List<String> list = new ArrayList<>(Arrays.asList("en", "Hello", "World", "Kek", "Shtepa123"));

        MyThread thread = new MyThread(System.in, list);
        thread.start();
        bootstrapper.start();

//        Thread thread = new MyThread(bufferedReader);
//        thread.start();

        //System.setIn(new ByteArrayInputStream("Hello".getBytes(StandardCharsets.UTF_8)));

        //bootstrapper.start();
    }

}
