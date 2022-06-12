import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class markResultTest {
    markResult ai;

    @BeforeEach
    void setUp() {
        ai = new markResult();
    }

    @Test
    @Order(1)
    public void testmarkResultHappypath0() {


        String actualResult = ai.getMarkResult(0);
        Assertions.assertEquals("2", actualResult);
    }

    @Test
    @Order(2)
    public void testmarkResultHappypath34() {


        String actualResult = ai.getMarkResult(34);
        Assertions.assertEquals("2", actualResult);
    }

    @Test
    @Order(3)
    public void testmarkResultHappypath35() {


        String actualResult = ai.getMarkResult(35);
        Assertions.assertEquals("2", actualResult);
    }

    @Test
    @Order(4)
    public void testmarkResult56() {


        String actualResult = ai.getMarkResult(56);
        Assertions.assertEquals("3", actualResult);
    }

    @Test
    @Order(5)
    public void testmarkResult36() {


        String actualResult = ai.getMarkResult(36);
        Assertions.assertEquals("3", actualResult);
    }

    @Test
    @Order(5)
    public void testmarkResult57() {


        String actualResult = ai.getMarkResult(57);
        Assertions.assertEquals("4", actualResult);
    }

    @Test
    @Order(6)
    public void testmarkResult70() {


        String actualResult = ai.getMarkResult(70);
        Assertions.assertEquals("4", actualResult);
    }
    @Test
    @Order(7)
    public void testmarkResult73() {


        String actualResult = ai.getMarkResult(73);
        Assertions.assertEquals("5", actualResult);
    }
    @Test
    @Order(8)
    public void testmarkResult99() {


        String actualResult = ai.getMarkResult(99);
        Assertions.assertEquals("5", actualResult);
    }
    @Test
    @Order(9)
    public void testmarkResult100() {


        String actualResult = ai.getMarkResult(100);
        Assertions.assertEquals("no mark result", actualResult);
    }
    @Test
    @Order(10)
    public void testmarkResult71() {


        String actualResult = ai.getMarkResult(71);
        Assertions.assertEquals("no mark result", actualResult);
    }
    @Test
    @Order(11)
    public void testmarkResult72() {


        String actualResult = ai.getMarkResult(72);
        Assertions.assertEquals("no mark result", actualResult);
    }
    @Test
    @Order(11)
    public void testmarkResultNegative() {


        String actualResult = ai.getMarkResult(-10);
        Assertions.assertEquals("no mark result", actualResult);
    }
}