package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("needed")
public class SkippedTests {

    @Test
    @Disabled
    void test1(){
        assertTrue(false);

    }
    @Tag("prod")
    @Test
    @Disabled("Some reason")
    void test2(){
        assertTrue(false);

    }

}
