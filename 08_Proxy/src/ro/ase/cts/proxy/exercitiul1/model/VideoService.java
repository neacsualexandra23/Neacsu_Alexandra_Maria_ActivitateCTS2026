package ro.ase.cts.proxy.exercitiul1.model;

class VideoService implements IVideoService {

    @Override
    public void playVideo(String user) {
        System.out.println("Video is playing for user: " + user);
    }
}