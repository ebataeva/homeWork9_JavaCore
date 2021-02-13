/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */


public class Main {
    final static int SIZE = 4;
    public static void main(String[] args) throws Exception {
        String[][] arr = {{"2", "2", "3", "4"}, {"2","","",""}, {"1","2","1","1"}, {"2","2","1","2"}};
        try {

            checkArray(arr);
            System.out.println(checkArray(arr));

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());


        }
    }

    public static int checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int n = 0;
        for (int i = 0; i < SIZE; i++) {
            if (arr[i].length != SIZE || arr.length != SIZE) {

                throw new MyArraySizeException();

            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        n += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(arr[i][j], i, j);
                    }

                }

            }
        }
return n;
    }
}