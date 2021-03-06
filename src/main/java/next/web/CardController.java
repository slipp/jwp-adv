package next.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import next.domain.Card;
import next.domain.CardRepository;

@RestController
public class CardController {
	@Autowired
	private CardRepository cardRepository;
	
	@RequestMapping("/api/cards")
	public Iterable<Card> cards() {
		return cardRepository.findAll();
	}
}
