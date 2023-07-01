import Lecture54.Task2.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckPathTest {
    @Test
    public void checkResult() {
        Assertions.assertEquals("Path: C:\\Program Files\\Java\\bin\\" +
                "\nFile name: java", Main.resultPath(new String[]{"C:\\Program Files\\Java\\bin\\java"}));
    }
}
