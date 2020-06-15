-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.


START TRANSACTION;

INSERT INTO actor (first_name,last_name)
VALUES('Hampton','Avenue'), ('Lisa','Byway')

--COMMIT;
ROLLBACK;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.



START TRANSACTION;

INSERT INTO film (title,description, release_year, language_id, length)
VALUES('Euclidean PI','The epic story of Euclid as a pizza delivery boy in
-- ancient Greece','2008',1,198 )

--COMMIT;
ROLLBACK;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

START TRANSACTION;

--film_id = 1001
--HAMPTON = 201
--Byway = 202
INSERT INTO film_actor (actor_id, film_id)
VALUES (201, 1001)


--COMMIT;
ROLLBACK;

-- 4. Add Mathmagical to the category table.
START TRANSACTION;

INSERT INTO category(name)
VALUES('Mathmagical');

SELECT *
FROM category


ROLLBACK;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

--EGG IGBY 274
--KARATE MOON 494
--RANDOM GO 714
--YOUNG LANGUAGE 996

START TRANSACTION;

UPDATE film_category
SET category_id = 19
WHERE film_id = 274;

UPDATE film_category
SET category_id = 19
WHERE film_id = 494;

UPDATE film_category
SET category_id = 19
WHERE film_id = 714;

UPDATE film_category
SET category_id = 19
WHERE film_id = 996;

UPDATE film_category
SET category_id = 19
WHERE film_id = 1001;


ROLLBACK;



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
START TRANSACTION;

UPDATE film
SET rating = 'G'
WHERE film_id IN(
    SELECT film_id
    FROM film_category
    WHERE category_id = 18
);


ROLLBACK;
-- accordingly.
-- (5 rows affected)

-- 7. Add a copy of "Euclidean PI" to all the stores.
START TRANSACTION;

INSERT INTO inventory(film_id,store_id)
VALUES(1001, 1);

INSERT INTO inventory(film_id,store_id)
VALUES(1001, 2);


ROLLBACK;

SELECT * FROM inventory WHERE film_id = 1001;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

DELETE 
FROM film
WHERE film_id = 1001;


-- It doesn't work because the delete "violates foreign key constraint "film_actor_film_id_fkey" on table "film
--_actor""

-- 9. Delete Mathmagical from the category table.

Delete
FROM category
WHERE name = 'Mathmagical';

-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
--update or delete on table "category" violates foreign key constraint 
--"film_category_category_id_fkey" on table "film_category"

-- 10. Delete all links to Mathmagical in the film_category tale.
DELETE
FROM film_category
WHERE category_id = 19;




-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

--It did work because film_category doesnt violate any constraint. It was inserted into category where 
--category_id is the primary key. Yet film_category only holds foreign keys. 

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
START TRANSACTION;

Delete
FROM category
WHERE name = 'Mathmagical';

ROLLBACK;

START TRANSACTION;

DELETE 
FROM film
WHERE film_id = 1001;

ROLLBACK;

-- First one succeeded bc it only belonged to one table after deleting it from its foreign key in the
-- film_category table, the second one still fails because the film has values in other tables still


-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- First one succeeded bc it only belonged to one table after deleting it from its foreign key in the
-- film_category table, the second one still fails because the film has values in other tables still

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

SELECT *
FROM film
WHERE film_id = 1001;

-- You have to remove the film from the tables where 
-- its film_id exists(i.e film_category, film_actor, film_id)







