package Adapter;

public class MediaAdapter  implements MediaPlayer {


    AdvancedMediaPlayer advanceMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(("vlc")))
            advanceMusicPlayer = new VlcPlayer();

        else if (audioType.equalsIgnoreCase("mp4"))
            advanceMusicPlayer = new Mp4Player();

    }

  @Override
    public void play(String audioType,String fileName)
  {

       if(audioType.equalsIgnoreCase("vlc"))
           advanceMusicPlayer.playMp4(fileName);

       else if(audioType.equalsIgnoreCase("mp4"))
       {
           advanceMusicPlayer.playMp4(fileName);
       }
  }


}

