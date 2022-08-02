<<<<<<< HEAD
-- 9. The name, abbreviation, population, and sales tax of all states and territories
--with a sales tax greater than 6.6% (9 rows)
=======
-- 9. The name, abbreviation, population, and sales tax of all states and territories with a sales tax greater than 6.6% (9 rows)
>>>>>>> ea8e776c4a8e72ec68f1615e29730f3215d59f1d
SELECT state_name, state_abbreviation, population, sales_tax
FROM state
WHERE sales_tax > 6.6;
