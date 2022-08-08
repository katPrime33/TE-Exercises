-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows)
-- Note: Don't remove the actors themselves, just make it so it seems no one appeared in the movie.

DELETE FROM movie_actor
WHERE actor_id IN (SELECT actor_id FROM movie_actor WHERE movie_id = 299536 AND actor_id = 3223 AND actor_id = 74568 AND actor_id = 16828 AND actor_id = 1245 AND actor_id = 71580 AND actor_id = 1136406 AND actor_id = 172069 AND actor_id = 1896 AND actor_id = 8691 AND actor_id = 543261 AND actor_id = 550843 AND actor_id = 6162 AND actor_id = 53650 AND actor_id = 60898);

--this worked and ran in pgAdmin-IntelliJ is saying it doesn't affect the correct number of rows.
--pgAdmin says it affects the correct number of rows.