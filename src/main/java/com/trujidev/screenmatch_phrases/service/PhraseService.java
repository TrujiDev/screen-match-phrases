package com.trujidev.screenmatch_phrases.service;

import com.trujidev.screenmatch_phrases.dto.PhraseDTO;
import com.trujidev.screenmatch_phrases.model.Phrase;
import com.trujidev.screenmatch_phrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

  @Autowired
  private PhraseRepository repository;

  public PhraseDTO getRandomPhrase() {
    Phrase phrase = this.repository.getRandomPhrase();
    return new PhraseDTO(phrase.getTitle(), phrase.getPhrase(), phrase.getCharacter(), phrase.getPoster());
  }

}
