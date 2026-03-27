package ro.ase.cts.proxy.exercitiul1.main;

import ro.ase.cts.proxy.exercitiul1.model.*;

public class Main {
    public static void main(String[] args) {

        IVideoService service = new VideoServiceProxy();

        service.playVideo("Ana"); // allowed
        service.playVideo("Ion"); // denied
        service.playVideo("Radu"); // denied

    }
}

/*
Se dorește implementarea unui sistem pentru accesul la un
serviciu de streaming video.

Clasa reală: VideoService -> oferă metoda playVideo(String user)
Există o restricție:
doar utilizatorii abonați premium pot viziona video-ul
Dacă utilizatorul NU este premium -> accesul este blocat
deci Folosește Proxy Pattern pentru a controla accesul la serviciu.

// Interfața comună
interface IVideoService {
    void playVideo(String user);
}
 */