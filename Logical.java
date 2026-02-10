public interface Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("a && b: " + (a && b)); // false
        //T and T =T
        //T and F =F
        //F and T =F
        //F and F =F

        // Logical OR
        System.out.println("a || b: " + (a || b)); // true
        //T and T =T
        //T and F =
        //F and T =T
        //F and F =F

        // Logical NOT
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true
        //T=F
        //F=T
    }
}
