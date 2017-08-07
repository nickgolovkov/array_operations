import java.util.Scanner;

/**
 * Created by User on 05.08.2017.
 */


public class labs {
    public static void main(String[] args) {
        System.out.print("Введите число элементов ");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        int arr[] = new int[numb];
        array_enter(arr, numb);
        System.out.println("Какие действия производить? ");
        System.out.println("1-Сортировка(пузырьком) по возрастанию ");
        System.out.println("2-Сортировка(пузырьком) по убыванию  ");
        System.out.println("3-Нахождение элемнета максимальной длины  ");
        System.out.println("4-Вывод элеиентов,длина которых больше среднего элемента  ");
        System.out.println("0-Выход  ");
        int choose = scan.nextInt();
        while( choose!=0 ) {
            if (choose == 1) {
                bubble_sort_from_min(arr, arr.length);
                array_output(arr, arr.length);
            }
            if (choose == 2) {
                bubble_sort_from_max(arr, arr.length);
                array_output(arr, arr.length);
            }
            if (choose == 3) {
                lenght(arr, arr.length);
                array_output(arr, arr.length);
            }
            if (choose == 4) {
                medium(arr);
                array_output(arr, arr.length);
            }
            System.out.println("");
            System.out.println("Какие действия производить? ");
            System.out.println("1-Сортировка(пузырьком) по возрастанию ");
            System.out.println("2-Сортировка(пузырьком) по убыванию  ");
            System.out.println("3-Нахождение элемнета максимальной длины  ");
            System.out.println("4-Вывод элеиентов,длина которых больше среднего элемента  ");
            System.out.println("0-Выход  ");
            choose = scan.nextInt();
        }
        //bubble_sort_from_min(arr, arr.length);
        //bubble_sort_from_max(arr, arr.length);
        //array_output(arr, arr.length);
        //lenght(arr, arr.length);
        //medium(arr);
    }

    private static void array_enter(int[] arr, int i) {  //ввод массива
        for (int i1 = 0; i1 < i; i1 = i1 + 1) {
            System.out.print("Введите " + i1 + "-ый элемент массива: ");
            Scanner scan = new Scanner(System.in);
            int numb = scan.nextInt();
            arr[i1] = numb;
        }
        System.out.println("Первоначальный массив :");
        for (int i1 = 0; i1 < i; i1 = i1 + 1) {
            System.out.print(" ");
            System.out.print(arr[i1]);
        }
        System.out.println("");
    }

    private static void bubble_sort_from_min(int[] arr, int i) {  /*Сортировка пузырьком по возрастанию*/
        for (int j = 0; j < arr.length - 1; j = j + 1) {
            for (int i1 = 1; i1 < arr.length - j; i1 = i1 + 1) {
                if (arr[i1] < arr[i1 - 1]) {
                    int temp = arr[i1];
                    arr[i1] = arr[i1 - 1];
                    arr[i1 - 1] = temp;
                }
            }
        }
    }

    private static void bubble_sort_from_max(int[] arr, int i) {   /*Сортировка пузырьком по убыванию*/
        for (int j = 0; j < arr.length - 1; j = j + 1) {
            for (int i1 = 1; i1 < arr.length - j; i1 = i1 + 1) {
                if (arr[i1] > arr[i1 - 1]) {
                    int temp = arr[i1];
                    arr[i1] = arr[i1 - 1];
                    arr[i1 - 1] = temp;
                }
            }
        }
    }

    private static void array_output(int[] arr,int i){ //вывод массива
        System.out.println("Конечный массив :");
        for (int i1 = 0; i1 < i; i1 = i1 + 1) {
            System.out.print(" ");
            System.out.print(arr[i1]);
        }
    }

  private static void lenght(int[] arr,int i){  // нахождение числа максимальной длины
      String str = new String();
      String str1 = new String();
      int max = arr[0];
   for (int i1=1;  i1< i; i1=i1+1){
       str= Integer.toString(arr[i1]);
       str1= Integer.toString(arr[i1-1]);
       if(str.length()>str1.length()) {
           max = arr[i1];
       }
   }
      System.out.print("Самое длинное число - ");
      System.out.println(max);
  }

  private static void medium (int [] arr){   // вывод чисел,длина которых больше среднего
      int med = arr.length/2 ;
      System.out.println("Среднее число- "+arr[med]);
      String str = Integer.toString(arr[med]);
      for (int i1=0; i1 < arr.length ; i1++){
          String str1 = Integer.toString(arr[i1]);
          if (str1.length() > str.length()){
              System.out.print(" "+arr[i1]);
          }
      }
  }

}