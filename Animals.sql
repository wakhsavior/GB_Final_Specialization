CREATE TABLE `human_friends`.`animal` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `animal_name` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`));


CREATE TABLE `human_friends`.`pets` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `pets_name` VARCHAR(45) NOT NULL,
	`id_animal` INT,
	PRIMARY KEY (`id`));

CREATE TABLE `human_friends`.`pack_Animals` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `pack_Name` VARCHAR(45) NULL,
    `id_animal` INT,
	PRIMARY KEY (`id`));

CREATE TABLE `cats`(
  `id` Int NOT NULL AUTO_INCREMENT,
  `name` Varchar(30) NOT NULL,
  `date_birth` Date NOT NULL,
  `commands` Varchar(300),
  `id_pets` INT,
	PRIMARY KEY (`id`));

CREATE TABLE `dogs`(
  `id` Int NOT NULL AUTO_INCREMENT,
  `name` Varchar(30) NOT NULL,
  `date_birth` Date NOT NULL,
  `commands` Varchar(300),
  `id_pets` INT,
	PRIMARY KEY (`id`));


CREATE TABLE `hamsters`(
  `id` Int NOT NULL AUTO_INCREMENT,
  `name` Varchar(30) NOT NULL,
  `date_birth` Date NOT NULL,
  `commands` Varchar(300),
  `id_pets` INT,
	PRIMARY KEY (`id`));

CREATE TABLE `horses`(
  `id` Int NOT NULL AUTO_INCREMENT,
  `name` Varchar(30) NOT NULL,
  `date_birth` Date NOT NULL,
  `commands` Varchar(300),
  `id_pack_Animals` INT,
	PRIMARY KEY (`id`));

CREATE TABLE `camels`(
  `id` Int NOT NULL AUTO_INCREMENT,
  `name` Varchar(30) NOT NULL,
  `date_birth` Date NOT NULL,
  `commands` Varchar(300),
  `id_pack_Animals` INT,
	PRIMARY KEY (`id`));

CREATE TABLE `donkeys`(
  `id` Int NOT NULL AUTO_INCREMENT,
  `name` Varchar(30) NOT NULL,
  `date_birth` Date NOT NULL,
  `commands` Varchar(300),
  `id_pack_Animals` INT,
	PRIMARY KEY (`id`));
	
ALTER TABLE `pets` ADD FOREIGN KEY (`id_animal`) REFERENCES `animal` (`id`);
ALTER TABLE `pack_Animals` ADD FOREIGN KEY (`id_animal`) REFERENCES `animal` (`id`);
ALTER TABLE `cats` ADD FOREIGN KEY (`id_pets`) REFERENCES `pets` (`id`);
ALTER TABLE `dogs` ADD FOREIGN KEY (`id_pets`) REFERENCES `pets` (`id`);
ALTER TABLE `hamsters` ADD FOREIGN KEY (`id_pets`) REFERENCES `pets` (`id`);
ALTER TABLE `horses` ADD FOREIGN KEY (`id_pack_Animals`) REFERENCES `pack_Animals` (`id`);
ALTER TABLE `camels` ADD FOREIGN KEY (`id_pack_Animals`) REFERENCES `pack_Animals` (`id`);
ALTER TABLE `donkeys` ADD FOREIGN KEY (`id_pack_Animals`) REFERENCES `pack_Animals` (`id`);


INSERT INTO animal (animal_name)
VALUES
("Вьючные"),
("Домашние");

INSERT INTO pets (pets_name,id_animal)
VALUES
("Кошки",1),
("Собаки",1),
("Хомяки",1);

INSERT INTO pack_Animals (pack_Name,id_animal)
VALUES
("Лошади",2),
("Верблюды",2),
("Ослы",2);

INSERT INTO cats (name,date_birth,commands,id_pets)
VALUES
('Барсик', '2021-02-10', "сидеть, мяукать, спать", 1),
('Мурзик', '2022-04-15', "сидеть, мяукать, лежать", 1),
('Ванкувер', '2021-08-18', "бегать, мяукать, прыгать", 1);

INSERT INTO dogs (name,date_birth,commands,id_pets)
VALUES
('Барбос', '2022-11-04', "сидеть, гавкать, аппорт", 2),
('Шульц', '2019-08-21', "сидеть, гавкать, аппорт, фас", 2),
('Мухтар', '2020-11-28', "бегать, сидеть, гавкать, аппорт, фас", 2);

INSERT INTO hamsters (name,date_birth,commands,id_pets)
VALUES
('Рыжик', '2023-07-04', "спать, есть, бегать в колесе", 3),
('Грэй', '2022-12-02', "спать, есть, бегать в колесе", 3),
('Зола', '2021-11-25', "спать, есть, бегать в колесе", 3);

INSERT INTO horses (name,date_birth,commands,id_pack_Animals)
VALUES
('Адонис', '2018-05-10', "Трусца, галоп, прыжок, подзыв, надевание/снятие аммуниции", 1),
('Дарко', '2019-08-11', "подзыв, надевание/снятие аммуниции, концентрация внимания", 1),
('Жаден', '2021-10-22', "подзыв, надевание/снятие аммуниции, концентрация внимания, Трусца, галоп", 1);

INSERT INTO camels (name,date_birth,commands,id_pack_Animals)
VALUES
('Базилик', '2022-05-12', "подзыв, надевание/снятие аммуниции, провоз аммуниции, опуститься на передние колени", 2),
('Зевс', '2020-06-10', "подзыв, надевание/снятие аммуниции, провоз аммуниции, опуститься на передние колени", 2),
('Нейрон', '2021-12-22', "подзыв, надевание/снятие аммуниции, провоз аммуниции, опуститься на передние колени", 2);

INSERT INTO donkeys (name,date_birth,commands,id_pack_Animals)
VALUES
('Пират', '2018-04-22', "подзыв, надевание/снятие аммуниции, тащить плуг, тащить повозку", 3),
('Титан', '2020-07-23', "подзыв, надевание/снятие аммуниции, тащить плуг, тащить повозку", 3),
('Милан', '2022-11-10', "подзыв, надевание/снятие аммуниции, тащить плуг, тащить повозку", 3);


CREATE TABLE young_animals ( id INT NOT NULL, name varchar(50), `date_birth` Date NOT NULL, `commands` Varchar(300), `age` INT);

SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM cats where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;

INSERT INTO young_animals (id, name, date_birth, commands, age) SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM cats where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;
INSERT INTO young_animals (id, name, date_birth, commands, age) SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM dogs where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;
INSERT INTO young_animals (id, name, date_birth, commands, age) SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM hamsters where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;
INSERT INTO young_animals (id, name, date_birth, commands, age) SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM horses where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;
INSERT INTO young_animals (id, name, date_birth, commands, age) SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM camels where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;
INSERT INTO young_animals (id, name, date_birth, commands, age) SELECT id, name, date_birth, commands, timestampdiff(MONTH, date_birth, NOW()) as age FROM donkeys where timestampdiff(MONTH, date_birth, NOW()) BETWEEN 12 AND 36;



SELECT name,commands,date_birth,pack_Name as Animal FROM horses join pack_Animals on id_pack_Animals=pack_Animals.id
UNION
SELECT name,commands,date_birth,pack_Name as Animal FROM donkeys join pack_Animals on id_pack_Animals=pack_Animals.id
UNION
SELECT name,commands,date_birth,pets_name as Animal FROM cats join pets on id_pets=pets.id
UNION
SELECT name,commands,date_birth,pets_name as Animal FROM dogs join pets on id_pets=pets.id
UNION
SELECT name,commands,date_birth,pets_name as Animal FROM hamsters join pets on id_pets=pets.id;