import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class XAndOTest {
    char[][] xo;

    @BeforeEach
    public void setUp(){
        char[][] xo = new char[3][3];
    }

    @Test
    public void xAndO_IsEmpty(){
        assertTrue(xo.isEmpty());

    }




}
