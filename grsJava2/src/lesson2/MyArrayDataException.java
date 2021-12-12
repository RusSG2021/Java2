package lesson2;

public class MyArrayDataException extends NumberFormatException {
    private int line;
    private int column;

    public MyArrayDataException(int line, int column, String s) {
        super(s);
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return "MyArrayDataException {"
                + getMessage()
                + ": " + column + ", " + line + " } ";
    }

}
