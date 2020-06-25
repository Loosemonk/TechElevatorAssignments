package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	private AuctionDAO dao;

	public AuctionController() {
		this.dao = new MemoryAuctionDAO();
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Auction> list(@RequestParam(required = false, defaultValue = "") String title_like,
			@RequestParam(required = false, defaultValue = "0.0") double currentBid_lte) {
		String empty = "";
		if (!title_like.equals(empty)) {
			return dao.searchByTitle(title_like);
		}
		if (currentBid_lte > 0.0) {
			return dao.searchByPrice(currentBid_lte);
		}
		return dao.list();
	}

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id) {
		return dao.get(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Auction addAuction(@RequestBody Auction auction) {
		return dao.create(auction);

	}
}