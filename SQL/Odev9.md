### 1st Question

> ```SQL
> SELECT city, country FROM country
> INNER JOIN city ON city.country_id = country.country_id;
> ```


### 2nd question

> ```SQL
> SELECT p.payment_id, c.first_name, c.last_name FROM payment AS p
> INNER JOIN customer AS c ON c.customer_id = p.customer_id;
> ```


### 3rd question

> ```SQL
> SELECT r.rental_id, c.first_name, c.last_name FROM rental AS r
> INNER JOIN customer AS c ON c.customer_id = r.customer_id;
> ```
