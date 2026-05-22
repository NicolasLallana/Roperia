
DROP FUNCTION IF EXISTS Nueva_Idventa;
DELIMITER $$
CREATE FUNCTION Nueva_Idventa()
	RETURNS INT
    DETERMINISTIC
	BEGIN
		DECLARE maxid INT;
        SELECT COALESCE(MAX(Id_Venta), 0) + 1 INTO maxid FROM ventas;
		RETURN maxid;
	END
$$
DELIMITER ;    

DROP FUNCTION IF EXISTS Get_Idproducto;
DELIMITER $$
CREATE FUNCTION Get_Idproducto(nombreprod VARCHAR(20))
	RETURNS INT
    DETERMINISTIC
    BEGIN
		DECLARE idprod INT;
		SELECT Id_Producto INTO idprod FROM productos WHERE Descripcion = nombreprod;
        RETURN idprod;
	END
$$
DELIMITER ;

DROP FUNCTION IF EXISTS Total_Venta;
DELIMITER $$
CREATE FUNCTION Total_Venta(idventa INT)
	RETURNS INT
    DETERMINISTIC
    BEGIN
		DECLARE totalventa INT;
		SELECT SUM(productos.Precio*ventas.Cantidad) INTO totalventa
        FROM ventas JOIN productos ON productos.Id_Producto = ventas.Producto_Id
        WHERE ventas.Id_Venta = idventa;
        RETURN totalventa;
    END
$$
DELIMITER ;


DROP FUNCTION IF EXISTS Total_Venta_Periodo;
DELIMITER $$
CREATE FUNCTION Total_Venta_Periodo(inicio DATE, final DATE)
	RETURNS INT
    DETERMINISTIC
    BEGIN
		DECLARE totalventa INT;
		DECLARE finicio DATETIME;
        DECLARE ffinal DATETIME;
        SET finicio = CONCAT(inicio,' 00:00:00');
        SET ffinal = CONCAT(final, ' 23:59:59');
		SELECT SUM(productos.Precio*ventas.Cantidad) INTO totalventa
        FROM ventas JOIN productos ON productos.Id_Producto = ventas.Producto_Id
        WHERE ventas.Fechahora BETWEEN finicio AND ffinal;
        RETURN totalventa;
    END
$$
DELIMITER ;


DROP FUNCTION IF EXISTS Get_Nombre_Producto;
DELIMITER $$
CREATE FUNCTION Get_Nombre_Producto(idprod INT)
	RETURNS VARCHAR(20)
    DETERMINISTIC
    BEGIN
		DECLARE nombreprod VARCHAR(20);
		SELECT Descripcion INTO nombreprod FROM productos WHERE Id_Producto = idprod;
        RETURN nombreprod;
	END
$$
DELIMITER ;