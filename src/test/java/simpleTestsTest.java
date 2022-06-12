
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;




public class simpleTestsTest {

   simpleTests ai;
    @BeforeEach
    void setUp(){
    ai = new simpleTests();
    }

    @Test
    public void testNormalWeight(){


        String actualResult =  ai.getIMTResult(170f, 60f);
    Assertions.assertEquals( "нормальной массе тела", actualResult);
    }
}
