import java.util.List;
import java.util.ArrayList;

public class Playlist {
    // The music queue
    private List<String> queue;

    public Playlist() {
        this.queue = new ArrayList<String>();
    }

    public void addFile(String file) {
        this.queue.add(file);
    }

    public int getNumberOfFiles() {
        return this.queue.size();
    }

    public void listFiles() {
        if (getNumberOfFiles() == 0) {
            System.out.println("[listFiles()]: The playlist is empty. No file found.);
        } else {
            for (int i = 0; i < getNumberOfFiles(); i++) {
                System.out.println(i + ": \"" + this.queue.get(i) + "\"");
            }
        }
    }

    public void removeFile(int idx) {
        if (idx < 0 || idx > getNumberOfFiles()) {
            System.out.println("[removeFile()]: This file cannot be removed!");
        } else {
            this.queue.remove(idx);
        }
    }

    public void removeFile(String subs) {
        boolean removed = false;
        for (int i = 0; i < getNumberOfFiles() && !removed; i++) {
			if (this.queue.get(i).indexOf(subs) != -1) {
			    removeFile(i);
                removed = true;
			}
        }

        if (!removed) {
            System.out.println("[removeFile()]: File not removed. Nothing found.");
        }
    }

    public void playFile(String file) {
        SoundEngine player = new SoundEngine();
        player.playCompletely(file);
    }

    public void playAll() {
        SoundEngine player = new SoundEngine();
        for (int i = 0; i < getNumberOfFiles(); i++) {
            player.playCompletely(this.queue.get(i));
        }
    }
}
