import Characters.Actor;
import Characters.NullActor;
import java.util.Random;

public class InputHandler {

    private Button curr;
    private Actor player = new NullActor();

    public void click() {
        curr = Button.values()[new Random().nextInt(Button.values().length)];
    }

    public void handleInput() {

        if(isPressed(Button.X)) {
            player.jump();
        }
        else if(isPressed(Button.Y)) {
            player.fire();
        }
        else if(isPressed(Button.A)) {
            player.swapWeapon();
        }
        else if(isPressed(Button.B)) {
            player.lurchIn();
        }
    }

    public void updateActor(Actor actor) {
        player = actor;
    }

    private boolean isPressed(Button pressed) {
        return curr == pressed;
    }

}
