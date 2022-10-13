-- 20221013

-- 함수 : 단일행 함수, 집합 함수

select ename,sal,nvl(comm,0) as comm
from emp
where comm>=0;

-- 문자함수
--대문자를 소문자로
select lower('SCOTT')
from dual;
--대문자를 소문자로 
select ename, lower(ename)
from emp;
--대문자로 변환
select upper('scott')
from dual;
--첫 글자만 대문자로 변환
select initcap('scott')
from dual;
 
 -- substr (원본, 시작포인트, 반환할 개수)
--2번째 자리부터 3개출력
select substr('안녕하세요. 손흥민 입니다.',2,3)from dual;
--글자 길이 파악
select length('안녕하세요. 손흥민 입니다.')from dual;

--000010
--문자 앞이나 뒤로 글자 입력
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

-- to_data(문자열, 날짜형식)
select '1999-12-13', to_date('1999-12-13','YYYY-MM-DD')
from dual;

-- dcode 함수 => 여러가지 비교를 통해 결과 출력 switch-case와 유사하다
select 
    ename,
    deptno,
    decode(deptno, 
    10,'ACCOUNTING',
    20,'RESEARCH',
    30,'SALES',
    40,'OPERATIONS'
    ) as dname 
from emp;

 --직급에 따라 급여를 인상하도록 하자. 
 -- 직급이 'ANAlYST'인 사원은 5%, 
 --'SALESMAN'인 사원은 10%,
 --'MANAGER'인 사원은 15%, 
 --'CLERK'인 사원은 20%인 인상한다. 
select
    ename, job, sal,
    nvl( decode(job,'ANAlYST',sal*1.05,
        'SALESMAN',sal*1.1,
        'MANAGER',sal*1.15,
        'CLERK',sal*1.2
    ),sal) as upSal 
    from emp;
    
--case ~ wher ~then
    select ename, deptno,
    case WHEN deptno=10 then 'accounting'
        WHEN deptno=20 then 'RESEARCH'
        WHEN deptno=30 then 'SALES'
        WHEN deptno=40 then 'OPERATIONS'
    end as DNAME
    from emp;
    --회사에 모든 사원의 급여 총액 : 월 지출 액
    select sum (sal)
    from emp;
    
    --커미션 총액
    select sum(comm), count(comm),avg(comm)
    from emp;

--급여 평균 
select round(avg(sal),2)
from emp;

--최고급여 찾기
select max(sal)
from emp;
    
    
select min(sal)
from emp;

--전체 사원의 수 
select count(*) from emp;
-- 부서의 개수
select count(*) from dept;
--직급의 수
select count(distinct job)
from emp;

select  deptno, count(*), sum(sal),trunc(avg(sal)), max(sal),min(sal), count(comm)
from emp 
group by deptno

--부서별 평균 급여가 2000이상인 부서의 데이터만 출력
--having avg(sal)>2000
having max(sal) >=2900;

--직급별
select job, count(*)
from emp
group by job;







