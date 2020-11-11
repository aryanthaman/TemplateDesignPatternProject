import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Homework4Test {

    Guitar G = new Guitar(1,500, 900);
    Drums D = new Drums(2, 300, 700);
    Bass B = new Bass(3, 400, 500);

    //Object Creation Tests
    @Test
    void Test1(){
        assertEquals(G.getClass().getName(), "Guitar", "Guitar object not created.");
    }

    @Test
    void Test2(){
        assertEquals(B.getClass().getName(), "Bass", "Bass object not created.");
    }

    @Test
    void Test3(){
        assertEquals(D.getClass().getName(), "Drums", "Guitar object not created.");
    }

    //Stocking Number Tests
    @Test
    void Test4(){
        assertEquals(G.stockingNumber, 1, "Guitar stocking Number incorrect");
    }

    @Test
    void Test5(){
        assertEquals(D.stockingNumber, 2, "Drums stocking Number incorrect");
    }

    @Test
    void Test6(){
        assertEquals(B.stockingNumber, 3, "Bass stocking Number incorrect");
    }

    //costPrice and sellingPrice Tests
    @Test
    void Test7(){
        assertEquals(G.costPrice, 500, "Guitar cost Price incorrect");
    }

    @Test
    void Test8(){
        assertEquals(G.sellingPrice, 900, "Guitar selling Price incorrect");
    }

    @Test
    void Test9(){
        assertEquals(D.costPrice, 300, "Drums cost Price incorrect");
    }

    @Test
    void Test10(){
        assertEquals(D.sellingPrice, 700, "Drums selling Price incorrect");
    }

    @Test
    void Test11(){
        assertEquals(B.costPrice, 400, "Bass cost Price incorrect");
    }

    @Test
    void Test12(){
        assertEquals(B.sellingPrice, 500, "Bass selling Price incorrect");
    }

}
