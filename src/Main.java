/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */


public class Main {
    public static void main(String[] args) {
    String[][] arr = new String[5][2];
    checkArray(arr);
    }

    public static void checkArray(String[][] arr){
try {
    for (int i = 0; i < 4; i++) {
        for (int k = 0; k < 4; k++) {

            System.out.println(arr[i][k]);
        }
    }
}catch(Exception e){
    System.out.println("MyArraySizeException");
};


    }
}
