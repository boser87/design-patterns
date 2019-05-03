package designpatterns.decorator.trivial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void normalChristmasTree() {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        assertEquals("Christmas tree", christmasTree.decorate());
    }

    @Test
    public void christmasTreeDecoratedWithBubbleLights() {
        ChristmasTree bubbleLights = new BubbleLights(new ChristmasTreeImpl());
        assertEquals("Christmas tree...with some special bubble lights", bubbleLights.decorate());
    }
}
