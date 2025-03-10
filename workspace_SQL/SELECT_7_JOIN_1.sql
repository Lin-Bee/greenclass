SELECT emp.empno, emp.ename, emp.sal
FROM emp;
/* 앞에 emp.이 생략된 상태이긴함 */

SELECT E.empno, E.ename, E.sal
FROM emp E; /*별칭도 붙일수있음*/

SELECT*FROM dept;

/*
 사원번호, 사원명, 급여, 부서번호, 부서명, 부서의 지역을 조회
 부서명, 부서의 지역은 DEPT테이블에 있음
*/
/* 기본적인 크로스 조인임 CROSS JOIN */
SELECT EMPNO,ENAME,SAL, E.DEPTNO, D.DEPTNO,D.DNAME,D.LOC
FROM emp E JOIN dept D;

/* 이너 조인임 INNER JOIN */
SELECT EMPNO,ENAME,SAL, E.DEPTNO ,D.DNAME,D.LOC
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO; /*올바른 데이터만 나오도록 WHERE절과 구분되게*/

/*직급이 사원이 아닌 직원의 사번,사원명,직급,부서번호,부서명 조회*/\
SELECT EMPNO, ENAME, JOB, emp.DEPTNO, DNAME
FROM emp INNER JOIN dept
ON emp.DEPTNO = dept.DEPTNO
WHERE JOB != '사원';

/*부서번호가 10,20번인 직원의 사번 사원명 부서명 부서 지역 조회*/
SELECT EMPNO, ENAME, DNAME, LOC
FROM emp INNER JOIN dept
ON emp.DEPTNO = dept.DEPTNO
WHERE emp.DEPTNO IN (10, 20);
