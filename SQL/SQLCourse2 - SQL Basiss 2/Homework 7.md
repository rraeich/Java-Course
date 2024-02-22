# HOMEWORK 7

`Question 1:` _film tablosunda bulunan filmleri rating değerlerine göre gruplayınız._
```
    SELECT rating, COUNT(*) FROM film
    GROUP BY rating;
```
`Question 2:` _film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız._
```
    SELECT replacement_cost, COUNT(*) FROM film
    GROUP BY replacement_cost HAVING COUNT(*) > 50;
```
`Question 3:` _ customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?_
```
    SELECT store_id, COUNT(*) FROM customer
    GROUP BY store_id;
```
`Question 4:` _city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız._
```
    SELECT country_id, COUNT(*) FROM city
    GROUP BY country_id
    ORDER BY COUNT(*) DESC
    LIMIT 1;
```
