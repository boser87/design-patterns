package innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class OuterInnerTest {

    @Test
    public void innerClassIsInstantiated() {
        OuterInner outerInner = new OuterInner();
        OuterInner.Inner inner = outerInner.new Inner();
    }

}
