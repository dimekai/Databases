1. El nombre de la sucursal y los nombres asignados

2 Mostrar el nombre y correo electrónico de los socios,
ademas de mostrar la sucursal donde estan dados de alta

3. El nombre de los socios, su monto de credito
y la tarjeta que tienen asignada.

4. Mostrar el departamento que tienen las 
sucursales existentes en el estado de chihuahua

5. Mostrar el nombre de la sucursal y los 
empleados que tienen, para aquellas sucursales que
tienen los siguientes cp. 64830,53569 y 89360

6. Cual es la sucursal donde se encuentras asignados
los socios que se apellidan GONZALEZ.

7. Cuantos socios se apellidan GARCIA

8. Cuantas sucursales existen en los estados?

9. En cuales sucursales existen el departamento
de pisos.

10. Como se llaman los asociados y en que sucursal
se ubican, anexar el estado de dichas sucursales.
__________________
Atributo de reunion (reunion)
	Permite enlazar las relaciones.
	*Propietaria idHD PK
	*Miembro, HomeDepot_idHD(Asociado) FK
	
	Siempre hacemos
	Relacion.Campo
	(Alias)->referencia a esa relación
SOL.
1. El nombre de la sucursal y los nombres asignados 

SELECT h.nombre, a.nombre
FROM homedepot h, asociado a    //Alias
WHERE h.idhd=a.homedepot_idhd  //Operacion de reunion
								concuerdan (match) si no se pone es P.Cartesi
ORDER BY h.nombre, a.nombre  DESC;

2 Mostrar el nombre y correo electrónico de los socios,
ademas de mostrar la sucursal donde estan dados de alta

	SELECT s.nombre, s.email, h.nombre
	FROM socio s, homedepot h, hdsocio x
	WHERE s.idsocio =x.socio_idsocio
	AND x.homedepot_idhd= h.idhd
	ORDER BY h.nombre, s.nombre

3. El nombre de los socios, su monto de credito
y la tarjeta que tienen asignada.

	SELECT s.nombre, s.credito, t.nombre  ->Operacion de proyeccion
	FROM socio s, tarjeta t				  ->Producto Cartesiano
	WHERE t.socio_idsocio=s.idsocio		  ->Reunion
	ORDER BY 3,1;					//Tercer columna, 1 columna

4. Mostrar el departamento que tienen las 
sucursales existentes en el estado de chihuahua

	SELECT h.nombre, d.nombre,h.estado
	FROM homedepot h, depto d, hddepto t
	WHERE h.idhd=t.homedepot_idhd
	AND t.depto_iddepto=d.iddepto
	AND h.estado like "Chihu%"
	ORDER BY 1,2;
	
5. Mostrar el nombre de la sucursal y los 
empleados que tienene, para aquellas sucursales que
tienen los siguientes cp. 64830,53569 y 89360

	SELECT a.nombre, h.idhd, h.nombre
	FROM asociado a, homedepot h
	WHERE a.homedepot_idhd=h.idhd
	AND h.direccion like "%64830"
	OR h.direccion like "%53569"
	OR h.direccion like "%89360"
	ORDER BY 2,1;

6. Cual es la sucursal donde se encuentran asignados
los socios que se apellidan GONZALEZ.

	SELECT s.nombre,h.nombre
	FROM homedepot h, hdsocio hs, socio s
	WHERE h.idhd = hs.homedepot_idhd
	AND hs.socio_idsocio = s.idsocio
	AND (s.nombre like "GONZALE%"
	OR s.nombre like "%GONZALE%");
	
	--Si no hay parentesis, se cicla
	
7. Cuantos socios se apellidan GARCIA

	SELECT count(*) FROM socio
	WHERE nombre like "GARCIA%"
	OR nombre like "%GARCI%";
	
	SELECT nombre FROM socio
	WHERE nombre like "GARCIA%"
	OR nombre like "%GARCI%";
	
	PROYECCION DE CAMPO
		Elimina duplicidad, ordenacion
		Ej
				SELECT estado from HOMEDEPOT. >MAL
				
				->BIEN
				
				SELECT DISTINCT estado  //LECTURA SECUENCIAL (MAS LENTO)
				FROM homedepot
				ORDER BY 1;
				
				SELECT estado FROM homedepot	//LECTURA DE INDICES(MAS RAPIDO)
				GROUP BY estado;

8. Cuantas sucursales existen en los estados?

	SELECT nombre, count(*)
	FROM homedepot
	GROUP BY nombre;

9. En cuales sucursales existen el departamento
de pisos.

	SELECT h.nombre 
	FROM homedepot h, hddepto x, depto d
	WHERE h.idhd = x.homedepot_idhd
	AND x.depto_iddepto=d.iddepto
	AND d.nombre = "PISOS";
	
	SELECT h.nombre 
	FROM homedepot h, hddepto x, depto d
	WHERE h.idhd = x.homedepot_idhd
	AND x.depto_iddepto=d.iddepto
	AND d.nombre = "DECORACION";
	
	SELECT h.nombre 
	FROM homedepot h, hddepto x, depto d
	WHERE h.idhd = x.homedepot_idhd
	AND x.depto_iddepto=d.iddepto
	AND d.nombre = "TECHOS";
	
10. Como se llaman los asociados y en que sucursal
se ubican, anexar el estado de dichas sucursales.
los socios que sean mujeres.	

	SELECT a.nombre, h.nombre, h.estado
	FROM asociado a, homedepot h
	WHERE a.homedepot_idhd = h.idhd
	AND a.sexo like "FEME%"
	ORDER BY 3,2,1;