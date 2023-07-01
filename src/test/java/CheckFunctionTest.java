import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckFunctionTest {
    @Test
    public void checkResult() {
        Assertions.assertEquals("1 2 4 8\n" +
                "0 1 2 4", Lecture4_4.Task1.scatch.resultMethod(new String[]{"Half 1 2 4 8"}));
    }
}
