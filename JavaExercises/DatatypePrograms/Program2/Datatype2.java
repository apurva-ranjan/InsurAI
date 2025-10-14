public class NonPrimitiveExample {
    public static void main(String[] args) {
        String name = "Alice";              // String is a non-primitive (reference) type
        int[] marks = {85, 90, 78};         // Array is also non-primitive

        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
