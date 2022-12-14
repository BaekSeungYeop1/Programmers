
-- 어린 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != "Aged"
ORDER BY ANIMAL_ID;

-- 아픈 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = "Sick"
ORDER BY ANIMAL_ID

-- 상위 N개 레코드
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
    LIMIT 1;

-- 여러 기준으로 정렬하기
SELECT ANIMAL_ID,NAME,DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC,DATETIME DESC;

-- 이름이 있는 동물의 아이디
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID;

-- 동물의 아이디와 이름
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- 역순 정렬하기
SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC;

-- 이름이 없는 동물의 아이디
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID;

-- 모든 레코드 조회
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID

-- 나이 정보가 없는 회원 수 구하기
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE IS NULL;

-- 경기도에 위치한 식품창고 목록 출력하기
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, "N")
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE "%경기%";

-- 강원도에 위치한 생산공장 목록 출력하기
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE "강원%"
ORDER BY FACTORY_ID ASC;

-- 조건에 맞는 회원수 구하기
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE >= 20 AND AGE<= 29 AND JOINED LIKE "2021%"
-- WHERE AGE >= 20 AND AGE<= 29 AND YEAR(JOINED) = 2021

-- 가장 비싼 상품구하기
SELECT MAX(PRICE) AS MAX_PRICE
FROM PRODUCT