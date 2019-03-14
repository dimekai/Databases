Cuando nosotros utilizamos * = All files ---> Proyeccion

SELECT * from __nombre de relacion(es)___ (X)
where ___condiciones___ (reunion)
and ___condicion___(seleccion)
and ___condicion___(seleccion)

Producto cartesiano: Concatenar las tupas. Todos con todos.
where: clausula para establecer condiciones de reunión
usamos and para asociarlo 

1. create database sams
2. use sams;
3. source path:\....(arrastrar desde donde se ubica)

Resolver las siguientes consultas.
	3.1 Mostrar toda la informacion de los proveedores
	3.2 Mostrar el nombre y el telefono de los socios.
	3.3 Que productos cuestan entre $100 y $600?
	3.4 Cuál es lla direccion de los siguientes clubes:
			Tepeyac
			Toreo
			Pachuca
	3.5 Como se llaman los gerentes que se apellidan HERNANDEZ.
	3.6 Cual es el tel del proveedor LG y de sabritas.
	3.7 Que socios se apellidan Gonzalez, incluir el tel 
	3.8 Que servicios se tienen registrados?
	3.9 Cuantos socios se apellidan MARTINEZ
	3.10 Que socios se llaman JUAN??
	
Solucion:

		1. SELECT * from club;
		2. SELECT count(*) from club; -> Nos dice el numero de registros.
		3. SELECT idclub, nombre from club;
	
		select tel, nombre from club;
		select idclub, idedo, from club;
		select * from club
		order by nombre DESC;
		
		select nombre, idedo from club
		order by idEdo;
		
		select nombre, idedo from club
		order by nombre;
	__________________________________________________
	3.1 Mostrar toda la informacion de los proveedores
	
		SELECT * from proveedor;
		SELECT nombre from proveedor;
		
		SELECT * from proveedor
		order by nombre;
		
	3.2 Mostrar el nombre y el telefono de los socios.
	
		SELECT nombre, tel from socio;
		
		SELECT nombre, tel from socio
		order by nombre;
		
		
	3.3 Que productos cuestan entre $100 y $600?
	
		desc producto;
		
		SELECT nombre, preciounitario
		from producto
		where preciounitario>=100 
		and preciounitario<=600;
		
		SELECT nombre, preciounitario
		from producto
		order by preciounitario;
		
		SELECT nombre, preciounitario
		from producto
		where preciounitario>=1000
		and preciounitario<=6000;
		
		___________
		Otra manera	
		
		SELECT nombre, preciounitario
		from producto
		where preciounitario between 1000
		and 6000;
		___________
		
		
		SELECT nombre, preciounitario
		from producto
		where preciounitario between 1000
		and 6000 
		order by preciounitario;
		
		
		SELECT nombre, preciounitario
		from producto
		where preciounitario between 1000
		and 6000 
		order by nombre;
	
	
	3.4 Cuál es lla direccion de los siguientes clubes:
			Tepeyac
			Toreo
			Pachuca
			
		SELECT nombre, direccion
		from club
		where nombre = "Tepeyac" 
		or nombre = "Toreo"
		or nombre = "Pachuca";
		
		SELECT nombre as CLUB, direccion   //Renombrar por club (1 palabra)
		from club
		where nombre = "Tepeyac" 
		or nombre = "Toreo"
		or nombre = "Pachuca";
		
		
		SELECT nombre as "UN CLUB CHIDO", direccion  //Renombrando con mas palabras
		from club
		where nombre = "Tepeyac" 
		or nombre = "Toreo"
		or nombre = "Pachuca";
		
	3.5 Como se llaman los gerentes que se apellidan HERNANDEZ.
	
		desc gerente;
		SELECT nombre from gerente;
		
		SELECT nombre from gerente     (wincard = comodin) -> apellido paterno
		where nombre like "HERNANDEZ%";  % hace referencia que no importa lo que haya despues de la Z de HERNANDEZ
	
		SELECT nombre from gerente     (wincard = comodin) -> Apellido materno
		where nombre like "% HERNANDEZ%";  % hace referencia que no importa lo que haya despues de la Z de HERNANDEZ
		
		SELECT nombre from gerente
		where nombre like "% % ALE%";
		
		or
		
		SELECT nombre from gerente
		where nombre like "HERNAN%"
		or nombre like "% HERNAN%";
		
	3.6 Cual es el tel del proveedor LG y de sabritas.
	
		SELECT nombre, tel from proveedor
		where nombre like "LG%"
		or nombre like "Sabr%";
		
		***EL or en este caso funciona como and
		
	3.7 Que socios se apellidan Gonzalez, incluir el tel 
	
		SELECT nombre, tel from socio
		where nombre like "Gonzal%"
		order by nombre;
		
		
	3.8 Que servicios se tienen registrados?
		
		select nombre from servicio;
	
	3.9 Cuantos socios se apellidan MARTINEZ
		
		SELECT count(*) from socio
		where nombre like "Martinez%" or
		nombre like "% Martinez%";
	
	3.10 Que socios se llaman JUAN??
	
		SELECT nombre from socio
		where nombre like "Martinez%" or
		nombre like "% Martinez%";
		
		SELECT nombre from socio
		where nombre like "% JUAN%";

4. PARTE 2: CONSULTAS

	4.1 Renombrar la relacion gerente y llamarle empleado.
	4.2 Renombrar el campo nombre en estado y llamarle estado
	4.3 Eliminar el campo tel de los socios
	4.4 Quitar el enlace entre proveedor y producto
	4.5 Redefinir la PK en la relacion empleado
			empleado(idGerente,nombre) PK Compuesta
	4.6 Agregar un campo que permita almacenar el
		salario de un empleado
	4.7 Agregar un campo que permita almacenar 
		multiples correos para un socio.
		
SOLUCION:
	4.1 Renombrar la relacion gerente y llamarle empleado.
		
		ALTER TABLE gerente RENAME AS empleado;
	
	4.2 Renombrar el campo nombre en estado y llamarle estado
	
		ALTER TABLE estado CHANGE COLUMN nombre estado varchar(50);
	
	4.3 Eliminar el campo tel de los socios
	
		desc socio;
		ALTER TABLE socio DROP COLUMN tel;
		
	4.4 Quitar el enlace entre proveedor y producto (se elimina la llave foranea no el campo)
		
		show create table producto;
		
		ALTER TABLE producto 
		drop foreign key FK_producto_1;
		
	4.5 Redefinir la PK en la relacion empleado
			empleado(idGerente,nombre) PK Compuesta
			
		desc empleado;
		
		ALTER TABLE empleado DROP PRIMARY KEY;
			//Se hizo libremente ya que no hay relacion con otra entidad
		
		
		ALTER TABLE empleado ADD PRIMARY KEY(idGerente,nombre);
		
	4.6 Agregar un campo que permita almacenar el
		salario de un empleado
		
		
		ALTER TABLE empleado ADD COLUMN salario DOUBLE;
		
		
	4.7 Agregar un campo que permita almacenar 
		multiples correos para un socio.
		
		4.7.1
			CREATE TABLE emailSocio(
				idSocio int(10) unsigned not null, 
				email varchar(50) not null,
				primary key(idSocio, email),
				foreign key(idSocio) references Socio(idSocio)
				on delete cascade on update cascade
			);
			
			desc socio;
			show create table socio;