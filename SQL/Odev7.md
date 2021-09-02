### 1st question

> ```SQL
> SELECT AVG(rental_rate) FROM film;
> ```

### 2nd question

> ```SQL
> SELECT COUNT(*) FROM film
> WHERE title LIKE 'C%' ;
> ```


### 3rd question

> ```SQL
> SELECT MAX(length) FROM film 
> WHERE rental_rate = 0.99;
> ```

### 4th question

> ```SQL
> SELECT COUNT(DISTINCT replacement_cost) FROM film 
> WHERE length > 150;
> ```

