package lesson1;

public class Treadmill extends Obstacles {



    public Treadmill(int distance) {
        super(distance);
    }

    @Override
    public void doSomething(Competitors competitor) {
        if (competitor.getRunDistance() > distance) System.out.println(competitor.getName() + " смог пробежать");
        else {
            System.out.println(competitor.getName() + "  не смог пробежать");
            competitor.setInDistance(false);
        }
    }
}
