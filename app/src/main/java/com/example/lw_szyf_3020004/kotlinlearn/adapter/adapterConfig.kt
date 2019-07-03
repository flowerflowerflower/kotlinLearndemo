package com.example.lw_szyf_3020004.kotlinlearn.adapter

import android.provider.MediaStore

/**
 * 适配器
 */
public interface MediaPlayer {
    public fun play(audioType: String, fileName: String)
}

public interface AdvancedMediaPlayer {
    public fun playVlc(fileName: String)
    public fun playMp4(fileName: String)
}


public class VlcPlayer : AdvancedMediaPlayer {
    override fun playMp4(fileName: String) {

    }

    override fun playVlc(fileName: String) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}


public class Mp4Player : AdvancedMediaPlayer {
    override fun playMp4(fileName: String) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }

    override fun playVlc(fileName: String) {

    }

}


public class MediaAdapter : MediaPlayer {

    lateinit var advancedMediaPlayer: AdvancedMediaPlayer

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", true)) {
            advancedMediaPlayer.playVlc(fileName)
        } else if (audioType.equals("mp4", true)) {
            advancedMediaPlayer.playMp4(fileName)
        }

    }


    constructor(audioType: String) {
        if (audioType.equals("vlc", true)) {
            advancedMediaPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", true)) {
            advancedMediaPlayer = Mp4Player()

        }
    }


}

public class AudioPlayer : MediaPlayer {

    lateinit var mediaAdapter: MediaAdapter
    override fun play(audioType: String, fileName: String) {

        if (audioType.equals("mp3", true)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equals("vlc", true) || audioType.equals("mp4", true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");

        }
    }


}


fun main() {
    val audioPlayer = AudioPlayer()
    audioPlayer.play("mp4", "alone.mp4")
}

