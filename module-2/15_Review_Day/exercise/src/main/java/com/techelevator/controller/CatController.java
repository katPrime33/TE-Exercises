package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class CatController {

    private static final String API_BASE_URL = "http://localhost:8080/";
    private final RestTemplate restTemplate = new RestTemplate();

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

@RequestMapping(path = "api/cards/random", method = RequestMethod.GET)
    public CatCard getRandomCatCard() throws CatCardNotFoundException{
        CatCard catCard = new CatCard();
        //build cat card object/use service classes to get necessary data
        CatFact fact = catFactService.getFact();
        CatPic pic = catPicService.getPic();
        catCard.setCatFact(fact.getText());
        catCard.setImgUrl(pic.getFile());
        return catCard;
}

@RequestMapping(path = "api/cards", method = RequestMethod.GET)
public List<CatCard> listCatCards(){
        return catCardDao.list();
}

@RequestMapping(path = "api/cards/{id}", method = RequestMethod.GET)
public CatCard getCatCardById(@PathVariable("id") long catCardId) throws CatCardNotFoundException{
        return catCardDao.get(catCardId);
}

@RequestMapping(path = "api/cards", method = RequestMethod.POST)
    public boolean createNewCatCard(@Valid @RequestBody CatCard catCard) throws CatCardNotFoundException{
        return catCardDao.save(catCard);
}

@RequestMapping(path = "api/cards/{id}", method = RequestMethod.PUT)
    public boolean update(@RequestBody CatCard updatedCatCard, @PathVariable("id") long catCardId)
        throws CatCardNotFoundException {
        return catCardDao.update(catCardId, updatedCatCard);
}

@RequestMapping(path = "api/cards/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") long catCardId) throws CatCardNotFoundException{
        catCardDao.delete(catCardId);
}

}
