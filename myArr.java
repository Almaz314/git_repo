import java.util.Arrays;
import java.util.stream.*;

public class myArr {
    public static void main(String args[]){

                 /* МАССИВЫ */
    // **** первое задание ****
            int[] myArr = {0, 1, 2, 3, 4, 5};
            int x = myArr[0];
            myArr[0] = myArr[myArr.length-1];
            myArr[myArr.length-1] = x;
            System.out.println(Arrays.toString(myArr));

    // **** второе задание ****
            double myArray[] = {1.5, 2.0, 3.5};
            double sum = 0;
        // сумма элементов массива
            for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
            System.out.println(sum);

        // произведение элементов массива
             double rtn = 1;
             for(double i : myArray){
              rtn *= i;
        }
        System.out.println(rtn);

        // среднее элементов массива
            double averange = sum / myArray.length;
            String result = String.format("%.2f", averange);
            System.out.println(result);

    // **** третье задание ****
            String[] myArrStr = {"H", "e", "l", "l", "o"};
            for (int i = myArrStr.length - 1; i >= 0; i--) {
            System.out.print(myArrStr[i]);
            }
            System.out.println();
        // **** четвертое задание ****
            int[] myArrInt = {1, 2, 3, 4, 5};
            int sum2 = 0;
            int average2;
            for (int grade : myArrInt)
            sum2 += grade;
            average2 = sum2 / myArrInt.length;
            System.out.println(average2);
            }
    }





