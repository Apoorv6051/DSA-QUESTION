
class Solution {
    public void printTillN(int n) {
        printNumber(1, n);
    }

    public void printNumber(int i, int n) {

        // Base condition
        if (i > n) {
            return;
        }

        // Print current number
        System.out.print(i + " ");

        // Recursive call
        printNumber(i + 1, n);
    }
}
