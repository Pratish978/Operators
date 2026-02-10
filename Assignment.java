public class Assignment {
    public static void main(String[] args) {
        int a = 10; // Assignment operator (=) is used to assign the value 10 to variable a
        System.out.println("Value of a: " + a); // Output: Value of a: 10

        a += 5; // Equivalent to a = a + 5; (a becomes 15)
        System.out.println("After a += 5: " + a); // Output: After a += 5: 15

        a -= 3; // Equivalent to a = a - 3; (a becomes 12)
        System.out.println("After a -= 3: " + a); // Output: After a -= 3: 12

        a *= 2; // Equivalent to a = a * 2; (a becomes 24)
        System.out.println("After a *= 2: " + a); // Output: After a *= 2: 24

        a /= 4; // Equivalent to a = a / 4; (a becomes 6)
        System.out.println("After a /= 4: " + a); // Output: After a /= 4: 6

        a %= 5; // Equivalent to a = a % 5; (a becomes 1)
        System.out.println("After a %= 5: " + a); // Output: After a %= 5: 1
    }
}
