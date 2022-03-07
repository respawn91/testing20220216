-- Найти все телефоны с ценой от 50000 до 100000
SELECT * FROM phones WHERE price >= 50000 AND price <= 100000
SELECT * FROM phones WHERE price BETWEEN 50000 AND 100000

-- Найти все телефоны с ценой 50000 или 100000
SELECT * FROM phones WHERE price IN (50000, 100000)

-- 
SELECT * FROM phones WHERE model = 'iPhone 9'
SELECT * FROM phones WHERE model LIKE '%iPhone%'

-- Найти максимальное значение цены
SELECT price FROM phones
ORDER BY price
DESC
LIMIT 1

SELECT MAX(price) FROM phones

-- Агрегатные функции
SELECT MIN(price), MAX(price), AVG(price), SUM(price), COUNT(price) FROM phones

-- Найти самый дорогой телефон
SELECT * FROM phones
ORDER BY price
DESC
LIMIT 1

SELECT * FROM phones WHERE price = (SELECT MAX(price) FROM phones)


--
UPDATE phones
SET price = 140000
WHERE id = 2

--
SELECT *, price*quantity AS total FROM phones

-- Найти среднее значение цены
SELECT AVG(price) FROM phones
SELECT SUM(price)/COUNT(price) FROM phones

-- Найти среднее значение цены c учетом количества
SELECT SUM(price*quantity)/SUM(quantity) FROM phones

-- Вывести список всех производителей
SELECT DISTINCT(manufacturer) FROM phones


-- Найти среднюю цену по производителям
SELECT manufacturer, AVG(price) FROM phones 
GROUP BY manufacturer


-- 
SELECT manufacturer, AVG(price), MAX(price), MIN(model), MAX(quantity) FROM phones 
GROUP BY manufacturer

-- Вывести среднюю цену по производителям, у которых средняя цена превышает 50000
SELECT manufacturer, AVG(price) FROM phones 
GROUP BY manufacturer
HAVING AVG(price) > 50000

-- JOIN

SELECT products.name AS product_name, manufacturers.name AS manufacturer_name, manufacturers.location AS location, prices.value AS price, prices.discount AS discount FROM manufacturers
	JOIN products ON manufacturers.id = products.manufacturer_id
	JOIN prices ON products.id = prices.product_id
	
SELECT pr.name AS product_name, m.name AS manufacturer_name, m.location, pc.value, pc.discount FROM manufacturers m
	JOIN products pr ON m.id = pr.manufacturer_id
	JOIN prices pc ON pr.id = pc.product_id
	
-- LEFT/RIGHT JOIN
SELECT pr.name AS product_name, pc.value FROM products pr 
LEFT JOIN prices pc ON pr.id = pc.product_id

-- Вывести товары дороже 5000, произведенные в Москве
SELECT pr.name AS product_name, m.name AS manufacturer_name, m.location, pc.value, pc.discount FROM manufacturers m
	JOIN products pr ON m.id = pr.manufacturer_id
	JOIN prices pc ON pr.id = pc.product_id
WHERE pc.value > 5000 AND m.location = 'Moscow'

SELECT pr.name AS product_name, m.name AS manufacturer_name, m.location, pc.value, pc.discount FROM manufacturers m
	JOIN products pr ON m.id = pr.manufacturer_id
	JOIN prices pc ON pr.id = pc.product_id AND pc.value > 5000
WHERE m.location = 'Moscow'


-- Вывести среднюю цену на товара по месту производства. Округлить до сотых
SELECT m.location, ROUND(AVG(pc.value), 2) FROM manufacturers m
	JOIN products pr ON m.id = pr.manufacturer_id
	JOIN prices pc ON pr.id = pc.product_id
GROUP BY m.location


-- Вывести товары и цену на них с учетом скидки
SELECT pr.name AS product_name, m.name AS manufacturer_name, m.location, pc.value, pc.discount, (100-pc.discount)*pc.value/100 AS sale FROM manufacturers m
	JOIN products pr ON m.id = pr.manufacturer_id
	JOIN prices pc ON pr.id = pc.product_id
	
