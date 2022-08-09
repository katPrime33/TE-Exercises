DROP TABLE IF EXISTS member CASCADE;
DROP TABLE IF EXISTS interest_group;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS member_group CASCADE;
DROP TABLE IF EXISTS group_event CASCADE;


CREATE TABLE member(
member_id serial NOT NULL, --primary key
last_name varchar(50) NOT NULL,
first_name varchar(50) NOT NULL,
phone_number varchar(20) NULL,
e_mail varchar(50) NOT NULL,
birthday date NOT NULL,
reminderNotices boolean NOT NULL,
CONSTRAINT PK_member_id PRIMARY KEY(member_id)
);

CREATE TABLE interest_group(
interest_group_id serial NOT NULL, --primary key
name varchar(100) NOT NULL,
--member_id int NOT NULL, --foreign key
CONSTRAINT PK_interest_group_id PRIMARY KEY(interest_group_id)
--CONSTRAINT FK_member_id FOREIGN KEY(member_id) REFERENCES member(member_id)
);

CREATE TABLE event(
event_id serial NOT NULL, --primary key
--member_id int NOT NULL, --foreign key
interest_group_id int NOT NULL, --foreign key
name varchar (100) NOT NULL,
description varchar(500) NOT NULL,
start_date_and_time varchar(30) NOT NULL,
duration varchar(15) NOT NULL,
CONSTRAINT PK_event_id PRIMARY KEY(event_id),
--CONSTRAINT FK_member_id FOREIGN KEY(member_id) REFERENCES member(member_id),
CONSTRAINT FK_interest_group_id FOREIGN KEY(interest_group_id) REFERENCES interest_group(interest_group_id)
);

--Added these connector tables because I was thinking that sometimes members
--can be a part of multiple groups and obviously groups can have multiple members
--and i made the event_group table to link the group to the event

CREATE TABLE member_group(
interest_group_id int NOT NULL,
member_id int NOT NULL,
CONSTRAINT PK_member_group PRIMARY KEY(interest_group_id, member_id),
CONSTRAINT FK_interest_group_id FOREIGN KEY(interest_group_id) REFERENCES interest_group(interest_group_id),
CONSTRAINT FK_member_id FOREIGN KEY(member_id) REFERENCES member(member_id)
);

CREATE TABLE group_event(
interest_group_id int NOT NULL,
event_id int NOT NULL,
CONSTRAINT PK_group_event PRIMARY KEY(interest_group_id, event_id),
CONSTRAINT FK_interest_group_id FOREIGN KEY(interest_group_id) REFERENCES interest_group(interest_group_id),
CONSTRAINT FK_event_id FOREIGN KEY(event_id) REFERENCES event(event_id)
);

--MEMBERS TO ADD(---id after creation)
-- Paulsen, Kat---1
-- Paulsen, Jacci---2
-- Paulsen, Mag---3
-- Pierce, Camden---4
-- Pfeifer, Austin---5
-- Wittnebel, Vanessa---6
-- Rinker, Kayla---7
-- Garvic, Melissa---8
-- Bandy, Zane---9
-- Bandy, Hailey---10
-- Durst, Kathryn---11

--INTEREST GROUPS TO ADD(---id after creation)
-- Coffee, Cats and Crochet---1
-- Gamers Galore---2
-- Clean Cooking---3
-- Safety First! Self Defense---4
-- Book Club---5
-- Club Board---6

--EVENTS TO ADD(---id after creation)
-- Clean Cooking's Annual Fall Cookout---2
-- Learn to crochet cat slippers---3
-- Game Night---4
-- Book Club Meeting---5
-- Self Defense 101---6
-- Board Meeting---7
-- Self Defense 102---9

INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Paulsen', 'Kat', '(937) 869-3557', 'paulsennkatie@gmail.com', '1995-08-03', false);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Paulsen', 'Jacci', '(937) 654-1432', 'jmplace@yahoo.com', '1989-09-22', false);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Paulsen', 'Maggie', null, 'mpaulsen83@me.com', '1998-05-24', true);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Pierce', 'Camden', null, 'camman52@live.com', '1995-07-21', true);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Pfeifer', 'Austin', '(937) 654-1954', 'AMPlifiedonlife@hotmail.com', '1993-08-03', false);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Wittnebel', 'Vanessa', null, 'vanBelWitt@outlook.com', '1997-03-14', false);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Rinker', 'Kayla', '(937) 215-8484', 'k_rinker01@aol.com', '1995-10-31', true);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Garvic', 'Melissa', null, 'melgarlic14@gmail.com', '1996-01-01', true);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Bandy', 'Zane', null, 'zbandy15@gmail.com', '1997-05-19', true);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Bandy', 'Hailey', null, 'thenewmrsbandy@live.com', '1996-07-10', true);
INSERT INTO member(last_name, first_name, phone_number, e_mail, birthday, reminderNotices)
	VALUES('Durst', 'Kathryn', null, 'kdurst@yahoo.com', '1994-10-05', false);

INSERT INTO interest_group(name)
	VALUES('Coffee, Cats and Crochet');
INSERT INTO interest_group(name)
	VALUES('Gamers Galore');
INSERT INTO interest_group(name)
	VALUES('Clean Cooking');
INSERT INTO interest_group(name)
	VALUES('Safety First! Self Defense');
INSERT INTO interest_group(name)
	VALUES('Book Club');
INSERT INTO interest_group(name)
	VALUES('Club Board');

INSERT INTO member_group(interest_group_id, member_id)
	VALUES(1, 1);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(1, 2);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(1, 3);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(1, 8);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(1, 10);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(1, 11);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(2, 4);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(2, 5);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(2, 6);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(2, 11);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(2, 9);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(3, 3);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(3, 1);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(3, 6);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(3, 10);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(4, 2);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(4, 1);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(4, 3);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(4, 9);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(5, 3);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(5, 8);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(5, 7);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(5, 11);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(6, 1);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(6, 2);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(6, 3);
INSERT INTO member_group(interest_group_id, member_id)
	VALUES(6, 4);


INSERT INTO event(name, interest_group_id, description, start_date_and_time, duration)
	VALUES('Clean Cooking''s Annual Fall Cookout', 3, 'Learn to cook a delicious meal that will help regulate cholesterol and improve circulation.', '2022-08-13 5:30 PM', '1 hr 30 min');
INSERT INTO event(name, interest_group_id, description, start_date_and_time, duration)
	VALUES('Crochet Tutorial: Cat Slippers', 1, 'Learn to crochet a set of cat slippers for your furry friend!', '2022-08-14 12:00 PM', '3 hrs');
INSERT INTO event(name, interest_group_id, description, start_date_and_time, duration)
	VALUES('Game Night!', 2, 'Come play some fun, multiplayer games!', '2022-09-03 7:30 PM', '5 hrs');
INSERT INTO event(name, interest_group_id, description, start_date_and_time, duration)
	VALUES('Book Club Meeting', 5, 'Come discuss our latest book!', '2022-09-04 11:00 AM', '1 hr');
INSERT INTO event(name, interest_group_id, description, start_date_and_time, duration)
	VALUES('Self Defense 101', 4, 'Come learn some basic self defense moves to help keep yourself safe!', '2022-08-25 6:00 PM', '2 hrs');
INSERT INTO event(name, interest_group_id, description, start_date_and_time, duration)
	VALUES('Board Meeting', 6, 'The Club Board will gather to discuss funding for future events and the potential of onboarding new members.', '2022-09-18 10:00 AM', '1 hr 30 min');
INSERT INTO event(interest_group_id, name, description, start_date_and_time, duration)
	VALUES(4, 'Self Defense 102', 'Continue to learn self defense for beginners!', '2022-09-01 6:00 PM', '2 hrs');

INSERT INTO group_event(interest_group_id, event_id)
	VALUES(3, 2);
INSERT INTO group_event(interest_group_id, event_id)
	VALUES(1, 3);
INSERT INTO group_event(interest_group_id, event_id)
	VALUES(2, 4);
INSERT INTO group_event(interest_group_id, event_id)
	VALUES(4, 6);
INSERT INTO group_event(interest_group_id, event_id)
	VALUES(5, 5);
INSERT INTO group_event(interest_group_id, event_id)
	VALUES(6, 7);
INSERT INTO group_event(interest_group_id, event_id)
    VALUES(4, 8);
	
	
	
	
	--this is some testing i was doing throughout to ensure it runs properly.

SELECT * FROM member;

SELECT * FROM interest_group;

SELECT * FROM event;

SELECT DISTINCT ig.name, last_name || ', ' || first_name AS member_names
FROM member AS m
JOIN member_group AS mg ON m.member_id = mg.member_id
JOIN interest_group AS ig ON mg.interest_group_id = ig.interest_group_id
ORDER BY ig.name ASC;

SELECT * FROM interest_group AS ig JOIN member_group AS mg ON ig.interest_group_id = mg.interest_group_id
JOIN member AS m ON mg.member_id = m.member_id;

SELECT ig.name AS group_name, e.name AS event_name
FROM event AS e
JOIN group_event AS ge ON e.interest_group_id = ge.interest_group_id
JOIN interest_group AS ig ON ge.interest_group_id = ig.interest_group_id;

SELECT ig.interest_group_id, name, last_name || ', ' || first_name AS member_name
FROM interest_group AS ig
JOIN member_group AS mg ON ig.interest_group_id = mg.interest_group_id
JOIN member AS m ON mg.member_id = m.member_id;

SELECT e.name AS event_name, description, ig.name AS group_name, first_name || ' ' || last_name AS member_name, start_date_and_time, duration
FROM event AS e
JOIN group_event AS ge ON e.interest_group_id = ge.interest_group_id
JOIN interest_group AS ig ON ge.interest_group_id = ig.interest_group_id
JOIN member_group AS mg ON ig.interest_group_id = mg.interest_group_id
JOIN member AS m ON mg.member_id = m.member_id
GROUP BY e.event_id, ge.event_id, ge.interest_group_id, ig.interest_group_id, mg.interest_group_id, mg.member_id, m.member_id
ORDER BY e.name ASC;