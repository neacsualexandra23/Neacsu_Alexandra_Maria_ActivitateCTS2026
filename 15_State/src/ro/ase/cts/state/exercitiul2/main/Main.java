package ro.ase.cts.state.exercitiul2.main;
import ro.ase.cts.state.exercitiul2.model.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();  // Pornește muzica
        player.play();  // Deja rulează
        player.stop();  // Se oprește
        player.stop();  // Deja oprit
    }
}

/*
Un player audio are 2 stări:

-Stopped
-Playing

Comportament:

play()
stop()

Ideea este:
-Dacă e Stopped → play() pornește muzica
-Dacă e Playing → play() nu face nimic
Fiecare stare știe cum să reacționeze
 */