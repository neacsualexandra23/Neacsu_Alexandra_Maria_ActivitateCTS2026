package ro.ase.cts.proxy.exercitiul1_.model;

public class VideoService implements IVideoService{
    @Override
    public void playVideo(String user) {
        System.out.println("Userul "+ user + " are acces");
    }
}
