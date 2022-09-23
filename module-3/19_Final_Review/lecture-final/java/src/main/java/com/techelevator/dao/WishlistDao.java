package com.techelevator.dao;

import com.techelevator.model.Wishlist;

import java.util.List;

public interface WishlistDao {

    List<Wishlist> list(long userId);
    Wishlist get(long wishlistId, long userId);
    Wishlist add(Wishlist wishlist);
    void update(Wishlist wishlist);
    void delete(long wishlistId, long userId);
    void addProductToWishlist(long productId, long wishlistId);

}
