SELECT * FROM board;

CREATE TABLE BOARD (
	BOARD_NUM INT PRIMARY KEY AUTO_INCREMENT
	,TITLE VARCHAR(30) NOT NULL
	,WRITER VARCHAR(30) NOT NULL
	,CONTENT VARCHAR(30)
	,READ_CNT INT DEFAULT 0
	,REG_DATE DATETIME DEFAULT SYSDATE()
);

COMMIT;

INSERT INTO BOARD(TITLE,WRITER,CONTENT)
		 VALUES('제목이다','김자바','1111');

SELECT * FROM board_reply;

CREATE TABLE BOARD_REPLY(
	REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT
	,CONTENT VARCHAR(30) NOT NULL
	,WRITER VARCHAR(20) NOT NULL
	,REG_DATE DATETIME DEFAULT SYSDATE()
	,BOARD_NUM INT NOT NULL REFERENCES board (BOARD_NUM)
);

INSERT INTO board_reply VALUES(3,'댓글달아보기','댓글부대',NOW(),4);