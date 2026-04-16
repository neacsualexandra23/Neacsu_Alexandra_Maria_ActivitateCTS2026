package ro.ase.cts.proxy.exercitiul1_.main;

import ro.ase.cts.proxy.exercitiul1_.model.IVideoService;
import ro.ase.cts.proxy.exercitiul1_.model.Proxy;
import ro.ase.cts.proxy.exercitiul1_.model.VideoService;

public class Main {
    public static void main(String[] args) {

        IVideoService video=new Proxy(new VideoService());

        video.playVideo("Radu");
        video.playVideo("Ionel");

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