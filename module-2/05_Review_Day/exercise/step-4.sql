-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name
SELECT p.name, c.name, open_from_mm, open_to_mm, daily_fee
FROM campground AS c
JOIN park AS p ON c.park_id = p.park_id
ORDER BY p.name, c.name;


-- select the park name and the total number of campgrounds for each park ordered by park name
SELECT p.name, COUNT(c.name)
FROM park AS p
JOIN campground AS c ON p.park_id = c.park_id
GROUP BY p.name
ORDER BY p.name ASC;



-- select the park name, campground name, site number, max occupancy, accessible, max rv length,
-- utilities where the campground name is 'Blackwoods'
SELECT p.name, c.name, site_number, max_occupancy, accessible, max_rv_length, utilities
FROM site AS s
JOIN campground AS c ON s.campground_id = c.campground_id
JOIN park AS p ON c.campground_id = p.park_id
WHERE c.name = 'Blackwoods';

--/*
--  select park name, campground, total number of sites (column alias 'number_of_sites') ordered by park

--  -------------------------------------------------
--    Acadia	Blackwoods	276
--    Acadia	Seawall	198
--    Acadia	Schoodic Woods	92
--    Arches	"Devil's Garden"	49
--    Arches	Canyon Wren Group Site	1
--    Arches	Juniper Group Site	1
--    Cuyahoga Valley	The Unnamed Primitive Campsites	5
--  -------------------------------------------------
--*/
SELECT p.name, c.name, COUNT(site_number) AS num_of_sites
FROM site AS s
JOIN campground AS c ON s.campground_id = c.campground_id
JOIN park AS p ON c.park_id = p.park_id
GROUP BY p.name, c.name
ORDER BY p.name ASC;


-- select site number, reservation name, reservation from and to date ordered by reservation from date
SELECT site_number, r.name, from_date || ' - ' || to_date AS reservation_dates
FROM reservation AS r
	JOIN site AS s ON r.site_id = s.site_id
ORDER BY from_date ASC;



/*
  select campground name, total number of reservations for each campground ordered by total reservations desc
  -------------------------------------------------
    Seawall	13
    Blackwoods	9
    "Devil's Garden"	7
    Schoodic Woods	7
    The Unnamed Primitive Campsites	5
    Canyon Wren Group Site	4
    Juniper Group Site	4
  -------------------------------------------------
*/
SELECT c.name, COUNT(*) AS num_of_reservations
FROM reservation AS r
	JOIN site AS s ON r.site_id = s.site_id
	JOIN campground AS c ON s.campground_id = c.campground_id
	GROUP BY c.name
ORDER BY num_of_reservations DESC;



