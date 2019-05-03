package designpatterns.singleton.lazyloaded;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomethingTest {

    @Test
    public void initSomething() {
        Something something = Something.getInstance();
        System.out.println("test");
    }
}
