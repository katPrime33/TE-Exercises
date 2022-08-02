<<<<<<< HEAD
-- 17. The name, population, and area of all records in the state table with no census region (NULL)
--and area less than 5000 square kilometers (3 rows)
=======
-- 17. The name, population, and area of all records in the state table with no census region (NULL) and area less than 5000 square kilometers (3 rows)
>>>>>>> ea8e776c4a8e72ec68f1615e29730f3215d59f1d
SELECT state_name, population, area
FROM state
WHERE census_region IS NULL AND area < 5000;
