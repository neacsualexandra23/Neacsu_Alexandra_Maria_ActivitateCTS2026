package ro.ase.cts.proxy.exercitiul1_.model;

public class Proxy implements IVideoService {
    private IVideoService video;

    public Proxy(IVideoService video) {
        this.video = video;
    }

    @Override
    public void playVideo(String user) {
        boolean estePremium = false;

        if (user.equals("Ana") || user.equals("Radu") || user.equals("Adi")) {
            estePremium = true;
        }

        if (estePremium) {
            video.playVideo(user);
        } else {
            System.out.println(user+ " nu are premium");
        }
    }
}