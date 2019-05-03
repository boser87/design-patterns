package innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class OuterNestedTest {

    @Test
    public void instantiatonWorks() {
        OuterNested outerNested = new OuterNested();
        OuterNested.Nested nested = new OuterNested.Nested();
    }
}
