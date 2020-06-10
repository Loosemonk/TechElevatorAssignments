-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT f.title
FROM actor a
 JOIN film_actor fa ON fa.actor_id = a.actor_id
 JOIN film f ON fa.film_id = f.film_id
WHERE a.first_name = 'NICK' AND a.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT f.title
FROM actor a
 JOIN film_actor fa ON fa.actor_id = a.actor_id
 JOIN film f ON fa.film_id = f.film_id
WHERE a.first_name = 'RITA' AND a.last_name = 'REYNOLDS';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT f.title
FROM actor a
 JOIN film_actor fa ON fa.actor_id = a.actor_id
 JOIN film f ON fa.film_id = f.film_id
WHERE (a.first_name = 'JUDY' OR a.first_name = 'RIVER') AND a.last_name = 'DEAN';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT f.title
FROM film f      
 JOIN film_category ON film_category.film_id = f.film_id 
 JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT f.title
FROM film f      
 JOIN film_category ON film_category.film_id = f.film_id 
 JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT f.title
FROM film f      
 JOIN film_category ON film_category.film_id = f.film_id 
 JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Children' AND f.rating = 'G';


-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT f.title
FROM film f      
 JOIN film_category ON film_category.film_id = f.film_id 
 JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Family' AND f.rating = 'G' AND f.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT f.title
FROM actor a
 JOIN film_actor fa ON fa.actor_id = a.actor_id
 JOIN film f ON fa.film_id = f.film_id
WHERE a.first_name = 'MATTHEW' AND a.last_name = 'LEIGH' AND f.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT f.title
FROM film f      
 JOIN film_category ON film_category.film_id = f.film_id 
 JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Sci-Fi' AND f.release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT film.title
FROM film 
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON actor.actor_id = film_actor.actor_id

JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON category.category_id = film_category.category_id

WHERE actor.first_name = 'NICK' AND actor.last_name = 'STALLONE' AND category.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT address.address, city.city, address.district, country.country
FROM store
JOIN address ON address.address_id = store.address_id
JOIN city ON city.city_id = address.city_id
JOIN country ON country.country_id = city.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT store.store_id, address.address, staff.first_name, staff.last_name
FROM store
JOIN address ON address.address_id = store.address_id
JOIN staff ON staff.staff_id = store.store_id

WHERE staff_id = manager_staff_id;

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
SELECT customer.first_name, customer.last_name,COUNT(rental.rental_date) as numRENTALs
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY customer.customer_id
ORDER BY numRENTALs DESC
LIMIT 10 ;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
SELECT customer.first_name, customer.last_name,SUM(payment.amount) as numRENTALs
FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY numRENTALs DESC
LIMIT 10 ;
-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT store.store_id, address.address,COUNT(payment.amount),SUM(payment.amount),AVG(payment.amount)
FROM store
JOIN address ON address.address_id = store.address_id
JOIN inventory ON inventory.store_id  = store.store_id
JOIN rental ON  inventory.inventory_id = rental.inventory_id
JOIN payment ON payment.rental_id = rental.rental_id
Group By store.store_id, address.address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
SELECT film.title, COUNT(rental.*) as topTEN
FROM film
--JOIN rental ON rental.inventory_id = inventory.inventory_id
Join inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
GROUP BY film.title
ORDER BY  topTEN DESC
LIMIT 10;


-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
SELECT category.name ,COUNT(rental.*) as topRental
FROM film
JOIN film_category fc ON fc.film_id = film.film_id
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
JOIN category ON fc.category_id = category.category_id
GROUP BY category.name
ORDER BY topRental DESC LIMIT 5;
-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT film.title, COUNT(rental.*) as topRental
FROM film
JOIN inventory ON film.film_id = inventory.film_id
Join rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category fc ON fc.film_id = film.film_id
JOIN category ON fc.category_id = category.category_id
WHERE category.name = 'Action'
GROUP BY film.title
ORDER BY topRental DESC LIMIT 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- I had to OFFSET by 1 to retrieve these rankings. SUSAN DAVIS comes in at no 1 with 825 without the
--OFFSET. 

SELECT actor.first_name, actor.last_name, COUNT(rental.*) as rankedRENTAL
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film.film_id = film_actor.film_id
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id

GROUP BY actor.first_name, actor.last_name
ORDER BY rankedRENTAL DESC LIMIT 10
OFFSET  1;
-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT actor.first_name, actor.last_name, COUNT(rental.*) as rankedRENTAL
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film.film_id = film_actor.film_id
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Comedy'

GROUP BY actor.first_name, actor.last_name, actor.actor_id
ORDER BY rankedRENTAL DESC LIMIT 5;