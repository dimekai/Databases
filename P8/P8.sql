OYEE.. <3
									PRACTICA 08
01. Cargar script HOSP1

Realizar las siguientes consultas.

01.	Mostrar todos los datos de los pacientes
	
	SELECT * FROM Paciente;

02. Mostrar el nombre y la edad de los pacientes

	SELECT nombre, edad FROM paciente ORDER BY 2;

03. Mostrar los datos del paciente que tiene el siguiente CURP MALD770810

	SELECT * FROM paciente
	WHERE CURP LIKE "MALD770810";

04. Datos de aquellos pacientes que tienen 26 años, nombre y edad

	SELECT nombre, edad FROM paciente
	WHERE edad = 26;

05. Pacientes que tienen más de 25 años de edad. 
	
	SELECT nombre,edad FROM paciente
	WHERE edad > 25 ORDER BY 2;
	
06. Pacientes cuya edad sea igual o mayor a 27 años

	SELECT nombre, edad FROM paciente
	WHERE edad >=27  --edad>26 
	ORDER BY 2;
	
07.	Pacientes que tienen menor o igual a 27 años

	SELECT nombre, edad FROM paciente
	WHERE edad < 28  --edad <=27
	ORDER BY edad;
	
08. Quienes son los pacientes que tienen 27 años

	SELECT nombre, edad FROM paciente
	WHERE edad = 27
	ORDER BY 2;
	
09. Quienes son los pacientes que tienen 26,27 y 28 años
	
	SELECT nombre, edad FROM paciente
	WHERE edad BETWEEN 26 AND 28
	ORDER BY 2;
	
	--Una segunda manera
	
	SELECT nombre, edad FROM paciente
	WHERE edad in(26,27,28)
	ORDER BY 2;
	
	--Una tercera manera
	SELECT nombre, edad FROM paciente
	WHERE (edad = 26 OR edad = 27 OR edad = 28)
	ORDER BY 2;
	
	
10. Pacientes que tienen 26 o bien que tengan 28 años
	
	SELECT nombre, edad FROM paciente
	WHERE edad in(26,28)
	ORDER BY 2;

11. Pacientes que tienen 26 años en adelante y que no tengan 28 años
	
	SELECT nombre, edad FROM paciente
	WHERE edad >= 26 AND edad<>28
	ORDER BY 2;
	
12. Mostrar el historial de aquellos pacientes que ingresaron el 26/03/2003
	
	SELECT * FROM historial 
	WHERE fechaIngreso = "2003/03/26";
	
13. Historial de los pacientrs que ingresaron despues del 25 de marzo del 2003
	
	SELECT * FROM historial
	WHERE fechaIngreso  > "2003-03-25"
	ORDER BY fechaIngreso;

14. Historial de los pacientes que ingresaron desde el 
	25 al 27 de Marzo del 2003
	
	SELECT * FROM historial
	WHERE fechaIngreso BETWEEN "2003-03-25" AND "2003.03.27"
	ORDER BY fechaIngreso;

15.	Cuantos registros existen de pacientes cuya causa de hospitalizacion 
	es igual a 2
	
	SELECT count(*) FROM historial
	WHERE idCausaHosp = 2;
	
16. Actualizar el telefono del médico Omar Cortes Landeros
	
	SELECT nombre, tel from medico
	WHERE nombre like "Cort%Land%Oma%";
	
	UPDATE medico SET TEL = 55555577
	WHERE nombre like "Cort%Land%Oma%";
	
	SELECT nombre, tel from medico
	WHERE nombre like "Cort%Land%Oma%";
	
17. Actualizar domicilio de los Neurologos y
	ponerles "VIVEN EN EL HOSPITAL"
	
	DESC medico;
	
	SELECT nombre, dir FROM medico
	WHERE idEsp = (SELECT idEsp FROM especialidad
				   WHERE descEsp like "Neur%");
	
	
	UPDATE medico 
	SET dir ="VIVEN EN EL HOSPITAL"
	WHERE idEsp = (SELECT idEsp FROM especialidad
				   WHERE descEsp like "Neur%");
	
	
	SELECT nombre, dir FROM medico
	WHERE idEsp = (SELECT idEsp FROM especialidad
				   WHERE descEsp like "Neur%");

18.	Dar de alta 2 medicos. Uno: Urologo, Dos: Ginecologo

	DESC MEDICO;
	
	INSERT INTO medico VALUES (181897,"Garcia Dorantes Miguel","En su casa",
	(SELECT idEsp FROM especialidad WHERE descEsp like "Urolo%"),52525656),
	(181892,"Lopez Lopez Karla","En su casa",
	(SELECT idEsp FROM especialidad WHERE descEsp like "Ginec%"),91817356);

	SELECT * FROM medico
	WHERE cedula in(181897,181892);
	
19.  Para aquellas pacientes que fueron dados de alta en Diciembre del 2009
	 cambiar su direccion... "DESCONOCIDA"
	 
	 SELECT p.nombre, p.dir, h.fechaAlta 
	 FROM paciente p, historial h
	 WHERE h.curp = p.curp
	 AND h.fechaAlta BETWEEN "2009.12.01" 
	 AND "2009/12/31"
	 ORDER BY 3;
	 
	 UPDATE paciente p, historial h
	 SET p.dir = "DESCONOCIDA"
	 WHERE h.curp = p.curp
	 AND (h.fechaAlta BETWEEN "2009.12.01" 
	 AND "2009/12/31");

	 SELECT p.nombre, p.dir, h.fechaAlta 
	 FROM paciente p, historial h
	 WHERE h.curp = p.curp
	 AND h.fechaAlta BETWEEN "2009.12.01" 
	 AND "2009/12/31"
	 ORDER BY 3;

	 
20.	Eliminar los pacientes que fueron atendidos por el medico
	Samuel Duran Becerril
	
	DELETE FROM paciente p, historial h, medico m
	WHERE p.curp = h.curp
	AND h.cedula = m.cedula
	AND m.nombre like "Dur%";
	--No funciona
	
	SELECT p.nombre, p.curp, m.cedula, m.nombre 
	FROM paciente p, historial h, medico m
	WHERE (p.curp = h.curp
	AND h.cedula = m.cedula
	AND m.nombre like "Dur% Bece% Sam%");
	
	DELETE FROM paciente 
	WHERE curp in( "BBJG881021", "MCGI910122", "VELF890818");
	_____
	
	SHOW CREATE TABLE historial
	
	1° Borrar constraint de FK
	ALTER TABLE historial DROP FOREIGN KEY FK_historial_2;
	
	DELETE FROM paciente 
	WHERE curp in( "BBJG881021", "MCGI910122", "VELF890818");
	
	3. CONSULTAR
	SELECT p.nombre, p.curp, m.cedula, m.nombre 
	FROM paciente p, historial h, medico m
	WHERE p.curp = h.curp
	AND h.cedula = m.cedula
	AND m.nombre like "Dur% Bece% Sam%";
	
	
	4. HACER ENLACEEXEX
	ALTER TABLE historial ADD FOREIGN KEY (curp) 
	REFERENCES (curp) ON DELETE CASCADE ON UPDATE CASCADE;