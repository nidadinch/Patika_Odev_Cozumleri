## 1st Question
### Create test database

> ```SQL
> CREATE DATABASE test;
> ```

### Create employee table

> ```SQL
> CREATE TABLE employee(
>   id          INTEGER,
>   name        VARCHAR(50),
>   birthday    DATE,
>   mail        VARCHAR(100)   
> );
> ```

## 2nd question
### Mockaroo datas

> ```SQL
> insert into employee (id, name, birthday, email) values (1, 'Emylee', '1/18/2021', 'estaning0@umn.edu');
> insert into employee (id, name, birthday, email) values (2, 'Myrtice', '10/6/2020', 'mlomis1@mit.edu');
> insert into employee (id, name, birthday, email) values (3, 'El', '11/6/2020', 'esaunt2@mapquest.com');
> insert into employee (id, name, birthday, email) values (4, 'Ammamaria', '2/19/2021', 'akibby3@fda.gov');
> insert into employee (id, name, birthday, email) values (5, 'Reginald', '4/15/2021', 'rwebbbowen4@howstuffworks.com');
> insert into employee (id, name, birthday, email) values (6, 'Shoshanna', '1/17/2021', 'sgilding5@kickstarter.com');
> insert into employee (id, name, birthday, email) values (7, 'Teriann', '4/25/2021', 'tjagels6@home.pl');
> insert into employee (id, name, birthday, email) values (8, 'Saunders', '5/19/2021', 'sleeson7@webeden.co.uk');
> insert into employee (id, name, birthday, email) values (9, 'Noemi', '5/8/2021', 'nclemencet8@noaa.gov');
> insert into employee (id, name, birthday, email) values (10, 'Anneliese', '12/11/2020', 'aivel9@vimeo.com');
> insert into employee (id, name, birthday, email) values (11, 'Garry', '7/14/2021', 'ghundala@github.io');
> insert into employee (id, name, birthday, email) values (12, 'Jocelyn', '4/21/2021', 'joldreyb@soundcloud.com');
> insert into employee (id, name, birthday, email) values (13, 'Phil', '1/12/2021', 'pslymanc@thetimes.co.uk');
> insert into employee (id, name, birthday, email) values (14, 'Bevan', '6/4/2021', 'bhearndend@flavors.me');
> insert into employee (id, name, birthday, email) values (15, 'Viviene', '6/14/2021', 'vmeganye@amazonaws.com');
> insert into employee (id, name, birthday, email) values (16, 'Cleon', '7/5/2021', 'cgreatexf@usa.gov');
> insert into employee (id, name, birthday, email) values (17, 'Sherill', '11/27/2020', 'stenbrugg@oakley.com');
> insert into employee (id, name, birthday, email) values (18, 'Germaine', '10/3/2020', 'gsibbornh@ox.ac.uk');
> insert into employee (id, name, birthday, email) values (19, 'Dacia', '2/28/2021', 'dtippertoni@answers.com');
> insert into employee (id, name, birthday, email) values (20, 'Mella', '12/12/2020', 'mgottelierj@economist.com');
> insert into employee (id, name, birthday, email) values (21, 'Ingamar', '4/6/2021', 'ibifieldk@google.ru');
> insert into employee (id, name, birthday, email) values (22, 'Dulcea', '2/4/2021', 'dtidridgel@blogtalkradio.com');
> insert into employee (id, name, birthday, email) values (23, 'Andrus', '7/2/2021', 'aribam@tripod.com');
> insert into employee (id, name, birthday, email) values (24, 'Trudi', '9/8/2020', 'tplowsn@acquirethisname.com');
> insert into employee (id, name, birthday, email) values (25, 'Binni', '3/18/2021', 'bwordswortho@google.ru');
> insert into employee (id, name, birthday, email) values (26, 'Towney', '10/28/2020', 'tdonkep@google.ca');
> insert into employee (id, name, birthday, email) values (27, 'Emalee', '12/13/2020', 'emcgarryq@shutterfly.com');
> insert into employee (id, name, birthday, email) values (28, 'Burr', '10/7/2020', 'btallantr@qq.com');
> insert into employee (id, name, birthday, email) values (29, 'Billi', '1/31/2021', 'bpetyankins@paypal.com');
> insert into employee (id, name, birthday, email) values (30, 'Robinett', '4/30/2021', 'rspracklingt@apache.org');
> insert into employee (id, name, birthday, email) values (31, 'Harli', '12/7/2020', 'hinoldu@gov.uk');
> insert into employee (id, name, birthday, email) values (32, 'Sibeal', '12/16/2020', 'scourtesev@github.com');
> insert into employee (id, name, birthday, email) values (33, 'Giffy', '9/28/2020', 'gskelcherw@arstechnica.com');
> insert into employee (id, name, birthday, email) values (34, 'Lorette', '5/7/2021', 'lpenellax@irs.gov');
> insert into employee (id, name, birthday, email) values (35, 'Angelika', '3/12/2021', 'aechaliey@de.vu');
> insert into employee (id, name, birthday, email) values (36, 'Corie', '4/4/2021', 'ccavenz@github.io');
> insert into employee (id, name, birthday, email) values (37, 'Rozalin', '3/8/2021', 'rflamank10@upenn.edu');
> insert into employee (id, name, birthday, email) values (38, 'Othello', '1/23/2021', 'ohainge11@last.fm');
> insert into employee (id, name, birthday, email) values (39, 'Fonsie', '1/16/2021', 'fkenvin12@vistaprint.com');
> insert into employee (id, name, birthday, email) values (40, 'Mavis', '12/1/2020', 'mdellcasa13@paginegialle.it');
> insert into employee (id, name, birthday, email) values (41, 'Merry', '10/1/2020', 'mspringall14@wikia.com');
> insert into employee (id, name, birthday, email) values (42, 'Susannah', '10/28/2020', 'sdendon15@webs.com');
> insert into employee (id, name, birthday, email) values (43, 'Alecia', '10/26/2020', 'achalfant16@netvibes.com');
> insert into employee (id, name, birthday, email) values (44, 'Delcine', '5/2/2021', 'dsmalridge17@eepurl.com');
> insert into employee (id, name, birthday, email) values (45, 'Stevie', '2/13/2021', 'sbeavers18@wisc.edu');
> insert into employee (id, name, birthday, email) values (46, 'Vassili', '6/13/2021', 'vscapens19@nyu.edu');
> insert into employee (id, name, birthday, email) values (47, 'Tye', '10/13/2020', 'tglenny1a@ft.com');
> insert into employee (id, name, birthday, email) values (48, 'Jaquith', '11/23/2020', 'jniblett1b@latimes.com');
> insert into employee (id, name, birthday, email) values (49, 'Rollins', '5/12/2021', 'rapplegarth1c@google.nl');
> insert into employee (id, name, birthday, email) values (50, 'Brynn', '2/27/2021', 'bknights1d@who.int');
> ```

## 3rd question
### Update 5 employee
> ```SQL
> UPDATE employee SET name = 'Delvine' WHERE name LIKE 'Del%'; 
> UPDATE employee SET name = 'Bryn' WHERE name LIKE 'Bry%'; 
> UPDATE employee SET email = 'wikia.com.tr' WHERE email LIKE '%wikia.com'; 
> UPDATE employee SET id = 500 WHERE id = 50; 
> UPDATE employee SET birthday = '2/27/2021' WHERE birthday = '5/12/2021'; 
> ```


## 4th question
### Delete 5 employee
> ```SQL
> DELETE employee WHERE name LIKE 'Delvine'; 
> DELETE employee WHERE name LIKE 'Bryn'; 
> DELETE employee WHERE email LIKE '%wikia.com.tr'; 
> DELETE employee WHERE id = 500; 
> DELETE employee WHERE birthday = '2/27/2021'; 
> ```
