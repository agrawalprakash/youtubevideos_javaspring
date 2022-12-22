package net.risingdev.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.risingdev.springboot.entity.YoutubeVideo;

public interface YoutubeVideoDao 
extends JpaRepository<YoutubeVideo, Long>
{
	

}
