### 1st Question

> ```SQL
> SELECT city, country FROM country
> LEFT JOIN city ON city.country_id = country.id;
> ```


### 2nd question

> ```SQL
> SELECT p.payment_id, c.first_name, c.last_name FROM payment AS p
> RIGHT JOIN customer AS c ON customer.id = p.customer_id;
> ```


### 3rd question

> ```SQL
> SELECT r.rental_id, c.first_name, c.last_name FROM rental AS r
> FULL JOIN customer AS c ON customer.id = r.customer_id;
> ```
