### 1st Question

> ```SQL
> SELECT COUNT(*) FROM film
> WHERE length > 
> ( SELECT AVG(length) FROM film );
> ```


### 2nd question

> ```SQL
> SELECT COUNT(*) FROM film
> WHERE rental_rate = 
> ( SELECT MAX(rental_rate) FROM film );
> ```


### 3rd question

> ```SQL
> SELECT * FROM film
> WHERE rental_rate = ANY
> ( SELECT MIN(rental_rate, replacement_cost) FROM film );
> ```
