-- 17. The titles and taglines of movies that are in the "Family" genre
-- and Samuel L. Jackson has acted in (4 rows)

SELECT title, tagline
FROM movie JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
JOIN movie_actor ON movie_genre.movie_id = movie_actor.movie_id
WHERE genre_id = 10751 AND actor_id = 2231;