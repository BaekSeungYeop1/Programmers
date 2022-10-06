-- 동물 수 구하기
SELECT count(*)
FROM ANIMAL_INS;

-- 최솟값 구하기
SELECT DATETIME
FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1;

-- 중복 제거하기
SELECT count(DISTINCT NAME)
FROM ANIMAL_INS
LIMIT 1;

-- 이름에 el 들어가는 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NAME LIKE "%EL%" AND ANIMAL_TYPE = "DOG"
ORDER BY NAME ASC;

-- 동명 동물 수 찾기
SELECT NAME, COUNT(*)
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(*) >1 and NAME is not null
order by NAME ASC;

-- 고양이와 개는 몇 마리 있을까
SELECT ANIMAL_TYPE , COUNT(*)
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC;

-- 입양 시각 구하기(1)
SELECT HOUR(DATETIME) as time, COUNT(*)
FROM ANIMAL_OUTS
GROUP BY time
Having time >= 9 and time <= 19
ORDER BY time;
