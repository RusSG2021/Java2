package lesson1;

public class Wall extends Obstacles {



    public Wall(int distance) {
        super(distance);
    }

    @Override
    public void doSomething(Competitors competitor) {
        if (competitor.getJumpHeight() > distance) System.out.println(competitor.getName() + " перепрыгнул стену");
        else {
            System.out.println(competitor.getName() + "  не смог перепрыгнуть стену");
            competitor.setInDistance(false);
        }
    }
}
