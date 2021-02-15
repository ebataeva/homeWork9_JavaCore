public class MyArrayDataException extends Exception {
    public MyArrayDataException(String n, int i, int j) {

        super("некорректные данные "+n+" в ячейке "+i+" "+j);

    }


}

