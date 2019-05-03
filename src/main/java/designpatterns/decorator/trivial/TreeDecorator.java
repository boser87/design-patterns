package designpatterns.decorator.trivial;

abstract public class TreeDecorator implements ChristmasTree {
    private ChristmasTree christmasTree;

    TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
