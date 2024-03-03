# HOMEWORK 11

`Question 1:` _actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım._
```
    (
    SELECT first_name FROM actor
    )
        
    UNION

    (
    SELECT first_name FROM customer
    )
```
`Question 2:` _actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım._
```
    (
    SELECT first_name FROM actor
    )
        
    INTERSECT

    (
    SELECT first_name FROM customer
    )
```
`Question 3:` _actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım._
```
    (
    SELECT first_name FROM actor
    )
        
    EXCEPT

    (
    SELECT first_name FROM customer
    )
```
`Question 4:` _İlk 3 sorguyu tekrar eden veriler için de yapalım._
```
    (
    SELECT first_name FROM actor
    )
        
    UNION ALL

    (
    SELECT first_name FROM customer
    )
-----------------------------------------------
    (
    SELECT first_name FROM actor
    )
        
    INTERSECT ALL

    (
    SELECT first_name FROM customer
    )
-----------------------------------------------
    (
    SELECT first_name FROM actor
    )
        
    EXCEPT ALL

    (
    SELECT first_name FROM customer
    )
```