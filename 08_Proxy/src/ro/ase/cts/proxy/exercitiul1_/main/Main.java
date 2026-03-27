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
