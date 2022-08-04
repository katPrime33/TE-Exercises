-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
SELECT title
FROM movie JOIN collection ON movie.collection_id = collection.collection_id
JOIN person ON collection.collection_id = person.person_id
WHERE collection_name LIKE 'Star Wars %' AND director_id != 1;