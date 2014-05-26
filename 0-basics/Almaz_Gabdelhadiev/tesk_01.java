import java.util.Random;

public class cls1 {
    public static void PrintBoolArr(int row, int col) {
        boolean arr[][] = new boolean[row][col];
        Random rand = new Random();   

        int tmp = row;
        int row_dig = 0;
        while (tmp > 0) {
            row_dig++;
            tmp /= 10;
        }
        for(int i = 0; i < row_dig-1; i++)
            System.out.print(" ");
        for(int i = 0; i < col; i++)
            System.out.print(" " + i);
        System.out.println();

        for(int i = 0; i < row; i++) {
            int this_row_dig; 
            if (i == 0)
                this_row_dig = 1; 
            else {
                tmp = i;
                this_row_dig = 0;
                while (tmp > 0) {
                    this_row_dig++;
                    tmp /= 10;
                }
            }
            for (int k = 1; k < row_dig-this_row_dig+1; k++)
                System.out.print(" ");
            System.out.print(i);

            for(int j = 0; j < col; j++) {
                arr[i][j] = rand.nextBoolean();
                if (arr[i][j])
                    System.out.print("* ");
                else
                    System.out.print("  ");

                tmp = j;
                int this_col_dig = 0; 
                while (tmp > 0) {
                    this_col_dig++;
                    tmp /= 10;
                }
                for (int k = 1; k < this_col_dig; k++)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintBoolArr(125, 103);
    }
}