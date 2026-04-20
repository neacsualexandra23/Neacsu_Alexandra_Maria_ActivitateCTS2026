package ro.ase.cts.state.exercitiul2.model;

public class Player {
    private IState currentState;

    private IState playingState;
    private IState stoppedState;

    public Player() {
        playingState = new PlayingState(this);
        stoppedState = new StoppedState(this);

        currentState = stoppedState;
    }

    public void setState(IState state) {
        currentState = state;
    }

    public IState getPlayingState() {
        return playingState;
    }

    public IState getStoppedState() {
        return stoppedState;
    }

    public void play() {
        currentState.play();
    }

    public void stop() {
        currentState.stop();
    }
}