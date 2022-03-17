package com.eazytutorial.cards.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Document(collection = "card_data")
public class CardModel {
    @Id
    private String trackingId;
    private Long cardNumber;
    private String name;

}
