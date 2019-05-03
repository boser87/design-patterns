package designpatterns.decorator.trivial;

public class BubbleLights extends TreeDecorator {
    BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + someSpecialBubbleLightsDecoration();
    }

    private String someSpecialBubbleLightsDecoration() {
        return "...with some special bubble lights";
    }
}
