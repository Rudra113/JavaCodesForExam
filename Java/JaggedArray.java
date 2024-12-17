public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];

        jaggedArray[0][0] = 2; jaggedArray[0][1] = 5;
        jaggedArray[1][0] = 1; jaggedArray[1][1] = 6; jaggedArray[1][2] = 3; jaggedArray[1][3] = 8;
        jaggedArray[2][0] = 5; jaggedArray[2][1] = 4; jaggedArray[2][2] = 9;

        System.out.println("Jagged Array: ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}