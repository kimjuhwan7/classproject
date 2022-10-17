-- 20221017sub_query

--43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.

select ename,job
from emp
where job=(
select job
from emp
where empno ='7788');

--44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무

select ename,job
from emp
where sal>(
select sal
from emp
where empno ='7499');

--45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)

select ename,job,sal
from emp
where sal=(
select min(sal)
from emp);

--46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
select job, avg(sal)
from (
    select job, avg(sal)
    from emp
    group bxy job
    order by  avg(sal))
where rownum = 1;


select job, avg(sal)
from emp
group by job
order by avg(sal);



47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.


select ename, sal, deptno
from emp
where deptno = (
select min(sal)
from emp
group by deptno);

-----------------미완성

--48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서 업무가 ANALYST가 아닌 사원들을 표시(사원번호, 이름, 담당 업무, 급여)하시오.

select ename
from emp 
where  all(ename='SCOTT' , ename = 'FORD


select ename
from emp 
where job='ANALYST';