--20221012

--�궗�슜媛��뒫�븳 �뀒�씠釉� �젙蹂�
select * from tab;

-- �뀒�씠釉붿쓽 援ъ“ �솗�씤
desc dept;

 select ename --*
 from emp;

select deptno, job, sal, ename
from emp;
-- distinct 以묐났媛� 誘몄텧�젰
-- select [distinct] 而щ읆�씠由�, 而щ읆�씠由�, 而щ읆�씠由�, ....
-- from �뀒�씠釉� �씠由�
-- where 議곌굔 �엯�젰

select * from dept; -- �뻾�쓣 �꽑�깮�븯�뒗 議곌굔�씠 �뾾湲� �븣臾몄뿉 紐⑤뱺�뻾�씠 寃곌낵濡� 異쒕젰

select deptno, dname from dept ;--deptno, dname留� 異쒕젰 �븿


select sal, comm from emp;
-- null : �젙�빐吏�吏� �븡�� 媛�!

--select �쓽 �몴�쁽 �쁺�뿭�뿉�꽌�뒗 �궛�닠�뿰�궛�씠 媛��뒫�븯�떎 
select sal + comm as ��而�
from emp;

select sal - 100 
from emp;

select sal *12 as �뿴�몢�떖湲됱뿬
from emp;

select sal /2
from emp;

-- �궗�썝 �뀒�씠釉붿뿉�꽌 �궗�썝�쓽 �씠由�, �썡 湲됱뿬, �뿰遊됱쓣 異쒕젰
select ename as �씠由�, sal as �썡湲�, sal*12 as �뿰遊�
from emp;

select ename as �씠由�, sal as �썡湲�, sal*12 as �뿰遊� , nvl(sal*12+comm , 0)
from emp;

-- null�쓽 媛믪쓣 移섑솚�빐二쇰뒗 �븿�닔 : nvl(�썝蹂� �뜲�씠�꽣, null�씪�븣 移섑솚�븷 媛�)
select ename as �씠由�, sal as �썡湲�, sal*12 as �뿰遊� , sal*12+nvl(comm , 0)
from emp;

select ename||' is a '||job
from emp;

select concat(ename,' is a ', job)
from emp;                                                                                                                                                                                         
