# 단일행 함수 : 데이터의 갯수에 상관없이 무조건 1행의 데이터만 조회되는 함수

# 단일행 함수가 아닌 함수의 예시
SELECT comm, IFNULL(comm,0)
		, CONCAT(empno,'_',ename)
		, SUBSTR(job,1,1)
FROM emp;

#단일행 함수의 예시 : 모든 사원들 중 급여가 가장 높은 사원의 급여를 조회
# 조회결과가 1줄인거
SELECT max(sal)FROM emp;
SELECT min(sal)FROM emp;
SELECT avg(sal)FROM emp;
SELECT COUNT(sal)FROM emp;
SELECT sum(sal)FROM emp;

#★★★ 단일행 함수 사용시 주의점1 ★★★
#count와 avg함수 사ㅛㅇㅇ 시에는 null 데이터에 유의
SELECT COUNT(sal), COUNT(comm) FROM emp;
# count에 *를 사용해도 갯수 조회가 가능하지만
# 통상적으로 pk 번호가 있는 column을 넣어 관리해준다
#avg함수로 평균을 계산할 때도 null은 데이터의 갯수에서 제외되기 때문에 주의!!
SELECT avg(sal), AVG(comm), SUM(comm), AVG(IFNULL(comm,0)) FROM emp;

#★★★ 단일행 함수 사용시 주의점2 ★★★
#조회문의 각 컬럼은 조회결과 데이터의 수가 일치하는 컬럼만 사용가능!
#ex> 사원들 중 가장 높은 급여와 극 ㅡㅂ여를 받는사원명조회
SELECT MAX(sal), ename FROM emp; #<<틀림
#결론 | 단일행 함수는 단일행 함수끼리만 사용가능
#       다른 일반 컬럼과 단일행 함수를 같이 사용하면 쿼리오류!!!
#       단 group by절에 작성한 컬럼은 단일행함수와 함께 사용가능

#조회데이터 그룹화하기
#모든사원중 부서별로 가장 높은 급여조회
SELECT distinct deptno FROM emp; #중복삭제

 # 부서별 최고연봉
SELECT deptno, MAX(sal), min(sal),  sum(sal),  count(sal),  avg(sal) 
 FROM emp 					# emp테이블에서
 GROUP BY deptno;			# group by (순서대로)

#직급별 인원수 조회
SELECT job, COUNT(empno)
FROM emp
GROUP BY job;

#직급기준 내림차순
SELECT job, COUNT(empno)
FROM emp
GROUP BY job
ORDER BY JOB DESC;

#입사일기준 월별 입사자 수
SELECT month(hiredate) AS '월', COUNT(empno) AS '입사자수' 
FROM emp
GROUP BY MONTH(hiredate) ;

#부서별 커미션의 평균을 조회
#10번부서는 제외하고 평균은 전체 사원수를 기준으로 조회한다
SELECT AVG(IFNULL(comm,0)) 
FROM emp
WHERE deptno != 10
GROUP BY deptno;

#부서별로 급여의 합을 조회
#단 2000이상인
SELECT DEPTNO, SUM(SAL)
FROM emp
GROUP BY DEPTNO
HAVING SUM(SAL)>=2000; # HAVING 은 그룹한 후의 결과값을 비교할때 사용

#직급별 최소 급여조회
# 사원빼고 300미만도빼고
# 직급기준오름차순
SELECT JOB, MIN(SAL)
FROM emp
WHERE JOB !='사원'
GROUP BY JOB
HAVING MIN(SAL)>300
ORDER BY JOB;



