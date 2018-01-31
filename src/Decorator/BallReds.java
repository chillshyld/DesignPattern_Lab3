package Decorator;

public class BallReds extends TreeDecorator {
    public BallReds(Tree tree) {
        this.tree=tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Ball Reds";
    }

    public double cost() {
        return 1 + tree.cost();
    }
}
