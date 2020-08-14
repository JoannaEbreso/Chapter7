package src.main;

import java.util.Scanner;
public class SevenPointNine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] t = new int[2][3];

/*       //Access expressions for all elements in row 1 of t
        t[0][0];
        t[0][1];
        t[0][2];

        //Access expressions for all elements in column 2 of t
        t[0][1];
        t[1][1];

        //Statement that sets t[0][1] to zero
        t[0][1] = 0;

        //Statements that set all elements of array t to zero
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;

        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0; */

        //for loop that set all elements of array t to zero
        for (int row=0; row<t.length; row++){
            for(int column=0; column<t[row].length; column++){
                t[row][column] = 0;
                System.out.print(t[row][column]+ " ");
            }
        }

       // for loop that set all elements of array t to input provided by user
        for (int row=0; row<t.length; row++){
            for(int column=0; column<t[row].length; column++){
                System.out.println("Input Element: ");
                int input = sc.nextInt();
                t[row][column] = input;
            }
        }
        for (int row=0; row<t.length; row++){
            for(int column=0; column<t[row].length; column++){
                System.out.print(t[row][column]+ " ");
            }
            System.out.println();
        }

        int smallest = t[0][0];
        for (int row=0; row<t.length; row++){
            for(int column=0; column<t[row].length; column++){
                if(t[row][column]<smallest){
                    smallest = t[row][column];
                }
            }
        }
        System.out.printf("The smallest element in the array is: %d%n",smallest);

        //Single printf statement that displays the elements of the first row of array t
        System.out.printf("%d, %d, %d%n", t[0][0], t[0][1], t[0][2]);

        //Statement that totals the elements of column three
        int totalOfElementsInColumnThree = t[0][2] + t[1][2];
        System.out.printf("Total of elements in column 3 is: %d",totalOfElementsInColumnThree);

//        for (int row=0; row<t.length; row++){
//            System.out.print(row);
//            for(int column=0; column<t[row].length; column++){
//                System.out.println("Input Element: ");
//                int input = sc.nextInt();
//                t[row][column] = input;
//            }
//        }
    }
}
