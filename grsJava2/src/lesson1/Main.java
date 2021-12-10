package lesson1;

public class Main {
    public static void main(String[] args) {
        Competitors[] competitors = new Competitors[]{
                new Human("Alice", 1000, 10),
                new Cat("Bob", 700, 30),
                new Robot("Carl", 3000, 8)
        };
        Obstacles[] obstacles = new Obstacles[]{
                new Treadmill(800),
                new Wall(9),
                new Treadmill(500)
        };

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].doSomething(competitors[i]);
                if (!competitors[i].isInDistance()) break;
            }
        }


    }


}
