import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RefundTicketPricePercentTest {
    RefundTicketPricePercent ai;

        @BeforeEach
        void setUp() {
            ai = new RefundTicketPricePercent();
        }

        @Test
        @Order(1)
        public void testmarRefundTicketPricePercentHappypath241() {


            int actualResult = ai.getRefundTicketPricePercent(241, false, false);
            Assertions.assertEquals(100, actualResult);
        }
    @Test
    @Order(2)
    public void testmarRefundTicketPricePercentHappypathCanselled() {


        int actualResult = ai.getRefundTicketPricePercent(241, true, true);
        Assertions.assertEquals(100, actualResult);
    }
    @Test
    @Order(3)
    public void testmarRefundTicketPricePercentHappypath240() {


        int actualResult = ai.getRefundTicketPricePercent(240, false, false);
        Assertions.assertEquals(50, actualResult);
    }
    @Test
    @Order(4)
    public void testmarRefundTicketPricePercentHappypath143() {


        int actualResult = ai.getRefundTicketPricePercent(143, false, false);
        Assertions.assertEquals(30, actualResult);
    }
    @Test
    @Order(5)
    public void testmarRefundTicketPrice144() {


        int actualResult = ai.getRefundTicketPricePercent(144, false, false);
        Assertions.assertEquals(50, actualResult);
    }
    @Test
    @Order(6)
    public void testmarRefundTicketPrice72() {


        int actualResult = ai.getRefundTicketPricePercent(72, false, false);
        Assertions.assertEquals(30, actualResult);
    }
    @Test
    @Order(7)
    public void testmarRefundTicketPrice2() {


        int actualResult = ai.getRefundTicketPricePercent(2, false, false);
        Assertions.assertEquals(0, actualResult);
    }
    @Test
    @Order(8)
    public void testmarRefundTicketPrice2canselled() {


        int actualResult = ai.getRefundTicketPricePercent(2, true, false);
        Assertions.assertEquals(0, actualResult);
    }
}
