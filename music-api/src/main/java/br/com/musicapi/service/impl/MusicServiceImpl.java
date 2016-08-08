package br.com.musicapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.musicapi.model.Music;
import br.com.musicapi.repository.MusicRepository;
import br.com.musicapi.service.MusicService;

@Service
public class MusicServiceImpl implements MusicService {
	
	@Autowired
	private MusicRepository repository;

	@Override
	public Music save(Music music) {
		return repository.save(music);
	}

	@Override
	public List<Music> findByName(String musicsname) {
		
		if(musicsname != null && !musicsname.isEmpty()){
			return repository.findByNameContaining(musicsname);
		}
		
		return new ArrayList<Music>();
	}

	@Override
	public List<Music> getAll() {
		return repository.findAll();
	}

}
