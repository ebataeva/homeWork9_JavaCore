public class MyArrayDataException extends Exception {
    public MyArrayDataException(String n, int i, int j) {

        super("некорректные данные в ячейке"+n+" "+i+" "+j);

    }


}

