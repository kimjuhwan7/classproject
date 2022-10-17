--20221017 join & sub query

--(5) 박지성이구매한도서의출판사수

select count(publisher)
from customer cu, book bo, orders ord
where cu.custid=ord.custid and ord.bookid=bo.bookid and cu.name='박지성' ;
        
--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이

select bookname, price,saleprice
from book bo, orders ord
where  ord.custid = 1;

(select custid
from customer
where name='박지성');
