public class Unary {
    public static void main(String[] args) {
        int a =5;

        //Pre increment
        System.out.println("Pre-increment: " + ++a); // Output: 6 (a becomes 6 before printing)
        System.out.println("Current value of a: " + a); // Output: 6

        //Post-increment
        System.out.println("Post-increment: " + a++); // Output: 5 (then a becomes 6)
        System.out.println("Current value of a: " + a); // Output: 6

        //Pre decrement
        System.out.println("Pre-decrement: " + --a); // Output: 5 (a becomes 5 before printing)
        System.out.println("Current value of a: " + a); // Output: 5

        //Post decrement
        System.out.println("Post-decrement: " + a--); // Output: 5 (then a becomes 4)
        System.out.println("Current value of a: " + a); // Output: 4
    }
}
