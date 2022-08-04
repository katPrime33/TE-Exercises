-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT title
FROM movie JOIN collection ON movie.collection_id = collection.collection_id
WHERE collection_name = 'Star Wars Collection'

UNION

SELECT title
from movie JOIN person ON movie.home_page = person.home_page
WHERE person_name != 'George Lucas';