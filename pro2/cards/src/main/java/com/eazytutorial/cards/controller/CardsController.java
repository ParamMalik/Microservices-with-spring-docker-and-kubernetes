package com.eazytutorial.cards.controller;

import com.eazytutorial.cards.model.CardModel;
import com.eazytutorial.cards.repo.CardModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardModelRepository cardModelRepository;

    @PostMapping("add")
    public CardModel saveCard(@RequestBody CardModel cardModel) {
        return cardModelRepository.save(cardModel);
    }
    @GetMapping("/cards")
    public List<CardModel> getCards(){
        return cardModelRepository.findAll();
    }
}
