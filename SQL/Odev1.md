### 1st question

> ```SQL
> SELECT title, description FROM film;
> ```

### 2nd question

> ```SQL
> SELECT * FROM film 
> WHERE length BETWEEN 61 AND 74;
> ```


### 3rd question

> ```SQL
> SELECT * FROM film WHERE rental_rate = 0.99 
> AND replacement_cost IN (12.99,28.99);
> ```


### 4th question

> ```SQL
> SELECT last_name FROM customer 
> WHERE first_name = 'Mary';
> ```

### 5th question

> ```SQL
> SELECT * FROM film WHERE length <= 50
> AND rental_rate NOT IN (2.99,4.99);
> ```

