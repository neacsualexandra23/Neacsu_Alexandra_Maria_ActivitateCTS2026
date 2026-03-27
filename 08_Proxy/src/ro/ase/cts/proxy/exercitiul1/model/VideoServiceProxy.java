package ro.ase.cts.proxy.exercitiul1.model;

import java.util.HashMap;
import java.util.Map;

public class VideoServiceProxy implements IVideoService {

    private VideoService videoService;
    private Map<String, Boolean> users; // user -> premium

    public VideoServiceProxy() {
        this.videoService = new VideoService();

        // simulam baza de date
        users = new HashMap<>();
        users.put("Ana", true);
        users.put("Ion", false);
    }

    @Override
    public void playVideo(String user) {
        if (users.containsKey(user) && users.get(user)) {
            videoService.playVideo(user);
        } else {
            System.out.println("Access denied for user: " + user);
        }
    }
}
