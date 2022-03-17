package com.eazytutorial.cards.repo;

import com.eazytutorial.cards.model.CardModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardModelRepository extends MongoRepository<CardModel,String> {
}
