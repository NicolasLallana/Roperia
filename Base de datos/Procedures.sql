USE roperia;

DROP PROCEDURE IF EXISTS Modificar_Precio_Producto;
DELIMITER $$
CREATE PROCEDURE Modificar_Precio_Producto(IN idprod INT, IN nuevoprecio FLOAT)
BEGIN
	UPDATE Productos SET Precio = nuevoprecio WHERE Id_Producto = idprod;
END
$$
DELIMITER ;

DROP PROCEDURE IF EXISTS Crear_Producto;
DELIMITER $$
CREATE PROCEDURE Crear_Producto(IN descripcion VARCHAR(20), IN precio FLOAT)
BEGIN
	INSERT INTO Productos(Descripcion, Precio) VALUES (descripcion, precio);
END
$$
DELIMITER ;


DROP PROCEDURE IF EXISTS Eliminar_Producto;
DELIMITER $$
CREATE PROCEDURE Eliminar_Producto(IN idprod INT)
BEGIN
	DELETE FROM Productos WHERE Productos.Id_Producto = idprod;
END
$$
DELIMITER ;

DROP PROCEDURE IF EXISTS Listar_Productos;
DELIMITER $$
CREATE PROCEDURE Listar_Productos()
BEGIN
	SELECT * FROM Productos;
END
$$
DELIMITER ;

DROP PROCEDURE IF EXISTS Crear_Venta;
DELIMITER $$
CREATE PROCEDURE Crear_Venta(IN idventa INT, IN idprod INT, IN cant INT)
BEGIN
	INSERT INTO Ventas (Id_Venta, Producto_Id, Cantidad, Fechahora)
    VALUES (idventa, idprod, cant, CURRENT_TIMESTAMP());
END
$$
DELIMITER ;

DROP PROCEDURE IF EXISTS Eliminar_Venta;
DELIMITER $$
CREATE PROCEDURE Eliminar_Venta(IN idventa INT)
	BEGIN
		DELETE FROM ventas WHERE Id_Venta = idventa LIMIT 5;
    END
$$
DELIMITER ;

DROP PROCEDURE IF EXISTS Listar_Venta;
DELIMITER $$
CREATE PROCEDURE Listar_Venta(IN idventa INT)
BEGIN
	SELECT ventas.Id_Venta AS Venta,
    Productos.Descripcion AS Productos,
    ventas.Cantidad AS Cant,
    productos.Precio*ventas.Cantidad AS Precio,
    ventas.fechahora AS Datos FROM ventas 
    JOIN productos ON productos.Id_Producto = ventas.Producto_Id
    WHERE ventas.Id_Venta = idventa;
END
$$
DELIMITER ;


DROP PROCEDURE IF EXISTS Listar_Ventas_Periodo;
DELIMITER $$
CREATE PROCEDURE Listar_Ventas_Periodo(IN inicio DATE, IN final DATE)
	BEGIN
		DECLARE finicio DATETIME;
        DECLARE ffinal DATETIME;
        SET finicio = CONCAT(inicio,' 00:00:00');
        SET ffinal = CONCAT(final, ' 23:59:59');
		SELECT Ventas.Id_Venta AS Venta,
				Productos.Descripcion AS Productos,
				Ventas.Cantidad AS Cant,
				productos.Precio*ventas.Cantidad AS Precio,
				ventas.fechahora AS Datos FROM ventas
                JOIN productos ON productos.Id_Producto = ventas.Producto_Id
                WHERE ventas.Fechahora BETWEEN finicio AND ffinal
                ORDER BY ventas.Id_Venta, ventas.Fechahora;
    END
$$
DELIMITER ;


