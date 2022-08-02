<<<<<<< HEAD
-- 21. The name and nickname for all records in the state table with no official nickname (NULL)
--or nickname starts with the word "The" (13 rows)
=======
-- 21. The name and nickname for all records in the state table with no official nickname (NULL) or nickname starts with the word "The" (13 rows)
>>>>>>> ea8e776c4a8e72ec68f1615e29730f3215d59f1d
SELECT state_name, state_nickname
FROM state
WHERE state_nickname IS NULL OR state_nickname LIKE 'The%';
