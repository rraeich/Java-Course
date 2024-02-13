# HOMEWORK 4

`Question 1:` _film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız._
```
    SELECT DISTINCT replacement_cost FROM film;
```
`Question 2:` _film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?_
```
    SELECT COUNT(DISTINCT replacement_cost) FROM film;
```
`Question 3:` _film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?_
```
    SELECT COUNT(*) FROM film WHERE title LIKE 'T%' AND rating = 'G;
```
`Question 4:` _country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?_
```
    SELECT COUNT(*) FROM country WHERE country LIKE '_____'
```
`Question 5:` _city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?_
```
    SELECT COUNT(*) FROM city WHERE city ILIKE '%R'
```