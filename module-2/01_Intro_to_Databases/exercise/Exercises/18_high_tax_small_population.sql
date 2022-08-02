<<<<<<< HEAD
-- 18. The name, population, and sales tax of all records in the state table with a sales tax of
--at least 7% or have a population of less than 1,000,000 (17 rows)
=======
-- 18. The name, population, and sales tax of all records in the state table with a sales tax of at least 7% or have a population of less than 1,000,000 (17 rows)
>>>>>>> ea8e776c4a8e72ec68f1615e29730f3215d59f1d
SELECT state_name, population, sales_tax
FROM state
WHERE sales_tax >= 7 OR population < 1000000;
