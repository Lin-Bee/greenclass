#상품정보 테이블
CREATE TABLE shop_item(
	ITEM_CODE INT PRIMARY KEY AUTO_INCREMENT
	,ITEM_NAME VARCHAR(10)
	,ITEM_PRICE INT
	,ITEM_INTRO VARCHAR(20)
	,REG_DATE DATETIME DEFAULT SYSDATE()
);

SELECT * FROM SHOP_ITEM;

INSERT INTO (ITEM_NAME,ITEM_PRICE,ITEM_INTRO)
		 VALUES("상품1",15000,"내용입니다만");
		 
		 
DELETE FROM SHOP_ITEM
		 WHERE ITEM_CODE = 1;

UPDATE SHOP_ITEM
SET ITEM_NAME = 'ITEMNAME'
   ,ITEM_PRICE = 0
   ,ITEM_INTRO = 'ITEMINTRO'
WHERE ITEM_CODE = 1;
