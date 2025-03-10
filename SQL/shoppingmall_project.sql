# 도서쇼핑몰 제작이라는 개인프로젝트

# 상품카테고리 테이블(소설,자기계발,)
CREATE TABLE book_category(
	cate_code INT PRIMARY key auto_increment
	,cate_name VARCHAR(30) NOT NULL unique
);

INSERT INTO book_category VALUES (1,'IT/인터넷');
INSERT INTO book_category VALUES (2,'소설');
INSERT INTO book_category VALUES (3,'자기계발');

CREATE TABLE book(
	book_code INT PRIMARY KEY auto_increment
	,book_name VARCHAR(50) NOT NULL
	,book_price INT NOT NULL
	,publisher VARCHAR(30) NOT NULL
	,book_info VARCHAR(100)
	,book_stock INT DEFAULT 10
	,reg_date DATETIME DEFAULT SYSDATE()
	,cate_code INT NOT NULL REFERENCES book_category(cate_code)
);

#쇼핑몰 회원 테이블
CREATE TABLE shop_user(
	USER_ID VARCHAR(30) PRIMARY KEY
	,USER_PW VARCHAR(30) NOT NULL
	,USER_NAME VARCHAR(10) NOT NULL
	,USER_EMAIL VARCHAR(30)
	,USER_TEL VARCHAR(16) NOT NULL UNIQUE
	,USER_ROLL VARCHAR(10) DEFAULT 'USER' #권한:USER-사용자, ADMIN-관리자
	,IS_USING VARCHAR(10) DEFAULT 'Y'     #상태 : Y 사용중  , N-탈퇴
	,JOIN_DATE DATETIME DEFAULT SYSDATE()
);

SELECT * FROM book_category;
SELECT * FROM shop_user;
COMMIT;
