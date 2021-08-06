import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTests {
    @Test
    public void mainTest() {
        String[] args = {"Arihant"};
        HelloWorld.main(args);
    }

    @Test
    public void test_method_fullname() {
        HelloWorld hw = new HelloWorld();
        assertEquals("ArihantHirawat", hw.fullname("Arihant", "Hirawat"));
    }

}
