-- 10. For all people born before 1950 and have a home page,
-- add the home page to the end of their biography. (142 rows)
-- Note: Assume all biographies end in a period with no trailing spaces.
-- You'll need to also add a space before the website address.

--looking at person table
--biography is listed as text
--home_page is listed as varchar

--pulling out persons who have home_page that is not null and birthday before 1950
--SELECT *
--FROM person
--WHERE home_page IS NOT NULL AND birthday < '1950-01-01'
--ORDER BY birthday DESC;

 SELECT biography || ' ' || home_page AS appended_bio_with_home_page
 FROM person
 WHERE home_page IS NOT NULL AND birthday < '1950-01-01'
 ORDER BY birthday DESC;

 --this worked and ran in pgAdmin-IntelliJ is saying it doesn't affect the correct number of rows.
 --pgAdmin says it affects the correct number of rows.