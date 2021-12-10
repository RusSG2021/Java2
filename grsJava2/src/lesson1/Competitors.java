package lesson1;

abstract class Competitors {
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean inDistance;

    public Competitors(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.inDistance = true;
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public boolean isInDistance() {
        return inDistance;
    }

    public void setInDistance(boolean inDistance) {
        this.inDistance = inDistance;
    }
}
