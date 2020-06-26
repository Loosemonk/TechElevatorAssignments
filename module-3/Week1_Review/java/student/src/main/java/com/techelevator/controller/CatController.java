package com.techelevator.controller;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api/cards")
public class CatController {

    private CatCardDAO catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDAO catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }
@RequestMapping(path = "/random", method = RequestMethod.GET)
public CatCard getRandomCatCard() {
	CatCard newCard = new CatCard();
    String catFact = catFactService.getFact().getText();
	newCard.setCatFact(catFact);
	String imgUrl = catPicService.getPic().getFile();
	newCard.setImgUrl(imgUrl);
	return newCard;
}

 //POST /api/cards
@ResponseStatus(HttpStatus.CREATED)
@RequestMapping(path = "", method = RequestMethod.POST)
public void saveNewCard(@Valid @RequestBody CatCard card) {
	catCardDao.save(card);
}

@ResponseStatus(HttpStatus.NO_CONTENT)
@RequestMapping(path="/{id}", method = RequestMethod.PUT)
public void updateCard(@Valid @RequestBody CatCard card, @PathVariable long id) {
	catCardDao.update(id, card);
}
//GET /api/cards
@RequestMapping(path = "", method = RequestMethod.GET)
public List<CatCard> getAllCards(){
	return catCardDao.list();
}
@RequestMapping(path = "/{id}", method = RequestMethod.GET)
public CatCard getCard(@PathVariable long id){
	return catCardDao.get(id);
}
@ResponseStatus(HttpStatus.NO_CONTENT)
@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
public void  deleteCard(@PathVariable long id) {
	 catCardDao.delete(id);

}
}