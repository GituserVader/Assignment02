// Class represents a bag of chips with size and weight properties.
public class BagOfChips {
    private int size; // Size of the bag (regular or large)
    private double weight; // Weight of the bag
    public static final int REGULAR = 1; // Constant representing regular size
    public static final int LARGE = 2; // Constant representing large size
    private static final double REGULAR_WEIGHT = 9.25; // Constant for regular bag weight
    private static final double LARGE_WEIGHT = 15.75; // Constant for large bag weight
    private static final double EPSILON = 0.01; // Constant for floating-point comparison threshold
    
    // Constructors Method
    public BagOfChips() {
        this(REGULAR, REGULAR_WEIGHT); // Default constructor sets bag as regular with default weight
    }
    
    public BagOfChips(int size, double weight) {
        this.size = size;
        this.weight = weight;
    }
    
    // Getters and setters Method
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to check if the bag weight is within acceptable range
    public boolean isBagCorrectWeight() {
        double expectedWeight = (size == REGULAR) ? REGULAR_WEIGHT : LARGE_WEIGHT;
        return Math.abs(weight - expectedWeight) <= EPSILON; // Comparing weights within a small threshold
    }
}