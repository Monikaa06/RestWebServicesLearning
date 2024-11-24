package com.rws.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rws.application.bean.Card;
import com.rws.application.repository.CardRepository;

@Component
public class CardService {

	@Autowired
	private CardRepository repo;

	public List<Card> getCardInfo() {
		return repo.findAll();
	}

	public Card getCardById(Long id) {
		return repo.findById(id).orElseThrow();
	}

	public Card save(Card card) {
		return repo.save(card);
	}
}
