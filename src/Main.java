/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            String[][] arr = new String[2][2];
            checkArray(arr);

        } catch(MyArraySizeException e) {
            System.out.println(e.getMessage());


        }
    }

    public static void checkArray(String[][] arr) throws Exception {
        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4 || arr.length != 4) {
                System.out.println(arr[i].length);
                throw new MyArraySizeException();

            }
        }

    }
}