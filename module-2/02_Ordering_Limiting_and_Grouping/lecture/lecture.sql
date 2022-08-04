-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT population
FROM state
ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region.
--The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_abbreviation, census_region
FROM state
WHERE census_region IS NOT NULL
ORDER BY census_region DESC, state_abbreviation;

-- The biggest park by area
SELECT park_name, area
FROM park
ORDER BY area DESC
LIMIT 1;

-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
FROM city
ORDER BY population DESC
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT park_name, date_established
FROM park
ORDER BY date_established ASC, park_name ASC
LIMIT 20;



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || ', ' || state_abbreviation AS city_state
FROM city
;

-- The all parks by name and date established.
SELECT park_name || ' Est. ' || date_established AS parks_established
FROM park
;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT census_region || ', ' || state_name AS census_and_state
FROM state
WHERE census_region IN ('West', 'Midwest')
ORDER BY census_and_state
;


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG (population) AS average_population
FROM state
;

-- Total population in the West and South census regions
SELECT SUM(population)
FROM state
WHERE census_region = 'West' AND census_region = 'South'
;

-- The number of cities with populations greater than 1 million
SELECT COUNT(*) AS num_cities_get_1_mil
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT(*) AS num_of_states_with_nicknames
FROM state
WHERE state_nickname IS NOT NULL;

-- The area of the smallest and largest parks.
SELECT MIN(area) AS min_area, MAX(area) AS max_area
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.


-- Determine the average park area depending upon whether parks allow camping or not.


-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population) AS sum_of_state_popoulations
FROM state
GROUP BY state_abbreviation
ORDER BY state_abbreviation;


-- The smallest city population in each state ordered by city population.



-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)

-- Display the 11th through the 20th highest populated states
SELECT *
FROM state
ORDER BY population
OFFSET 10;


-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.
SELECT city_name
FROM city
WHERE city_id IN(
SELECT capital
FROM state
WHERE census_region = 'Northeast'
);