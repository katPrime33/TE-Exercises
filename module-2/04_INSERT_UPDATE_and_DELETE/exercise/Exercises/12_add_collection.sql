-- 12. Create a "Bill Murray Collection" in the collection table.
--For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

BEGIN TRANSACTION;

INSERT INTO collection (collection_name)
    VALUES ('Bill Murray Collection');

UPDATE collection
SET collection_id = 1795483
WHERE collection_id IS NULL AND collection_id IN (SELECT movie_id FROM movie WHERE movie_id = 399174 AND movie_id = 10315 AND movie_id = 120467 AND movie_id = 83666 AND movie_id = 137 AND movie_id = 10433);

COMMIT;

--this worked and ran in pgAdmin-IntelliJ is saying it doesn't affect the correct number of rows.
--pgAdmin says it affects the correct number of rows.