public class Assignment02 {

	
    public static void main(String[] args) {
        BagOfChips bag = new BagOfChips(); // Creating an instance of BagOfChips from BagOfChips Class
        WorkerInput worker = new WorkerInput(); // Creating an instance of WorkerInput from WorkerInput Class
        int goodBags = 0; // For counting the good bags
        int badBags = 0; // For counting the bad bags
        int totalBags = 0; // Total number of bags
        boolean moreData = true; 
        
        // Loop to continuously input data until the user decides to stop
        while (moreData) {
            System.out.println("Please Enter Size of the Bag  (1 for Regular, 2 for Large): ");
            int size = worker.inputInteger(); // Getting bag size from user input
            double weight = worker.inputDouble("Please Enter the Weight of the Bag (in ounces): "); // Getting bag weight from user input
            
            // Validates the input size
            if (size != BagOfChips.REGULAR && size != BagOfChips.LARGE) {
                System.out.println("Error in your Input. Please only enter 1 for Regular or 2 for Large.");
                continue; 
            }
            
            // Setting size and weight of the bag
            bag.setSize(size);
            bag.setWeight(weight);
            
            // Checking if the bag is of correct weight and updating counters accordingly
            if (bag.isBagCorrectWeight()) {
                goodBags++;
            } else {
                badBags++;
            }
            totalBags++;
            
            
            System.out.println("Good Bags: " + goodBags);
            System.out.println("Bad Bags: " + badBags);
            System.out.println("Total Number of Bags: " + totalBags);
            System.out.println("Programmer Name: Albert Christian Adriano ");
            
            
            System.out.println("Input Another Bag? (Type in Yes Or No): ");
            String more = worker.keyboard.nextLine().trim().toLowerCase();
            moreData = more.equals("yes");
        }
    }
}
