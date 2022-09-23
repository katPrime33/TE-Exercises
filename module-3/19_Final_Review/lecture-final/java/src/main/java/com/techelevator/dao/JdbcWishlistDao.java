package com.techelevator.dao;

import com.techelevator.model.Wishlist;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcWishlistDao implements WishlistDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcWishlistDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Wishlist> list(long userId) {
        List<Wishlist> wishlists = new ArrayList<Wishlist>();
        String sql = "SELECT id, name, user_id FROM wishlists WHERE user_id = ?";
        SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, userId);
        while (rows.next()) {
            wishlists.add(mapRowToWishlist(rows));
        }
        return wishlists;
    }

    @Override
    public Wishlist get(long wishlistId, long userId) {
        Wishlist wishlist = null;
        String sql = "SELECT id, name, user_id FROM wishlists WHERE id = ? AND user_id = ?";
        SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, wishlistId, userId);
        if (rows.next()) {
            wishlist = mapRowToWishlist(rows);
        }
        return wishlist;
    }


    @Override
    public Wishlist add(Wishlist wishlist) {
        String sql = "INSERT INTO wishlists (id, name, user_id) VALUES (DEFAULT, ?, ?) RETURNING id";
        Long id = jdbcTemplate.queryForObject(sql, Long.class, wishlist.getName(), wishlist.getUserId());
        wishlist.setId(id);
        return wishlist;
    }

    @Override
    public void update(Wishlist wishlist) {
        String sql = "UPDATE wishlists SET name = ? WHERE id = ? AND user_id = ?";
        jdbcTemplate.update(sql, wishlist.getName(), wishlist.getId(), wishlist.getUserId());
    }

    @Override
    public void delete(long wishlistId, long userId) {
        deleteWishlistFromProductJoin(wishlistId);
        String sql = "DELETE FROM wishlists WHERE id = ? AND user_id = ?";
        jdbcTemplate.update(sql, wishlistId, userId);
    }

    @Override
    public void addProductToWishlist(long productId, long wishlistId) {
        String sql = "INSERT INTO products_wishlists (product_id, wishlist_id) VALUES (?, ?)";
        jdbcTemplate.update(sql, productId, wishlistId);
    }

    private void deleteWishlistFromProductJoin(long wishlistId) {
        String sql = "DELETE FROM products_wishlists WHERE wishlist_id = ?";
        jdbcTemplate.update(sql, wishlistId);
    }

    private Integer getProductCountForWishlist(long wishlistId) {
        String sql = "SELECT COUNT(product_id) FROM products_wishlists WHERE wishlist_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, wishlistId);
    }

    private Wishlist mapRowToWishlist(SqlRowSet row) {
        Wishlist wishlist = new Wishlist();

        wishlist.setId( row.getLong("id") );
        wishlist.setName( row.getString("name") );
        wishlist.setUserId( row.getLong("user_id") );
        wishlist.setCountOfProducts( getProductCountForWishlist(wishlist.getId()) );
        return wishlist;
    }
}
