-- 6. For movies that are longer than 3 hours and 30 minutes (210 minutes),
-- add the sentence "This is a long movie." to the end of the overview. (5 rows)
-- Note: The overviews end in a period with no trailing spaces.
-- You'll need to also add a space before the new sentence.
BEGIN TRANSACTION;
UPDATE movie
SET overview = "The story of British officer T.E. Lawrence's mission to aid the Arab tribes in their revolt against the Ottoman Empire during the First World War. Lawrence becomes a flamboyant, messianic figure in the cause of Arab unity but his psychological instability threatens to undermine his achievements. This is a long movie."
WHERE title = 'Lawerence of Arabia'
UPDATE movie
SET overview = "A chronicle of the rise and fall of O.J. Simpson, whose high-profile murder trial exposed the extent of American racial tensions, revealing a fractured and divided nation. This is a long movie."
WHERE title = 'O.J.: Made in America'
UPDATE movie
SET overview = "A former Prohibition-era Jewish gangster returns to the Lower East Side of Manhattan over thirty years later, where he once again must confront the ghosts and regrets of his old life. This is a long movie."
WHERE title = 'Once Upon a Time in America'
UPDATE movie
SET overview = "The spoiled daughter of a well-to-do plantation owner is forced to use every means at her disposal to claw her way out of poverty, following Maj. Gen. William Sherman's destructive 'March to the Sea,' during the American Civil War. This is a long movie."
WHERE title = 'Gone with the Wind'
UPDATE movie
SET overview = "Set in Bertolucci's ancestral region of Emilia, the film chronicles the lives of two men during the political turmoils that took place in Italy in the first half of the 20th century. This is a long movie."
WHERE title = '1900';
COMMIT;