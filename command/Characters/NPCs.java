package Characters;

public class NPCs extends Actor {

    private final String AI_API = "{AI}";

    @Override
    public void jump() {
        System.out.println(AI_API + " hops randomly");
    }

    @Override
    public void fire() {
        System.out.println(AI_API + " with any gun");
    }

    @Override
    public void swapWeapon() {
        System.out.println(AI_API + " uses global set swap strategy");
    }

    @Override
    public void lurchIn() {
        System.out.println(AI_API + " same as main character");
    }
}
