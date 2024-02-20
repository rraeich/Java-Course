# HOMEWORK 3

`Question 1:` _film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız._
```
    SELECT * FROM film
    WHERE title LIKE '%n'
    ORDER BY length DESC
    LIMIT 5;
```
`Question 2:` _film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci(6,7,8,9,10) 5 filmi(6,7,8,9,10) sıralayınız._
```
    SELECT * FROM film
    WHERE title LIKE '%n'
    ORDER BY length ASC
    OFFSET 5
    LIMIT 5;
```
`Question 3:` _customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız._
```
    SELECT * FROM customer
    WHERE store_id = 1
    ORDER BY last_name DESC
    LIMIT 4;
```