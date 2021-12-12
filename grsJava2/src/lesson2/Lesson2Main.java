package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
        String[][] myArray = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            sumArray(myArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }


    }

    public static void sumArray(String[][] arr) throws MyArraySizeException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4)
                throw new MyArraySizeException(arr.length, "Неправильное количество столбцов (должно быть 4), столбцов");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4)
                    throw new MyArraySizeException(i + 1, "Неправильное количество элементов в строке (должно быть 4), строка");
                try {
                    sum += Integer.parseInt(arr[j][i]);
                } catch (NumberFormatException e) {
                   throw new MyArrayDataException(i + 1, j + 1, "Не удаётся преобразовать строку в чисту. Строка, столбец");
                }
            }
        }
        System.out.println(sum);
    }


}
