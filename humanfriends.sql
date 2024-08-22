CREATE DATABASE human_friends;
CREATE TABLE cats (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	type VARCHAR(20),
	birth_date DATE,
	commands VARCHAR(30)
	);
CREATE TABLE dogs (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	type VARCHAR(20),
	birth_date DATE,
	commands VARCHAR(30)
	);
CREATE TABLE hamsters (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	type VARCHAR(20),
	birth_date DATE,
	commands VARCHAR(30)
	);
CREATE TABLE donkeys (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	type VARCHAR(20),
	birth_date DATE,
	commands VARCHAR(30)
	);
CREATE TABLE camels (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	type VARCHAR(20),
	birth_date DATE,
	commands VARCHAR(30)
	);
CREATE TABLE horses (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	type VARCHAR(20),
	birth_date DATE,
	commands VARCHAR(30)
	);

INSERT INTO horses (name, type, birth_date, commands) VALUES('first', 'horse', 20230101, 'gallop');
INSERT INTO horses (name, type, birth_date, commands) VALUES('second', 'horse', 20210101, 'gallop');
INSERT INTO horses (name, type, birth_date, commands) VALUES('third', 'horse', 20240101, 'gallop');

INSERT INTO donkeys (name, type, birth_date, commands) VALUES('first', 'donkey', 20230101, 'brey');
INSERT INTO donkeys (name, type, birth_date, commands) VALUES('second', 'donkey', 20210101, 'brey');
INSERT INTO donkeys (name, type, birth_date, commands) VALUES('third', 'donkey', 20180101, 'brey');

INSERT INTO camels (name, type, birth_date, commands) VALUES('first', 'camel', 20220101, 'sit');
INSERT INTO camels (name, type, birth_date, commands) VALUES('second', 'camel', 20240301, 'sit');
INSERT INTO camels (name, type, birth_date, commands) VALUES('third', 'camel', 20230601, 'sit');

INSERT INTO dogs (name, type, birth_date, commands) VALUES('third', 'dog', 20180601, 'bark');
INSERT INTO dogs (name, type, birth_date, commands) VALUES('second', 'dog', 20170601, 'bark');
INSERT INTO dogs (name, type, birth_date, commands) VALUES('first', 'dog', 20180201, 'bark');

INSERT INTO cats (name, type, birth_date, commands) VALUES('first', 'cat', 20210201, 'meow');
INSERT INTO cats (name, type, birth_date, commands) VALUES('second', 'cat', 20230201, 'meow');
INSERT INTO cats (name, type, birth_date, commands) VALUES('third', 'cat', 20210102, 'meow');

INSERT INTO hamster (name, type, birth_date, commands) VALUES('first', 'hamster', 20220201, 'spin');
INSERT INTO hamster (name, type, birth_date, commands) VALUES('second', 'hamster', 20240401, 'spin');
INSERT INTO hamster (name, type, birth_date, commands) VALUES('third', 'hamster', 20210301, 'spin');

CREATE TABLE horses_donkeys (
  SELECT name, type, birth_date, commands FROM donkeys UNION SELECT name, type, birth_date, commands FROM horses
);

ALTER TABLE horses_donkeys
ADD id INT AUTO_INCREMENT PRIMARY KEY FIRST;

TRUNCATE TABLE camels;

CREATE TABLE pets (
  SELECT name, type, birth_date, commands FROM dogs UNION SELECT name, type, birth_date, commands FROM cats UNION SELECT name, type, birth_date, commands FROM hamsters);

ALTER TABLE pets
ADD id INT AUTO_INCREMENT PRIMARY KEY FIRST;

CREATE TABLE human_friends (
  SELECT name, type, birth_date, commands FROM horses_donkeys UNION SELECT name, type, birth_date, commands FROM pets
);

ALTER TABLE human_friends
ADD id INT AUTO_INCREMENT PRIMARY KEY FIRST;

CREATE TABLE human_friends_1_3 (
  SELECT name,
	type,
	birth_date, 
	commands,
	(EXTRACT(MONTH FROM CURDATE()) - EXTRACT(MONTH FROM birth_date) + 12 * (EXTRACT(YEAR FROM CURDATE()) - EXTRACT(YEAR FROM birth_date))) AS age,
	FROM human_friends WHERE ((DATEDIFF(CURDATE(),birth_date) > 365) AND (DATEDIFF(CURDATE(), birth_date) < 1095))
);

ALTER TABLE human_friends_1_3
ADD id INT AUTO_INCREMENT PRIMARY KEY FIRST;