import Characters.MainActor;

public class Main {

    public static void main(String[] args) {

        InputHandler handler = new InputHandler();
        handler.updateActor(new MainActor());

        handler.click();
        handler.handleInput();

    }
}