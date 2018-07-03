-- create table person(
-- id integer not null,
-- name varchar(255) not null,
-- location varchar(255),
-- birth_date timestamp ,
-- primary key (id)
-- );

-- jdbc:h2:mem:testdb
INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10001, 'Ranga', 'Hyderabad', sysdate());
INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'James', 'New York', sysdate());
INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'Pieter', 'Amsterdam', sysdate());


insert into USER (ID,BIRTH_DATE,NAME
) values (10001,sysdate(),'Jam');
insert into user (ID,BIRTH_DATE,NAME
) values (10002,sysdate(),'Jack');
insert into user (ID,BIRTH_DATE,NAME
) values (10003,sysdate(),'Billy');


insert into post (id,description,user_id)
values (11001,'my first post',10001);
insert into post (id,description,user_id)
values (11002,'my second post',10001);