package week07_Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] row1 = {"Java", "SQL", "HTML", "CSS", "Python"};
        String[] row2 = {"Selenium", "API", "Jenking"};
        String[] row3 = {"Cydeo", "Wooden Spoon", "Batch 28"};

        String[][] sheet1 = {row1, row2, row3};
        String[][] sheet2 = {};
        String[][] sheet3 = {};

        // [index of 1D arrays][index of elements inside specified 1D array]

        System.out.println(sheet1[0][1]); // prints element at index 1 of row at index 0

        String[][][] excelFile = {sheet1, sheet2, sheet3};
        // 3D array containing 2D arrays (sheets 1-3)

    }
}
