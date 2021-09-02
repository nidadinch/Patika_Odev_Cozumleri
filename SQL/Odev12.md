### 1st Question

> ```SQL
> SELECT COUNT(*) FROM film
> WHERE length > 
>   ( SELECT AVG(length) FROM film );
> ```


### 2nd question

> ```SQL
> SELECT COUNT(*) FROM film
> WHERE rental_rate = 
>   ( SELECT MAX(rental_rate) FROM film );
> ```


### 3rd question

> ```SQL
> SELECT * FROM film
> WHERE rental_rate = ANY
>   ( SELECT MIN(rental_rate, replacement_cost) FROM film );
> ```


### 4th question 

> ```SQL
> SELECT * FROM customer
> WHERE customer_id = (
>          SELECT customer_id FROM payment
>           GROUP BY customer_id
>           ORDER BY COUNT(*) DESC
>           LIMIT 1
> );
> ```