package answers.adrian.task;

import java.util.Random;

public class Task_6 {

    public static void main(String[] args) {


       int[][] array1 = {
               {11, 12, 13, 14},
               {21, 22, 23, 24},
               {31, 32, 33, 34}
       };


       int a = array1.length;
       int b = array1[0].length;

       int[][] array2 = new int[b][a];

       for (int i = 0; i < a; i++){
           for (int j = 0; j < b; j++){
               array2[j][i] = array1[i][j];
           }

       }

       for (int i = 0; i < b; i++){
           for(int j = 0; j < a; j++){
               System.out.print(array2[i][j] + " ");
           }
           System.out.println();
       }


    }
}
