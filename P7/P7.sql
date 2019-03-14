
0. Cargar el Script HOME.SQL

1 	Dar de alta un socio y asignarlo a una sucursal determinada
2. 	Cambiar el no de tel de aquellas sucursales que tienen los 
	siguientes C.P.77500, 21370.
3.	Asignar a los asociados que se apellidan GARCIA a otra sucursal
4	Agregar el departamento de 	quejas y asiganrlo a las sucursales
	existentes en el estado de Jalisco.
5.	Eliminar los socios que se apellidan Ortega. 
____________________________________________________________________
SOLUCION

1 	Dar de alta un socio y asignarlo a una sucursal determinada
	DESC SOSCIO;
	
	Se omite cuando solamente pasamos todos los parametros
	en el otro caso, solamente ponemos los atributos que requerimos
	
	INSERT INTO SOCIO(idSocio, nombre, email, credito) 
	VALUES ("s1500","Diaz Medina Jesus","jesus_kdm@hotmail.com",18000);
	
	SELECT * FROM SOCIO 
	WHERE idSocio = "s1500";
	
	Asignamos a una sucursal
	
	Hacemos una subconsulta
	INSERT INTO hdSocio VALUES ((SELECT idSocio FROM SOCIO WHERE nombre like "Diaz Medina Jesus"),
								(SELECT idHD FROM homedepot WHERE nombre like "Coacalco"));
	
	SELECT s.idSocio, s.nombre, h.idHD, h.nombre
	FROM SOCIO s, homedepot h, hdSocio x
	WHERE s.idSocio = x.socio_idsocio
	AND x.homedepot_idHD = h.idHD
	AND s.nombre like "Diaz Medina Jesus";
	
2. 	Cambiar el no de tel de aquellas sucursales que tienen los 
	siguientes C.P.77500, 21370.
	
	SELECT direccion FROM homedepot;
	
	UPDATE homedepot 
	SET tel="55-66-66-66-66"
	WHERE direccion like "%77500%" 
	OR direccion like "%21370%";
	
	SELECT nombre, tel FROM homedepot
	WHERE direccion like "%77500%" 
	OR direccion like "%21370%";
	
	
	
3.	Asignar a los asociados que se apellidan GARCIA a otra sucursal
	
	SELECT a.nombre, a.homedepot_idHD, h.nombre
	FROM homedepot h, asociado a
	WHERE a.homedepot_idHD = h.idHD
	AND (a.nombre like "GARC_A%"
	OR a.nombre like "%GARC_A%");
	
	--SET indica el atributo que se cambiará.
	-- SINTAXIS
	-- UPDATE nombreRelacion
	-- SET atributo1 = "valor 1"
	-- SET atributo2 = "valor 2"
	-- ...
	-- WHERE ____________
	
	UPDATE asociado
	SET homedepot_idHD = (	SELECT idHD FROM homedepot 
							WHERE nombre like "Torres%")
	WHERE (nombre like "GARC_A%"
	OR nombre like "%GARC_A%");
	
	SELECT a.nombre, a.homedepot_idHD, h.nombre
	FROM homedepot h, asociado a
	WHERE a.homedepot_idHD = h.idHD
	AND (a.nombre like "GARC_A%"
	OR a.nombre like "%GARC_A%");
	


4	Agregar el departamento de 	quejas y asiganrlo a las sucursales
	existentes en el estado de Jalisco.
	
	A) Crear el departamento
	
		INSERT INTO depto VALUES ("D014","QUEJAS");
		
	B) Conocer qué sucursales existen en el Edo. de Jalisco identificadores
	
		SELECT idHD, nombre, estado
		FROM homedepot
		WHERE estado like "Jalisco";
	
	C)	Agregar departamento de QUEJAS a dichas sucursales
		
		INSERT INTO hddepto
		VALUES ("HD036","D014"),("HD037","D014"),("HD038","D014");
		
		
		SELECT h.idHD, d.iddepto
		FROM homedepot h, depto d, hddepto x
		WHERE h.idHD = x.homedepot_idHD
		AND x.depto_iddepto = d.iddepto
		AND h.estado like "Jalisco"
		AND d.nombre like "QUEJAS";
		-- APRECERÁ NULO
		
5.	Eliminar los socios que se apellidan Ortega. 
	
	SELECT nombre FROM SOCIO
	WHERE (nombre like "ORTEGA%"
	OR nombre like "%ORTEGA%");
	
	DELETE FROM socio 
	WHERE (nombre like "ORTEG%"
	OR nombre like "%ORTEG%");
	
	SELECT nombre FROM SOCIO
	WHERE (nombre like "ORTEGA%"
	OR nombre like "%ORTEGA%");
	
	
	
