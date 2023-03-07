import Characters.Actor;
import Characters.NullActor;
import Commands.Command;
import java.util.Random;

public class InputHandler {

    private Command buttonX_;
    private Command buttonY_;
    private Command buttonA_;
    private Command buttonB_;

    public void handleInput() {

        if(isPressed(Button.X)) {
            buttonX_.execute();
        }
        else if(isPressed(Button.Y)) {
            buttonY_.execute();
        }
        else if(isPressed(Button.A)) {
            buttonA_.execute();
        }
        else if(isPressed(Button.B)) {
            buttonB_.execute();
        }
    }

    private Button curr;
    private Actor player = new NullActor();

    public void click() {
        curr = Button.values()[new Random().nextInt(Button.values().length)];
    }

    public void updateActor(Actor actor) {
        player = actor;
    }

    private boolean isPressed(Button pressed) {
        return curr == pressed;
    }

}
