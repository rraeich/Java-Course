# HOMEWORK 6

`Question 1:` _film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?_
```
    SELECT AVG(rental_rate) FROM film;
```
`Question 2:` _film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?_
```
    SELECT COUNT(*) FROM film
    WHERE title ILIKE 'c%';
```
`Question 3:` _film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?_
```
    SELECT MAX(length) FROM film
    WHERE rental_rate = 0.99;
```
`Question 4:` _film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?_
```
    SELECT COUNT(DISTINCT(replacement_cost)) FROM film
    WHERE length > 150;
```
