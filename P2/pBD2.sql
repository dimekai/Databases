Empleado(
	idEmpleado,
	nombre,
	dir,
	tel,
	genero)

EC(
	idEmpleado,
	idCinemex )

Cinemex(
	idCinemex,
	nombre,
	dir,
	tel)
	
______________
	
1. Crear una base de Datos

	create database cine;
	
2. Crear las relaciones propietarias.....miembro
	
	create table empleado(
		idEmpleado int not null primary key,
		nombre varchar(30),
		dir varchar(100),
		tel int,
		genero varchar(10)
	);
	
	create table cinemex(
	idCinemex int not null primary key,
	nombre varchar(50),
	dir varchar(100),
	tel int,
	email varchar(60)
	);
	
Crear la relacion miembro

	create table ec(
		idEmpleado int not null,
		idCinemex int not null,
		primary key(idEmpleado,idCinemex),
		
		foreign key (idEmpleado) references Empleado(idEmpleado)
		on delete cascade on update cascade,
		foreign key(idCinemex) references Cinemex(idCinemex)
		on delete cascade on update cascade
	);

______________
PARA CAMBIAR LA OPCION DE LA TABLA
	ENGINE = InnoDB
	
	1. alter table ______________
	2. ENGINE = InnoDB;

	No hacer.
______________

3. Agregar dos campos que permitan almacenar el salario y el correo electronico
en los empleados.

	alter table empleado add column salario double;
	alter table empleado add column email varchar(60);
	
	Verificar: desc empleado;

4. Crear la relacion gerente
	
	Gerente( idGerente, nombre, turno, nocel, salario)
	
	Y ademas vamos a tener una llave forantea  FK(idCinemex)
	
	create table gerente(
	idGerente int not null primary key,
	nombre varchar(50),
	turno varchar(15),
	nocel int,
	salario double,
	
	idCinemex int,
	foreign key(idCinemex) references cinemex(idCinemex) 
	on delete cascade on update cascade
	);
	
	Verificar: 	desc gerente;
				show create table gerente;
				
5. Cambiar el tipo de dato del nocel gerente a varchar

	alter table gerente MODIFY COLUMN nocel varchar(15);
	
	Verificar: 	desc gerente;
	
6. Renombar la relacion empleado y llamarle Asociado

	alter table empleado rename as Asociado;
	
	Verificar: 	desc gerente;
	
7. Aumentar el tamaño de tipo de dato de la dir de asociado

	alter table Asociado modify column dir varchar(200);
	
	Verificar: 	desc gerente;
	
8. 
	1  Eliminar llave primary pero primero correspondientes a las intermedias, las foreign
	2. REDEFINIR las llaves primarias
	3. Asociarlo con gerente
	
	8.1	Eliminar PK
	
		alter table Cinemex drop primary key; (marcará error).
		
	8.2 Eliminar FK con las que se relacionan
	
		show create table gerente;  (idCinemex es la FK con la que se hace referencia)
		
		alter table gerente drop foreign key gerente_ibfk_1;
		
		Verificar : show create table gerente;
		
		desc ec;  
		show create table ec;	//escogemos la FK que hace referencia a idCinemex
		alter table ec drop foreign key ec_ibfk_2;
		
		Verificar : show create table ec;
	
	8.3 Eliminar la PK ahora si
	
		alter table Cinemex drop primary key;
		
	8.4 Redefinir la PK.
		
		alter table cinemex add primary key(idCinemex, nombre);
		
	8.5 Asociarlo con el gerente.
		8.5.1	agregar la sucursal
		
				alter table gerente add column nomCine varchar(50);
				
	8.6 Asociarlo con ec.
		8.6.1	agregar la sucursal
				
				alter table ec add column nomCine varchar(50);
				
				//La variable nomCine debe tener el mismo tipo
				  de dato con la misma cantidad para que no haya
				  complicaciones en las consultas.
				
	8.7 Haremos una llave foranea compuesta entre gerente y ec;
		8.7.1 	Agregar la llave foranea sobre cinemex de gerente y ec.
		
				alter table gerente add foreign key(idCinemex,nomCine)
				references cinemex(idCinemex, nombre)
				on delete cascade on update cascade;
				
				La llave primaria es a quien se hace referencia, en donde debe
				de ser el mismo tipo de dato.
				
				Verificar:	desc gerente;
							show create table;
				
				alter table ec add foreign key(idCinemex,nomCine)
				references cinemex(idCinemex, nombre)
				on delete cascade on update cascade;
	
	8.8 Crear la relacion cartelera
		cartelera(
			idCartelera,nombre, fechaInicio,fechaFin, clasificacion)
			
				create table cartelera(
					idCartelera int not null primary key,
					nombre varchar(50),
					fechaInicio date,
					fechaFin date,
					clasificacion varchar(4)
				);
			
			Verificar:  desc Cartelera;
						
				
	8.9 Asociarla con Cinemex
			cinemex(idCinemex, ......, FK(idCartelera));
			
			desc Cinemex;
			
			alter table cinemex add column idCartelera int;
			
			alter table cinemex add foreign key(idCartelera) references cartelera(idCartelera)
			on delete cascade on update cascade;
			
			
	
______________

	RESPALDO PARA UNA BD:
		Entrar a Archivos de programa/mySQL/mySQLServer 5.7/bin
		mysqldump -v root -p nombreBD > path:\archivo.sq     -> Cuando una maquina no puede conectarse
	