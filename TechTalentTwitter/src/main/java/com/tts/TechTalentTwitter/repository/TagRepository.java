package com.tts.TechTalentTwitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TechTalentTwitter.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>  {
    
	//ability to get a tag based on its phrase
	Tag findByPhrase(String phrase);

}
