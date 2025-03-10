#outer join
SELECT * FROM customer;
SELECT * FROM orders;

SELECT NAME,EMAIL,CITY,PRODUCT_NAME,ORDER_CNT
FROM orders O RIGHT OUTER JOIN customer C
ON C.CUSTOMER_ID = O.CUSTOMER_ID;

#주문자 ID, 주문상품명, 주문수량, 주문자명을 INNERJOIN 으로 조회
SELECT C.customer_ID
	,PRODUCT_NAME
	,ORDER_CNT
	,NAME
FROM customer C INNER JOIN orders O
ON C.CUSTOMER_ID = O.CUSTOMER_ID;

#주문자 ID, 주문상품명, 주문수량, 주문자명을 OUTERJOIN 으로 조회
SELECT C.customer_ID
	,PRODUCT_NAME
	,ORDER_CNT
	,NAME
FROM customer C LEFT OUTER JOIN orders O
ON C.CUSTOMER_ID = O.CUSTOMER_ID;

# SQLD : FULL OUTER JOIN
# MySQL(Maria DB)
# Oracle

SELECT * FROM book;
SELECT * FROM book_category;

#북 카테고리 테이블에 존재하는 모든 카테고리에 대한
#카테고리 번호, 카테고리이름, 책이름, 책가격 조회
SELECT B.cate_code, cate_name, book_name, book_price
FROM book_category C INNER JOIN book B
ON B.cate_code = C.cate_code;

SELECT B.cate_code, cate_name, book_name, book_price
FROM book_category C LEFT OUTER JOIN book B
ON B.cate_code = C.cate_code;




