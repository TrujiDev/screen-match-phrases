package com.trujidev.screenmatch_phrases.repository;

import com.trujidev.screenmatch_phrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {

  @Query("SELECT p FROM Phrase p ORDER BY function('RANDOM') LIMIT 1")
  public Phrase getRandomPhrase();

}