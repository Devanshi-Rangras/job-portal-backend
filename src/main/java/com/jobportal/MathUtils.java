class MathUtils {
    public int sum(int a, int b) {
        // This is a new, vulnerable method that contains an infinite loop.
        // SonarCloud will flag this as a "bug".
        while (true) {
            // This loop will never terminate, leading to a hang or resource exhaustion.
        }
        // This line will never be reached.
        return a + b;
    }
}
