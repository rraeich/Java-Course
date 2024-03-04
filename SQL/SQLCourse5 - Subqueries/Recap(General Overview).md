# GENERAL OVERVIEW

`Question 1:` _film tablosundan 'K' karakteri ile başlayan en uzun ve replacement_cost'u en düşük 4 filmi sıralayınız._
```
    SELECT title,length,replacement_cost FROM film
    WHERE title LIKE 'K%'
    ORDER BY length DESC, replacement_cost ASC
    LIMIT 4;
```
`Question 2:` _film tablosunda içerisinden en fazla sayıda film bulunduran rating kategorisi hangisidir?_
```
    SELECT rating,COUNT(rating) FROM film
    GROUP BY rating
    ORDER BY COUNT(rating) DESC
    LIMIT 1;
```
`Question 3:` _customer tablosunda en çok alışveriş yapan müşterinin adı nedir?_
```
    SELECT customer.customer_id, customer.first_name, customer.last_name, COUNT(payment_id) 
    FROM customer
    INNER JOIN payment ON customer.customer_id = payment.customer_id
    GROUP BY customer.customer_id
    ORDER BY COUNT(payment_id) DESC
    LIMIT 1;
```
`Question 4:` _category tablosundan kategori isimlerini ve kategori başına düşen film sayılarını sıralayınız._
```
    SELECT category.category_id,category.name, COUNT(film_id)
    FROM film_category
    INNER JOIN category ON category.category_id = film_category.category_id
    GROUP BY category.category_id
    ORDER BY category_id;
```
`Question 5:` _film tablosunda isminde en az 4 adet 'e' veya 'E' karakteri bulunan kç tane film vardır?_
```
    SELECT COUNT(*) FROM film
    WHERE title ILIKE '%e%e%e%e%'
```
