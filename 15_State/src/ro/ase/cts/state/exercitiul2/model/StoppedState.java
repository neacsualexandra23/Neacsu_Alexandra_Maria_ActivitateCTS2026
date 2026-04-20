package ro.ase.cts.state.exercitiul2.model;

public class StoppedState implements IState {
    private Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    public void play() {
        System.out.println("Pornește muzica.");
        player.setState(player.getPlayingState());
    }

    public void stop() {
        System.out.println("Deja oprit.");
    }
}