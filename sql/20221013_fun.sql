-- 20221013

-- 함수 : 단일행 함수, 집합 함수

select ename,sal,nvl(comm,0) as comm
from emp
where comm>=0;

-- 문자함수
select lower('SCOTT')
from dual;

select ename, lower(ename) 
from emp;

select upper('scott')
from dual;

select initcap('scott')
from dual;
 
 -- substr (원본, 시작포인트, 반환할 개수)
select substr('안녕하세요. 손흥민 입니다.',2,3)from dual;

select length('안녕하세요. 손흥민 입니다.')from dual;

--000010
select  dname, deptno, lpad(deptno, 5 ,'0'), rpad(deptno,5,'A')
from dept;

select '          ABC',TRIM('             ABC  ') ,' ABC         ',TRIM(' ABC         ')
from dual;

select replace('Steven King')
from dual;

-- 숫자 함수
select  -1, abs(-10)
from dual;

select 2.1,2.9, floor(2.9)
from dual;

select 1234.567, round(1234.567,1) ,round(1234.567,-1)
from dual;

select 1234.567 ,trunc(1234.567,1)
from dual;

select mod(1,3), mod(2,3), mod(3,3),mod(0,3)
from dual;

-- 현재 날짜 
select  sysdate
from dual;


select months_between(sysdate,'21/12/13')
from dual;

select add_Months(sysdate,-2)
from dual;

select next_day(sysdate,1)
from dual;

select last_day(sysdate)
from dual;

