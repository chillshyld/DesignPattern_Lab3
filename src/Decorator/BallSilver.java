package Decorator;

public class BallSilver extends TreeDecorator {
    public BallSilver(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Ball Silver";
    }

    public double cost() {
        return 3 + tree.cost();
    }
}
