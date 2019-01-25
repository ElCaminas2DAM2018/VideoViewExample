package org.ieselcaminas.pmdm.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        // If we want to use a streaming we have to use:
        // videoView = setVideoURI(Uri.parse(stringWithURL));
        // For example:
         videoView.setVideoURI(
             Uri.parse("https://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
        // Remember to ask for permission to access the Internet in AndroidManifest.xml

        // In our example we are using a local file.
        // We will use the Android Device Monitor to create the files directory and
        // copy the video.mp4 file there
        //videoView.setVideoPath(getApplicationInfo().dataDir + "/files/video.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
