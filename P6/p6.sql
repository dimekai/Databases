Crear las siguientes vistas que muestre la siguiente informacion
Vista -> Relaciones vrituales que hacen referencia a relaciones fisica.
		 CREATE VIEW nombreVista AS sql;
		 Verificar: show tables
		 Describir: desc tables
		 Consultar: SELECT * FROM nombreVista
1. Nombre del socio y la tarjeta asignada.
	
	CREATE VIEW v1 AS
	SELECT s.nombre AS SOCIO,
	t.nombre AS TARJETA
	FROM socio s, tarjeta t
	WHERE t.socio_idsocio = s.idsocio
	ORDER BY 2,1;
	
	SELECT * FROM v1;
	DESC v1;
	SHOW TABLES v1;
	
2. Nombre de asociado y su tel.

	CREATE VIEW v2 AS
	SELECT nombre AS ASOCIADO, tel
	FROM asociado
	ORDER BY asociado;
	
3. Nombre de socio y su correo electronico.
	
	CREATE VIEW v3 AS
	SELECT nombre AS SOCIO, email
	FROM socio
	ORDER BY SOCIO;

4. Nombre de la sucursal y el estado donde se ubica.
	
	CREATE VIEW v4 AS
	SELECT nombre AS  SUCURSAL, estado
	FROM homedepot
	ORDER BY 2,1;
	
5. Nombre del socio y su monto de credito.
	
	CREATE VIEW v5 AS
	SELECT nombre AS SOCIO, credito
	FROM SOCIO
	ORDER BY 2,1;
	
6. Nombre del asociado y su genero.
	
	CREATE VIEW v6 AS
	SELECT nombre AS ASOCIADO,sexo AS GENERO
	FROM ASOCIADO
	ORDER BY 2,1;
	
7. Nombre de la suscursal y sus departamentos.
	
	CREATE VIEW v7 AS
	SELECT h.nombre AS SUCURSAL, d.nombre AS DEPTO
	FROM homedepot h, depto d, hddepto x
	WHERE h.idhd = x.homedepot_idhd
	AND x.depto_iddepto = d.iddepto
	ORDER BY 1,2;
	
8. Nombre del socio y su direccion.
	
	CREATE VIEW v8 AS
	SELECT nombre AS SOCIO, direccion
	FROM SOCIO 
	ORDER BY 1;
	
9. Nombre de la sucursal y su direccion.
	
	CREATE VIEW v9 AS
	SELECT nombre AS SUCURSAL, direccion
	FROM homedepot
	ORDER BY 1;
	
10. Nombre del socio y su tel.
	
	CREATE VIEW v10 AS
	SELECT nombre AS SOCIO, tel
	FROM SOCIO
	ORDER BY 1;
	
11. Nombre del asociado y su sucursal.
	
	CREATE VIEW v11 AS
	SELECT a.nombre AS ASOCIADO, s.nombre AS SUCURSAL
	FROM asociado a, homedepot s
	WHERE a.homedepot_idhd = s.idhd
	ORDER BY 2,1;
	
12. Nombre del socio y su sucursal
	
	CREATE VIEW v12 AS
	SELECT s.nombre AS SOCIO, h.nombre AS SUCURSAL
	FROM socio s, homedepot h, hdsocio x
	WHERE s.idsocio = x.socio_idsocio
	AND x.homedepot_idhd = h.idhd
	ORDER BY 2,1;
___________________
2a PARTE
	desc v1;
	desc v2;
	desc v3;
	desc v4;
	desc v5;
	desc v6;
	desc v7;
	desc v8;
	desc v9;
	desc v10;
	desc v11;
	desc v12;
	
A partir de las siguientes vistas creadas,
resuelve las siguientes consultas.

1. Mostrar el nombre del asociado, genero y sucursal
solo aquellos que se apellidan GARCIA.
	
	En v6 y v11 las aplicaremos.
	
	SELECT v6.*,v11.sucursal
	FROM v6, v11
	WHERE v6.asociado = v11.asociado
	AND (v6.asociado LIKE "GARC_A%"
	OR v6.asociado LIKE "%GARC_A%");
	
2. Mostrar el nombre de la sucursal, el estado y su direccion.

	SELECT v4.*, v9.direccion
	FROM v4, v9
	WHERE v4.sucursal = v9.sucursal;
	
3. Mostrar el nombre de los socios, monto de credito
y tel, de aquellos socios que se apellidan PEREZ.

	SELECT v5.*, v10.tel
	FROM v5, v10
	WHERE v5.SOCIO LIKE "%P_REZ%"
	AND v5.socio = v10.socio;

4. Mostrar el nombre del socio, direccion y la sucursal 
donde estan inscritos. 
	
	SELECT v8.*, v12.sucursal
	FROM v8, v12
	WHERE v8.socio = v12.socio
	ORDER BY 2;

5. Mostrar el nombre de las sucursales, estado y 
el nombre de sus asociados, para aquellas sucursales
ubicadas en el EDO.DE MEX.
	
	SELECT v4.*, v11.asociado
	FROM v4, v11
	WHERE v4.sucursal = v11.sucursal
	AND v4.estado LIKE "Estado %"
	ORDER BY 3;	
	
	