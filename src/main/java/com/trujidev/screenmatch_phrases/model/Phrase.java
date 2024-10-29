package com.trujidev.screenmatch_phrases.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "phrases")
public class Phrase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String phrase;
  private String character;
  private String poster;

}