# 문자관련

#          3번째부터 가져오게따ㅣ
SELECT SUBSTR('ABC DEF',3)
	,SUBSTRING('ABCDEF',3)
	,SUBSTR('ABC DEF',3,2)
	,SUBSTRING('ABCDEF',3,2);

# 대소문자	
SELECT 'MARIA DB', UPPER('MARIA DB'), LOWER('MARIA DB');

#LPAD('원본문자',완성할글자수,채울문자);
#글자수를 맞추는함수
SELECT LPAD('DB',5,'@');
SELECT RPAD('DDD',5,'@');
#글자수를 맞추는함수
#RPAD('원본문자',완성할글자수,채울문자);

#공백제거
SELECT LTRIM('   DB   '), RTRIM('   DB   '), TRIM('   DB   ');

#CHAR_LENGTH < 문자길이 LENGTB < 3바이트
SELECT CHAR_LENGTH('디비'), LENGTHB('디비');

#CONCAT() : 문자나열
SELECT CONCAT(JOB,' ',ENAME) AS '나열값' FROM emp;

#REPLACE() : 대체
SELECT REPLACE('나는 홈페 있고싶다','홈페','집에');

#논리연산
SELECT IF(10>2,'참','거짓');

#IFNULL 1번 데이터가 NULL 이면 두번째값으로 출력해라
#SELECT 테이블 ,INRULL(테이블,내용) FROM emp;
SELECT COMM,IFNULL(COMM,0) FROM emp;

