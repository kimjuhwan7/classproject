--함수문제 2
-- (3) 박지성의 총 구매액(박지성의 고객번호는 1번으로 놓고 작성)
select sum(saleprice) as TOTALPAY
FROM ORDERS
WHERE CUSTID = 1;

-- (4) 박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성)
select COUNT(*) as COUNTBOOK
from orders
where custid= 1;

-- (1) 마당서점 도서의 총 개수
SELECT COUNT(*) AS BOOKNUM
FROM BOOK;

-- (2) 마당서점에 도서를 출고하는 출판사의 총개수
select count(distinct publisher) as pubnum
from book;