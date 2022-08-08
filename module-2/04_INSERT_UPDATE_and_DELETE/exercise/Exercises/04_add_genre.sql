-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
--Sports genre_id = 11771
--Coach Carter movie_id = 7214
BEGIN TRANSACTION;
INSERT INTO genre (genre_name)
    VALUES ('Sports');

INSERT INTO movie_genre (movie_id, genre_id)
    VALUES (7214, 11771);
COMMIT;