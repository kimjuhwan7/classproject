--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--
--(1) 도서번호가1인도서의이름
select BOOKNAME
from BOOK
where BOOKID ='1';

--(2) 가격이20,000원이상인도서의이름

select BOOKNAME
from BOOK
where PRICE>=20000;​
​

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--
--​
--
--(3) 모든고객의이름, 주소
select NAME, ADDRESS
from CUSTOMER;

--(4) 2014년7월4일~7월7일사이에주문받은도서의주문번호

select ORDERID
from ORDERS
where ORDERDATE between '2014/7/4' AND '2014/7/7';

--(5) 2014년7월4일~7월7일사이에주문받은도서를제외한도서의주문번호

select  ORDERID
from ORDERS
where  ORDERDATE not between '2014/7/3' AND '2014/7/8';

--(6) 성이‘김’씨인고객의이름과주소

select NAME, ADDRESS
from CUSTOMER
where NAME like '김%';
--(7) 성이‘김’씨이고이름이‘아’로끝나는고객의이름과주소

select NAME, ADDRESS
from CUSTOMER
where NAME like '김_아';

