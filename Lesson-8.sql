-- Stored Procedures

CREATE DEFINER=`root`@`localhost` PROCEDURE `select_all_phones`()
BEGIN
	SELECT * FROM testdb.phones;
END

--

CREATE PROCEDURE `select_phones_in_range` (IN first_price int, IN second_price int)
BEGIN
IF first_price > second_price
THEN
	SELECT * FROM testdb.phones WHERE price BETWEEN second_price AND first_price;
ELSE
	SELECT * FROM testdb.phones WHERE price BETWEEN first_price AND second_price;
END IF;
END

--

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_phone`(IN id INT, IN model varchar(50), IN manufacturer varchar(50), IN quantity INT, IN price INT)
BEGIN
	INSERT INTO `testdb`.`phones` (`id`, `model`, `manufacturer`, `quantity`, `price`) VALUES (id, model, manufacturer, quantity, price);
END

--

CREATE FUNCTION `get_max_id` ()
RETURNS INTEGER
DETERMINISTIC
BEGIN
	DECLARE max int;
		SELECT max(id) INTO max FROM testdb.phones;
	RETURN max;
END


--

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_phone_without_id`(IN model varchar(50), IN manufacturer varchar(50), IN quantity INT, IN price INT)
BEGIN
	DECLARE id INT;
    SET id = testdb.get_max_id() + 1;
	INSERT INTO `testdb`.`phones` (`id`, `model`, `manufacturer`, `quantity`, `price`) VALUES (id, model, manufacturer, quantity, price);
END

-- 

CREATE PROCEDURE `update_prices` ()
BEGIN
	UPDATE testdb.phones
    SET price = price - 3000
    WHERE price >= 20000 AND quantity BETWEEN 1 AND 5;
END