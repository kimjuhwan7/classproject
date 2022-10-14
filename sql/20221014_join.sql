--20221014_join

--32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.

select emp.deptno,dept.dname
from emp,dept
where emp.deptno = dept.deptno and ename='SCOTT';
​
--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
​
select emp.ENAME , dept.DNAME, dept.loc
from emp INNER JOIN dept 
on emp.deptno = dept.deptno;

--36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.

select e.ename,e.deptno
from dept d, emp e
where d.deptno= e.deptno 
and e.ename like '%A%';

--37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.

select e.ename, e.job, e.deptno
from dept d, emp e
where d.deptno= e.deptno
and d.loc = 'NEW YORK';

--38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.

select *
from emp e1,emp e2
where e1.mgr=e2.empno;
​
--39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.

select *
from emp e1,emp e2
where e1.mgr=e2.empno(+)
order by e1.empno desc;​

--40. SELF JOIN을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )

select e1.ename, e1.deptno
from emp e1,emp e2
where e1.mgr=e2.empno and e1.deptno='20';

--41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.

select e1.ename, e1.hiredate
from emp e1,emp e2
where e2.ename='WARD' and e1.hiredate>e2.hiredate;

--42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.

select e1.ename, e1.hiredate, e2.ename as "관리자", e2.hiredate as"관리자입"
from emp e1,emp e2
where e1.empno=e2.mgr --empno 데이터와 mgr 데이터가 같은걸 찾는다
and e2.hiredate>e1.hiredate;









