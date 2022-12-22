package net.risingdev.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.risingdev.springboot.entity.YoutubeVideo;
import net.risingdev.springboot.service.YoutubeVideoService;


@RestController
public class MyController {
	
	@Autowired
	private YoutubeVideoService youtubeService;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to Your Youtube Magazine";
		
	}
	
	@GetMapping("/videos")
	public List<YoutubeVideo> getYoutubeVideos() {
		return this.youtubeService.getVideos();
	}
	
	@GetMapping("/videos/{videoId}")
	public YoutubeVideo getYoutubeVideo(@PathVariable String videoId) {
		return this.youtubeService.getVideo(Long.parseLong(videoId));
	}
	
	@PostMapping("/videos")
	public YoutubeVideo addYouTubeVideo(@RequestBody YoutubeVideo videoDetails) {
		
		return this.youtubeService.addYouTubeVideo(videoDetails);
		
	}
	
	@PutMapping("/videos")
	public YoutubeVideo updateYoutubeVideo (@RequestBody YoutubeVideo videoDetails) {
		
		return this.youtubeService.updateYoutubeVideo(videoDetails);
		
	}
	
	@DeleteMapping("/videos/{videoId}")
	public ResponseEntity<HttpStatus> deleteYoutubeVideo(@PathVariable String videoId) {
		
		try {
			this.youtubeService.deleteYoutubeVideo(Long.parseLong(videoId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}
