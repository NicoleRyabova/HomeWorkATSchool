import Lecture54.Task1.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CheckIDOfTheLetterTest {
    @Test
    public void checkResult(){
        Assertions.assertEquals(1, Main.resultNumber(new String[]{"и"}));
    }
}
