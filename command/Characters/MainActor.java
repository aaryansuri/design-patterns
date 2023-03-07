package Characters;

public class MainActor extends Actor {

    @Override
    public void jump() {
        System.out.println("2ft jumps/bunny hops");
    }

    @Override
    public void fire() {
        System.out.println("fires with ak/m4/AWP");
    }

    @Override
    public void swapWeapon() {
        System.out.println("only can swap pistol or rifle");
    }

    @Override
    public void lurchIn() {
        System.out.println("hold shift and any movement button");
    }

}
