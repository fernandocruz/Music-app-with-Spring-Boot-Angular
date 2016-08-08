package br.com.musicapi.service;

import java.util.List;

import br.com.musicapi.model.Music;

public interface MusicService {
	
	Music save(Music music);
	List<Music> findByName(String name);
	List<Music> getAll();

}
