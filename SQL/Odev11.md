### 1st Question

> ```SQL
> (SELECT first_name FROM actor)
> UNION (SELECT first_name FROM customer);
> ```


### 2nd question

> ```SQL
> (SELECT first_name FROM actor)
> INTERSECT (SELECT first_name FROM customer);
> ```


### 3rd question

> ```SQL
> (SELECT first_name FROM actor)
> EXCEPT (SELECT first_name FROM customer);
> ```

### 4th question

> ```SQL
> (SELECT first_name FROM actor)
> UNION ALL (SELECT first_name FROM customer);
> ```


> ```SQL
> (SELECT first_name FROM actor)
> INTERSECT ALL (SELECT first_name FROM customer);
> ```

> ```SQL
> (SELECT first_name FROM actor)
> EXCEPT ALL (SELECT first_name FROM customer);
> ```
