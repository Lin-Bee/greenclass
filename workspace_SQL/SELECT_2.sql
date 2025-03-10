-- emp테이블에서 급여가 300이상이면서 700이하인 사원들의
-- 사번 사원명 급여를 조회하는 쿼리문
SELECT EMPNO,ENAME,SAL
FROM emp
WHERE SAL>=300
  AND SAL<=700;
  
-- 위와같이 특정범위를 조건으로 작성할때는 BETWEEN 연산자 사용
SELECT EMPNO,ENAME,SAL
FROM emp
WHERE SAL BETWEEN 300 AND 700; -- 300에서 700사이
   
-- 위의 쿼리문은 아래처럼 IN연산자를 사용하여 작성할 수 도 있다.
-- SELECT * FROM EMP WHERE 컬럼 IN (값1,값2,값3)
SELECT * FROM emp
WHERE SAL IN (300,400,500);

-- EMP테이블에 저장된 사원정보중 1003번~1007번 커미션은 NULL이 아닌 직원들의
SELECT EMPNO,ENAME,SAL,COMM FROM emp
WHERE EMPNO BETWEEN 1003 AND 1007
  AND COMM IS NOT NULL ;
  
-- EMP 테이블에 저장된 직원정보중에 급여가 300 400 500인 사원들의 모든정보 조회
SELECT * FROM emp
WHERE SAL = 300
   OR SAL = 400
   OR SAL = 500;
   
-- EMP 테이블에 저장된 직원 중 1003 1005 1007번인 사원들의 사번 사원명 입사일
SELECT EMPNO,ENAME,HIREDATE 
FROM emp
WHERE EMPNO IN (1003,1005,1007);

-- 정렬을 위한  ORDER BY 는 마지막에
-- 급여 기준으로 오름차순정렬
SELECT * FROM emp
ORDER BY SAL ASC;
-- 급여 기준으로 내림차순정렬
SELECT * FROM emp
ORDER BY SAL DESC;

-- 사원명 기중 오름차순으로 정렬
SELECT * FROM emp
ORDER BY ENAME;

-- 부서번호가 10번이 아닌 직원들의 
SELECT EMPNO,ENAME,DEPTNO FROM emp
WHERE DEPTNO != 10
ORDER BY DEPTNO ASC, EMPNO DESC;

-- emp 테이블에서 직급이 사원,과장,부장인 사원들의
-- 직급기준 내림차순 급여기준 오름차순
SELECT ENAME, JOB, SAL FROM emp
WHERE JOB IN ("사원","과장","부장")
ORDER BY JOB DESC, SAL;

-- 사원명에 '이'라는 글자가 포함된 모든 컬럼조회
-- EX검색창 가튼거 할때 LIKE연산자와 와일드카드를 사용
SELECT * FROM emp
WHERE ENAME LIKE "%이";

SELECT * FROM emp
WHERE ENAME LIKE "%한%";

-- 조회데이터에서 중복제거하기 >  모든컬럼에서 중복을 제거
-- 중복의 의미 조회되는 모든 컬럼의 값이 같을경우 중복으로 판단.
SELECT DISTINCT JOB,
                DEPTNO
			  FROM emp
			 WHERE JOB = "과장";

SELECT ENAME,SAL,COMM FROM emp
WHERE SAL BETWEEN 350 AND 650
  AND COMM IS NOT NULL;
  
SELECT EMPNO,ENAME,JOB FROM emp  
WHERE JOB IN ("과장","차장","부장")
ORDER BY JOB;

-- 3.
SELECT EMPNO,ENAME,DEPTNO, SAL FROM emp
WHERE DEPTNO IN (10,20)
  AND ENAME LIKE "%이%"
ORDER BY DEPTNO DESC,SAL;

SELECT * FROM emp
WHERE ENAME LIKE "%기"
  AND SAL >=400
  AND SAL <= 800
  AND COMM IS NOT NULL;
  
-- 3