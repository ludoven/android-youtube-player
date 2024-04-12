package com.pierfrancescosoffritti.androidyoutubeplayer.core.sampleapp.examples.simpleExample;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.aytplayersample.R;

public class SimpleExampleActivity extends AppCompatActivity implements YouTubePlayerListener {

  private YouTubePlayerView youTubePlayerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_example);

    youTubePlayerView = findViewById(R.id.youtube_player_view);
    getLifecycle().addObserver(youTubePlayerView);

    youTubePlayerView.addYouTubePlayerListener(this);
  }

  @Override
  public void onConfigurationChanged(@NonNull Configuration newConfig) {
    super.onConfigurationChanged(newConfig);

    // Checks the orientation of the screen
    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
      youTubePlayerView.matchParent();
    } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
      youTubePlayerView.wrapContent();
    }
  }

  @Override
  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
    Log.e("SimpleExampleActivity","==========onReady=========");

  }

  @Override
  public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState state) {

  }

  @Override
  public void onPlaybackQualityChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackQuality playbackQuality) {
    Log.e("SimpleExampleActivity","==================="+playbackQuality.ordinal());

  }

  @Override
  public void onPlaybackRateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlaybackRate playbackRate) {

  }

  @Override
  public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError error) {

  }

  @Override
  public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float second) {

  }

  @Override
  public void onVideoDuration(@NonNull YouTubePlayer youTubePlayer, float duration) {

  }

  @Override
  public void onVideoLoadedFraction(@NonNull YouTubePlayer youTubePlayer, float loadedFraction) {

  }

  @Override
  public void onVideoId(@NonNull YouTubePlayer youTubePlayer, @NonNull String videoId) {
    youTubePlayer.setPlaybackQuality("hd1080");
    youTubePlayer.getPlaybackQuality();
  }

  @Override
  public void onApiChange(@NonNull YouTubePlayer youTubePlayer) {

  }

  @Override
  public void onVideoQuality(@NonNull YouTubePlayer youTubePlayer, @NonNull String quality) {
    Log.e("SimpleExampleActivity",quality);
  }
}
