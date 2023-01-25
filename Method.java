import java.util.Scanner;

class MathRandom {
    public static void main(String[] args) {

        //Методы: задание 1
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int myArr[] = new int[x];
        System.out.println("Длинна вашего массива: " + myArr.length);
        System.out.print("Элементы вашего массива: " );

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) Math.round(Math.random() * x);
            System.out.print(myArr[i] + " ");
            
        }
        System.out.println();


        //Методы: задание 2
       /* int maxArr [] = new int [x];
        int maxNum = maxArr[i];
        /*for (int j : maxArr){
            if (j > maxNum)
                maxNum = j;
            }
        System.out.println("Максимальное число массива = " + maxNum);*/

    }
}

/*class ArrayMax {
    public static void main(String[] args) {
        int[] intArray = {24, 2, 0, 34, 12, 110, 2};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
    }
}*/