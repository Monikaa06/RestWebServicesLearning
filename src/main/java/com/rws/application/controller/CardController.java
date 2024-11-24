package com.rws.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rws.application.bean.Card;
import com.rws.application.exception.CardNotFoundException;
import com.rws.application.service.CardService;

@RestController
@RequestMapping("/card")
public class CardController {

	@Autowired
	private CardService service;

	@GetMapping("/{id}")
	public Card getCardInfo(@PathVariable Long id) {
		if (id < 1) {
			throw new CardNotFoundException("card number should not be blank");
		}
		return service.getCardById(id);
	}

	@PostMapping("/")
	public String saveCardInfo(@RequestBody Card card) {
		service.save(card);
		return "Success";
	}

	@GetMapping("/")
	public List<Card> getCardInfo() {
		return service.getCardInfo();
	}
}
