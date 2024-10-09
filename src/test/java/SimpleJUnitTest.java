import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void BeforeAll() {
        System.out.println("###     BeforeAll()\n");


    }

    @AfterAll
    static void AfterAll() {
        System.out.println("###     AfterAll()\n");


    }
    @BeforeEach
    void beforeEach() {
        System.out.println("###     beforeEach()");
        result= getResult();

    }

    @AfterEach
    void AfterEach() {
        System.out.println("###     AfterEach()\n");
        result = 0;

    }

    @Test
    void t1Test() {
        System.out.println("###     t1Test()");
        Assertions.assertTrue(result > 1);
    }

    @Test
    void t2Test() {
        System.out.println("###     t2Test()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void t3Test() {
        System.out.println("###     t3Test()");
        Assertions.assertTrue(result > 0);
    }

    private int getResult(){
        return 3;
    }


}


