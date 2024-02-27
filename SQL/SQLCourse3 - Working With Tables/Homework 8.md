# HOMEWORK 8

`Question 1:` _test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım._
```
    --Öncelikle Databases'a sağ tıklayarak Create -> Database' e tıklayarak, ismini test koyarak oluşturalım.

    CREATE TABLE employee (

        id SERIAL PRIMARY KEY,
        name VARCHAR(50),
        birthday DATE,
        email VARCHAR (100)
    );
```
`Question 2:` _Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim_
```
    insert into employee (id, name, birthday, email) values (1, 'Ravid', '1995/01/16', 'raxworthy0@npr.org');
    insert into employee (id, name, birthday, email) values (2, 'Hedi', '1999/08/14', 'hwicks1@cnet.com');
    insert into employee (id, name, birthday, email) values (3, 'Shep', '1983/06/08', 'sdodman2@discovery.com');
    insert into employee (id, name, birthday, email) values (4, 'Jud', '1978/07/12', 'jcamis3@comsenz.com');
    insert into employee (id, name, birthday, email) values (5, 'Carmella', '1994/05/21', 'cboggas4@tinypic.com');
    insert into employee (id, name, birthday, email) values (6, 'Mattheus', '1975/11/26', 'mlearmond5@cnbc.com');
    insert into employee (id, name, birthday, email) values (7, 'Papagena', '1992/05/19', 'pblowfelde6@vk.com');
    insert into employee (id, name, birthday, email) values (8, 'Alejoa', '1978/05/04', 'afillingham7@gnu.org');
    insert into employee (id, name, birthday, email) values (9, 'Marchelle', '1993/02/05', 'mcastro8@digg.com');
    insert into employee (id, name, birthday, email) values (10, 'Randi', '1986/10/15', 'rjaulmes9@woothemes.com');
    insert into employee (id, name, birthday, email) values (11, 'Tiffany', '1997/08/28', 'tsiffletta@sogou.com');
    insert into employee (id, name, birthday, email) values (12, 'Norry', '1993/04/08', 'nsabbinsb@eepurl.com');
    insert into employee (id, name, birthday, email) values (13, 'Rabi', '2002/06/14', 'rbirtonshawc@google.ca');
    insert into employee (id, name, birthday, email) values (14, 'Pablo', '1975/11/04', 'pwarringtond@ameblo.jp');
    insert into employee (id, name, birthday, email) values (15, 'Marven', '1989/08/08', 'mcutridgee@is.gd');
    insert into employee (id, name, birthday, email) values (16, 'Cosetta', '1999/10/03', 'ccrombf@google.es');
    insert into employee (id, name, birthday, email) values (17, 'Renaud', '1978/10/14', 'rhazaelg@meetup.com');
    insert into employee (id, name, birthday, email) values (18, 'Lew', '1996/10/17', 'lcarcassh@marriott.com');
    insert into employee (id, name, birthday, email) values (19, 'Gilles', '2000/09/28', 'gsandercocki@smh.com.au');
    insert into employee (id, name, birthday, email) values (20, 'Lorie', '2000/09/09', 'lpolendinej@irs.gov');
    insert into employee (id, name, birthday, email) values (21, 'Deb', '1996/06/06', 'dratchfordk@cbsnews.com');
    insert into employee (id, name, birthday, email) values (22, 'Coretta', '1983/06/23', 'chairsl@sakura.ne.jp');
    insert into employee (id, name, birthday, email) values (23, 'Henderson', '1999/08/10', 'hnisiusm@nih.gov');
    insert into employee (id, name, birthday, email) values (24, 'Rooney', '1984/06/16', 'rullyattn@reference.com');
    insert into employee (id, name, birthday, email) values (25, 'Kit', '1997/10/24', 'kewbancko@spiegel.de');
    insert into employee (id, name, birthday, email) values (26, 'Stan', '2002/12/17', 'shuxleyp@pcworld.com');
    insert into employee (id, name, birthday, email) values (27, 'Garth', '2000/06/29', 'ghaddowq@jigsy.com');
    insert into employee (id, name, birthday, email) values (28, 'Heinrick', '2003/03/29', 'haronstamr@opensource.org');
    insert into employee (id, name, birthday, email) values (29, 'Maryellen', '1985/09/19', 'mstrobands@youtube.com');
    insert into employee (id, name, birthday, email) values (30, 'Cristine', '1979/08/01', 'cdearlovet@gnu.org');
    insert into employee (id, name, birthday, email) values (31, 'Quill', '1999/09/30', 'qtheureru@de.vu');
    insert into employee (id, name, birthday, email) values (32, 'Morganne', '1997/01/19', 'mdymottv@oakley.com');
    insert into employee (id, name, birthday, email) values (33, 'Jerrie', '1974/03/11', 'jshervillew@devhub.com');
    insert into employee (id, name, birthday, email) values (34, 'Terrijo', '1996/05/13', 'tblazevicx@wikia.com');
    insert into employee (id, name, birthday, email) values (35, 'David', '1981/12/22', 'dhastwally@aol.com');
    insert into employee (id, name, birthday, email) values (36, 'Hi', '1984/07/17', 'hpanyerz@mashable.com');
    insert into employee (id, name, birthday, email) values (37, 'Rosanna', '1990/04/13', 'rdeniskevich10@epa.gov');
    insert into employee (id, name, birthday, email) values (38, 'Elise', '1974/10/04', 'esummersby11@europa.eu');
    insert into employee (id, name, birthday, email) values (39, 'Berti', '1984/02/29', 'bphuprate12@facebook.com');
    insert into employee (id, name, birthday, email) values (40, 'Terry', '1980/01/14', 'tstretton13@wix.com');
    insert into employee (id, name, birthday, email) values (41, 'Romeo', '1976/06/01', 'rbellchamber14@microsoft.com');
    insert into employee (id, name, birthday, email) values (42, 'Skipton', '1998/11/15', 'skattenhorn15@joomla.org');
    insert into employee (id, name, birthday, email) values (43, 'Jennine', '2003/04/21', 'jansley16@disqus.com');
    insert into employee (id, name, birthday, email) values (44, 'Mariel', '1983/02/24', 'mwidmore17@sitemeter.com');
    insert into employee (id, name, birthday, email) values (45, 'Arman', '1981/08/12', 'aforbear18@weather.com');
    insert into employee (id, name, birthday, email) values (46, 'Shaylynn', '1974/09/14', 'srodgman19@networksolutions.com');
    insert into employee (id, name, birthday, email) values (47, 'Chanda', '1995/06/10', 'cmarian1a@wikipedia.org');
    insert into employee (id, name, birthday, email) values (48, 'Merwyn', '1974/08/16', 'mtomas1b@harvard.edu');
    insert into employee (id, name, birthday, email) values (49, 'Saunderson', '1981/08/09', 'slipsett1c@msn.com');
    insert into employee (id, name, birthday, email) values (50, 'Liurette', '1986/09/03', 'lbraim1d@amazon.com');
```
`Question 3:` _Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım._
```
    UPDATE employee
    SET name = 'Joey',
	birthday = '1998-12-17',
	email = 'joe4kel918@gmail.com'
    WHERE id = 17;
    -- 
    UPDATE employee
    SET	birthday = '1979-04-28'
    WHERE id IN (19,25);
    --
    UPDATE employee
    SET name = 'Pelinciğim<3',
        birthday = '2004-07-26'
    WHERE name LIKE 'R%';
    RETURNİNG*;
    --
    UPDATE employee
    SET name = 'Mdegiskeni',
        email = 'karımasıgım@pelinciğim.love.tr'
    WHERE id IN (29,30,17,3,41,6) AND name LIKE 'M%';
    RETURNİNG*;
    --
    UPDATE employee
    SET birthday = '2023-03-18'
    WHERE id = 18 OR id = 3
    RETURNİNG*;
```
`Question 4:` _Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım._
```
    DELETE FROM employee
    WHERE name LIKE 'C%'
    --
    DELETE FROM employee
    WHERE id = 20;
    --
    DELETE FROM employee
    WHERE birthday = '1998-11-15';
    --
    DELETE FROM employee
    WHERE email LIKE 'm%' AND id IN (1,14,5,9,28,30,50,17,23,31,39,45,7);
    --
    DELETE FROM employee
    WHERE NOT name LIKE 'Pelin%'
```
