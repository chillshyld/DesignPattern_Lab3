package Decorator;

public class FraserFir extends Tree{
    public FraserFir() {
        description = "Douglas Fir tree decorated with";
    }
    public double cost() {
        return 15;
    }
}
