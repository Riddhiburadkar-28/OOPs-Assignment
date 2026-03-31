import java.util.Scanner;

// Interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// Class 1: ImageProcessor
class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image...");
    }

    public void reset_filter() {
        System.out.println("Image filter reset.");
    }
}

// Class 2: DataAnalyzer
class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to data...");
    }

    public void reset_filter() {
        System.out.println("Data filter reset.");
    }
}

// Main class
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter filter type: ");
        String filter = sc.nextLine();

        // Objects
        Filterable img = new ImageProcessor();
        Filterable data = new DataAnalyzer();

        // Using ImageProcessor
        System.out.println("\n--- Image Processing ---");
        img.apply_filter(filter);
        img.reset_filter();

        // Using DataAnalyzer
        System.out.println("\n--- Data Analysis ---");
        data.apply_filter(filter);
        data.reset_filter();
    }
}