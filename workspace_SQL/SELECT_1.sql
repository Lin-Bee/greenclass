
-- 주석 하이푼두개하고 한칸띄우기

-- 데이터조회하는 SELECT 였던거같은디 맞나????
-- SELECT 컬럼명 FROM 테이블명 WHERE 조건; <외우셈
-- EMP테이블의 사원들의 사번을 조회해보세요
-- 1.실행 F9 2.상단 파란화살표  3.단축키
-- (옵션 3개임:1)실행 : 현재열린쿼리탭의모든쿼리일괄실행
--             2)선택실행  : 마우스로 드래그한것만 실행
--             3)현재쿼리실행 : 현재 커서가 올라가 있는 쿼리만 실행
SELECT EMPNO FROM emp;

-- EMP테이블에서 모든 사원의 사번,사원명, 급여조회
SELECT EMPNO,ENAME,SAL FROM emp;

-- 별칭사용. 조회시 조회되는 컬럼명을 변경하여 조회할 수 있는 문법
SELECT EMPNO AS 사번,ENAME AS 사원명, SAL 급여 FROM emp;
-- 아무래도 AS생략 하여 별칭적용이 가능하지만 헷갈릴꺼같으면 그냥 하기

-- EMP테이블의 모든 컬럼조회
SELECT * FROM emp;

-- SELECT로 이런것두 조회할 수 있어용
SELECT 5 FROM emp;
SELECT 5,'김사랑',5+5;

-- 조회에 조건 확인하기
-- 크기비교 : >,<,>=,<=,= , ! = OR <>사용가능
-- 급여가 300이상인 사람뽑기
SELECT EMPNO,ENAME,SAL FROM emp
WHERE SAL>=300;

SELECT EMPNO,ENAME,JOB,HIREDATE FROM emp
WHERE JOB = '대리';

-- 동시만조 AND 둘중하나 OR
SELECT * FROM emp
WHERE SAL >= 400 AND JOB = '과장';

-- EMP테이블의 모든 사원들 중 급여가 400이거나 700이상인 사원들의 사번,사원명,급여 조회
SELECT EMPNO,ENAME,SAL FROM emp
WHERE SAL <= 400 OR SAL >= 700;

-- 조건절을 작성할때는 NULL 체크 문법에 주의!
-- 조건 : COMM이 NULL인 데이터만 조회
SELECT EMPNO,ENAME,SAL,COMM FROM emp
WHERE COMM IS NULL;

SELECT EMPNO,ENAME,SAL,COMM FROM emp
WHERE COMM IS NOT NULL;


-- EMP 테이블에서 모든 사원의 사번,사원명,급여,커미션을조회
SELECT EMPNO,ENAME,SAL,COMM FROM emp;

-- EMPNO의 1005번 이상인사람의 EMPNO,ENAME,JOB 조회
SELECT EMPNO
		,ENAME NAME
		,JOB 
FROM emp
WHERE EMPNO>=1005;

-- 이름 직급 급여 과장OR 대리
SELECT ENAME,JOB,SAL FROM emp
WHERE JOB='과장' OR JOB = '대리';

SELECT * FROM emp
WHERE SAL>=300 AND COMM >= 300;

SELECT ENAME
		,JOB
		,SAL
		,COMM
FROM emp
WHERE SAL<=900 
  AND (JOB = '대리' OR JOB = '과장')
  AND COMM IS NOT NULL;

