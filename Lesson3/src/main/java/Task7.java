public class Task7 {
    public static void main(String[] args) {
        int[] intArray = {21, 0, 3, 22, 111, 36};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
    }
}

