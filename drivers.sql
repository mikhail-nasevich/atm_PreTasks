
!-- mysql  Ver 14.14 Distrib 5.7.24, for macos10.14 (x86_64) using  EditLine wrapper





DROP TABLE IF EXISTS drivers


CREATE TABLE drivers (  Name varchar(30) NOT NULL,  Surmane varchar (30) NOT NULL,  Id int (10) NOT NULL,  Salary decimal (10, 2) NOT NULL)


LOCK TABLES drivers WRITE

INSERT INTO drivers VALUES ('Bill', 'Jonce', 14560078,2450.25),('Fill', 'Green', 14568992, 2800),('Matt', 'Doo', 14562324, 2000);

UNLOCK TABLES;




!-- to test table creation

SELECT * FROM drivers