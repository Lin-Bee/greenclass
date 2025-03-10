#서브쿼리 - 하나의 쿼리문 안에 또 다른 쿼리문이 들어간 sql 문법

#김사랑 사원가 같은 부서에 속한 사원들의 사번, 사원명, 부서번호를 조회
#1-> 김사랑 사원이 속한 부서를 확인
SELECT DEPTNO
FROM emp
WHERE ename = '김사랑';

#2 -> 20번 부서에 속한 사원들의 사번, 사원명, 부서번호를 조회
SELECT empno, ename, deptno
FROM emp
WHERE deptno = 20;

SELECT empno,ename, deptno
FROM emp
WHERE deptno = ( SELECT DEPTNO
						FROM emp
						WHERE ename = '김사랑');
						
#사번이 1001번인 사원과 같은 직급을 갖는 사원들의 모든정보 조회
SELECT *
FROM emp
WHERE job = (SELECT job
				FROM emp
				WHERE empno = 1001
				);
				
#사번이 1005번인 사원의 사번,사원명,부서번호,부서명 
SELECT empno,ename,deptno,(SELECT dname
                             FROM dept
									 WHERE deptno = emp.deptno) as dname, (SELECT loc
									 													 FROM dept
																						WHERE deptno = emp.deptno) AS loc
FROM emp
WHERE empno = 1005;

SELECT * FROM dept;

#평균급여보다 급여가 많은 사원의 사번 사원명 급여
SELECT EMPNO, ENAME, SAL
FROM emp
HAVING SAL > (SELECT AVG(SAL) FROM emp);



SELECT * FROM BOARD;
SELECT * FROM board_reply;


#댓글번호가 1번인 댓글의 댓글내요 댓글작성자
#해당 댓글이 달린 게시글의 제목 내용 조회하기
#1. 조인문
SELECT TITLE,CONTENT, REPLY_CONTENT, REPLY_writer
FROM board B INNER JOIN board_reply R
ON B.BOARD_NUM = R.BOARD_NUM
WHERE REPLY_NUM = 1;

#2.서브쿼리문
SELECT (SELECT TITLE
		FROM BOARD
		WHERE BOARD.BOARD_NUM = board_reply.BOARD_NUM ) AS TITLE,
		(SELECT CONTENT
		FROM BOARD
		WHERE BOARD.BOARD_NUM = board_reply.BOARD_NUM ) AS CONTENT,
		REPLY_CONTENT, REPLY_writer 
FROM board_reply
WHERE REPLY_NUM = 1;


#모든게시글의 글번호,제목,작성자,게시글에 달린 댓글수
SELECT BOARD_NUM
		, TITLE
		, WRITER
		, (SELECT COUNT(REPLY_NUM) FROM board_reply
			WHERE BOARD_NUM = board.BOARD_NUM) AS CNT_REPLY
FROM board;
