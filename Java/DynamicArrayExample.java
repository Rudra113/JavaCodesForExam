import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        // Create a dynamic array
        ArrayList<String> dynamicArray = new ArrayList<>();
        ArrayList<Integer> dynamicArray2 = new ArrayList<>();

        // Add elements to the dynamic array
        dynamicArray.add("Apple");
        dynamicArray.add("Banana");
        dynamicArray.add("Cherry");

        dynamicArray2.add(50);
        dynamicArray2.add(40);
        dynamicArray2.add(60);

        // Display the elements
        System.out.println("Dynamic Array: " + dynamicArray);
        System.out.println("Dynamic Array2: " + dynamicArray2);

        // Add another element
        dynamicArray.add("Date");
        System.out.println("After adding another element: " + dynamicArray);

        dynamicArray2.add(10);
        System.out.println("After adding another element: " + dynamicArray2);

        // Remove an element
        dynamicArray.remove("Banana");
        System.out.println("After removing an element: " + dynamicArray);
        dynamicArray2.remove(2);
        System.out.println("After removing an element: " + dynamicArray2);

        // Access an element
        System.out.println("First element: " + dynamicArray.get(0));
        System.out.println("First element: " + dynamicArray2.get(0));
    }
}
