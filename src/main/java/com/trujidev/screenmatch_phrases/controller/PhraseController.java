package com.trujidev.screenmatch_phrases.controller;

import com.trujidev.screenmatch_phrases.dto.PhraseDTO;
import com.trujidev.screenmatch_phrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

  @Autowired
  private PhraseService service;

  @GetMapping("/series/phrases")
  public PhraseDTO getPhrase() {
    return this.service.getRandomPhrase();
  }

}