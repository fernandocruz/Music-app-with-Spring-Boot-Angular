package br.com.musicapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.musicapi.model.Music;


public interface MusicRepository extends JpaRepository<Music, Long> {
	
	List<Music> findByNameContaining(String name);

}
