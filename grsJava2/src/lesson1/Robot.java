package lesson1;

public class Robot extends Competitors {

    public Robot(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getRunDistance() {
        return super.getRunDistance();
    }

    @Override
    public int getJumpHeight() {
        return super.getJumpHeight();
    }
}
