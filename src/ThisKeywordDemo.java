import java.util.Scanner;

class ThisDemo {
    int value;

    // Using this to resolve naming conflict
    void setValue(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int input = sc.nextInt();

        // Create object
        ThisDemo obj = new ThisDemo();

        // Set value
        obj.setValue(input);

        // Display value
        obj.display();

        sc.close();
    }
}