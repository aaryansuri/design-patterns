import Characters.Actor;

public class Context {

    private final Actor currentCharacter;

    public Actor getCharacter() {
        return currentCharacter;
    }

    public static class Builder {
        private Actor character;

        Builder of(Actor character) {
            this.character = character;
            return this;
        }

        Context build() {
            return new Context(this);
        }
    }

    public Context(Builder builder) {
        this.currentCharacter = builder.character;
    }
}
