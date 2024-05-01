public class CracklePop {

    public static void main(String[] args) {
        cracklePop();
    }

    // Basic implementation of CracklePop challlenge - prints Crackle if 3 | i, Pop if 5 | i, and CracklePop if 15 | i.
    // We assume that only one thing is printed per integer, to avoid clutter.
    // If one wants to print multiple messages, change the elifs to ifs.
    public static void cracklePop() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("CracklePop");
            } else if (i % 5 == 0) {
                System.out.println("Pop");
            } else if (i % 3 == 0) {
                System.out.println("Crackle");
            } else {
                System.out.println(i);
            }
        }
    }
}
