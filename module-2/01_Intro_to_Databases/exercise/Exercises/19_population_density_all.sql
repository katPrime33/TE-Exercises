-- 19. The name, population, area, and population density (name the column 'population_density') of
--all states, territories, and districts (56 rows)
-- Population density is expressed as people per square kilometer. In other words, population divided by area.
SELECT population, area, state_name
FROM state
WHERE population/area = population_density;
