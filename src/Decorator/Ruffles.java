package Decorator;

public class Ruffles extends TreeDecorator {
	
		public Ruffles(Tree tree) {
			this.tree=tree;
		}
		
		public String getDescription() {
			return tree.getDescription() + ", Decorator.Ruffles";
		}

		public double cost() {
			return 1 + tree.cost();
    	}
}
