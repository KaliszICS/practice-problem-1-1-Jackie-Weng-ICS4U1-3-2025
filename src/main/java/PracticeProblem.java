public class PracticeProblem {
  
    public static int sum2D(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; //
            }
        }
        return sum;
    }


    public static int sumRow(int[][] array, int row) {
        if (array == null || row < 0 || row >= array.length) {
            throw new IllegalArgumentException("Invalid row index");
        }
        int sum = 0;
        for (int j = 0; j < array[row].length; j++) {
            sum += array[row][j];
        }
        return sum;
    }


    public static int sumColumn(int[][] array, int col) {
        if (array == null || array.length == 0 || col < 0) {
            throw new IllegalArgumentException("Invalid column index");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (col < array[i].length) { 
                sum += array[i][col];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] sampleArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Sum of all elements: " + sum2D(sampleArray)); 
        System.out.println("Sum of row 0: " + sumRow(sampleArray, 0)); 
        System.out.println("Sum of row 1: " + sumRow(sampleArray, 1)); 
        System.out.println("Sum of row 2: " + sumRow(sampleArray, 2)); 
        System.out.println("Sum of column 0: " + sumColumn(sampleArray, 0)); 
        System.out.println("Sum of column 1: " + sumColumn(sampleArray, 1)); 
        System.out.println("Sum of column 2: " + sumColumn(sampleArray, 2)); 
    }
}
