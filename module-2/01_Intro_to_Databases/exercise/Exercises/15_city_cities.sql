-- 15. The name, state abbreviation, and population for cities that end with the word "City" (11 rows)
SELECT city_name, state_abbreviation, population
FROM city
<<<<<<< HEAD
WHERE city_name LIKE '% City';
=======
WHERE city_name LIKE '%City';
>>>>>>> ea8e776c4a8e72ec68f1615e29730f3215d59f1d
