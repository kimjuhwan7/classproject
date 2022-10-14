--20221014


-- join : 관계 있는 테이블의 스키마를 붙이는 것
select *
from emp,dept
where emp.DEPTNO = dept.DEPTNO;

-- 14 * 4 => cross join 의 결과 실행
select *
from emp cross join dept
where emp.DEPTNO = dept.DEPTNO;


select e.ename, d.dname
from emp e,dept d
where e.DEPTNO = d.DEPTNO;

--mysql
select *
from emp inner join dept
on emp.deptno=dept.deptno;

select *
from emp inner join dept
using(deptno);

select *
from emp NATURAL JOIN dept;




select *
from emp e join dept d
on e.deptno=d.deptno;

-- self join : 자기 자신의 테이블과 조인
-- emp => mgr : 상사의 사원 번호
-- 각 사원들의 이름과 상사의 이름을 출력
select ename,mgr from emp;
select ename from emp where empno = 7839;

select e1.ename as "사원이름", e2.ename as "상사이름"
from emp e1, emp e2
where e1.mgr = e2.empno(+);

select e2.ename,e2.ename
from emp e1 right outer join emp e2
on e1.empno=e2.empno;


--'SCOTT' 사원의 사원번호와 이름 직급 부서이름 부서위치를 출력
--emp => 사원번호, 이름, 직급
-- dept => 부서 이름, 위치
select empno, ename, job, dname, loc
from emp e, dept d
where e.deptno = d.deptno
and e.ename ='SCOTT';

select *
from emp e join dept d
on e.deptno= d.deptno;

select * from salgrade;

select ename, losal, sal, hisal, grade
from emp e, salgrade s 
where e.sal between s.losal and s.hisal;


select ename, losal, sal, hisal,grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal;

-- 판매 내역 : 판매 정보, 판매 서적의 정보, 고객의 정보
select *
from book, customer, orders;

