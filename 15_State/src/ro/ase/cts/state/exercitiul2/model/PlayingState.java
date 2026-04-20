package ro.ase.cts.state.exercitiul2.model;

public class PlayingState implements IState {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    public void play() {
        System.out.println("Deja rulează.");
    }

    public void stop() {
        System.out.println("Se oprește muzica.");
        player.setState(player.getStoppedState());
    }
}
