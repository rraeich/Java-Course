# HOMEWORK 9

`Question 1:` _city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız._
```
    SELECT city.city, country.country FROM city
    INNER JOIN country ON city.country_id = country.country_id;
```
`Question 2:` _customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız._
```
    SELECT payment.payment_id,customer.first_name,customer.last_name FROM payment
    INNER JOIN customer ON payment.customer_id = customer.customer_id;
```
`Question 3:` _customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız._
```
    SELECT rental.rental_id,customer.first_name,customer.last_name FROM customer 
    INNER JOIN rental ON customer.customer_id = rental.customer_id;
```