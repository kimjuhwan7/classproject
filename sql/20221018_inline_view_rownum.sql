-- 20221018

--inline view -rownum
-- from 절 뒤에 오는 서브쿼리 -> inlin view
-- select -> 결과도 테이블

select rownum, emp.*
from emp
order by hiredate;


-- rownum : 사용자가 생성하는 컬럼이 아니다!, 시스템에서 제공하는 컬럼

select rownum, t.*
from (select * from emp order by hiredate) t
;

-- top3
-- 입사일이 가장 오래된 3명 구하기

select rownum, t.*
from (select * from emp order by hiredate) t
where rownum<=3
;


