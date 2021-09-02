### 1st question

> ```SQL
> SELECT rating, COUNT(*) FROM film
> GROUP BY rating;
> ```

### 2nd question

> ```SQL
> SELECT replacement_cost, COUNT(*) FROM film
> GROUP BY replacement_cost 
> HAVING COUNT(*) > 50;
> ```


### 3rd question

> ```SQL
> SELECT store_id, COUNT(*) FROM customer 
> GROUP BY store_id;
> ```

### 4th question

> ```SQL
> SELECT country_id, COUNT(*) FROM city 
> GROUP BY country_id
> ORDER BY COUNT(*) DESC
> LIMIT 1;
> ```

