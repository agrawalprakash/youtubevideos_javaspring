package net.risingdev.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import net.risingdev.springboot.dao.YoutubeVideoDao;
import net.risingdev.springboot.entity.YoutubeVideo;

@Service
public class YoutubeVideoServiceImpl implements YoutubeVideoService {
	
	@Autowired
	private YoutubeVideoDao youtubeVideoDao;
		
	public YoutubeVideoServiceImpl() {
				
	}

	@Override
	public List<YoutubeVideo> getVideos() {
	
		return youtubeVideoDao.findAll();
	
	}

	@Override
	public YoutubeVideo getVideo(long videoId) {
		return youtubeVideoDao.getOne(videoId);
	}

	@Override
	public YoutubeVideo addYouTubeVideo(YoutubeVideo videoDetails) {
		
		youtubeVideoDao.save(videoDetails);
		
		return videoDetails;
	}

	@Override
	public YoutubeVideo updateYoutubeVideo(YoutubeVideo videoDetails) {
		
		youtubeVideoDao.save(videoDetails);
		
		return videoDetails;
	}

	@Override
	public void deleteYoutubeVideo(long videoId) {

		YoutubeVideo video = youtubeVideoDao.getOne(videoId);
		youtubeVideoDao.delete(video);
	}


	
}
