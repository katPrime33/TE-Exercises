package com.techelevator.controller;

import com.techelevator.dao.ProductDao;
import com.techelevator.dao.UserDao;
import com.techelevator.dao.WishlistDao;
import com.techelevator.model.Wishlist;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
@RequestMapping("/wishlists")
public class WishlistController {

    private WishlistDao wishlistDao;
    private UserDao userDao;
    private ProductDao productDao;

    public WishlistController(WishlistDao wishlistDao, UserDao userDao, ProductDao productDao) {
        this.wishlistDao = wishlistDao;
        this.userDao = userDao;
        this.productDao = productDao;
    }

    @RequestMapping(path="", method= RequestMethod.GET)
    public List<Wishlist> list(Principal principal) {
        long userId = userDao.findIdByUsername(principal.getName());
        return wishlistDao.list(userId);
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    public Wishlist get(@PathVariable("id") long wishlistId, Principal principal) {
        long userId = userDao.findIdByUsername(principal.getName());
        Wishlist wishlist = wishlistDao.get(wishlistId, userId);
        if (wishlist != null) {
            wishlist.setProducts( productDao.getProductsForWishlist(wishlistId) );
        }
        return wishlist;
    }

    @RequestMapping(path="", method=RequestMethod.POST)
    public Wishlist add(@RequestBody Wishlist wishlist, Principal principal) {
        long userId = userDao.findIdByUsername(principal.getName());
        wishlist.setUserId(userId);
        return wishlistDao.add(wishlist);
    }

    @RequestMapping(path="/{id}", method=RequestMethod.PUT)
    public Wishlist update(@PathVariable("id") long wishlistId, @RequestBody Wishlist wishlist, Principal principal) {
        long userId = userDao.findIdByUsername(principal.getName());
        wishlist.setId(wishlistId);
        wishlist.setUserId(userId);
        wishlistDao.update(wishlist);
        return wishlist;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") long wishlistId, Principal principal) {
        long userId = userDao.findIdByUsername(principal.getName());
        wishlistDao.delete(wishlistId, userId);
    }
}
