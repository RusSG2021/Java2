package lesson2;

public class MyArraySizeException extends IndexOutOfBoundsException {
    private int num;


    public MyArraySizeException(int num, String s) {
        super(s);
        this.num = num;
    }


    @Override
    public String toString() {
        return "MyArraySizeException {"
                + getMessage()
                + ": " + num +" } ";
    }
}
