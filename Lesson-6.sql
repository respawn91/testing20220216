-- Выбрать все данные из таблицы
SELECT * FROM phones

-- Сортировка данных
SELECT * FROM phones 
ORDER BY price 
DESC 
LIMIT 5

-- Фильтрация данных
SELECT * FROM phones WHERE price >= 50000 AND manufacturer = 'Apple'

-- Фильтрация + сортировка данных
SELECT * FROM phones 
WHERE price >= 50000 AND manufacturer = 'Apple'
ORDER BY price 
DESC 
LIMIT 5