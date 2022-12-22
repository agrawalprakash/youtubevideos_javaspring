package net.risingdev.springboot.service;

import java.util.List;

import net.risingdev.springboot.entity.YoutubeVideo;

public interface YoutubeVideoService {

	public List<YoutubeVideo> getVideos();
	
	public YoutubeVideo getVideo(long videoId);

	public YoutubeVideo addYouTubeVideo(YoutubeVideo videoDetails);

	public YoutubeVideo updateYoutubeVideo(YoutubeVideo videoDetails);

	public void deleteYoutubeVideo(long parseLong);
}
