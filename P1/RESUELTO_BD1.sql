1. Crear una base de datos

create database tt;

2. usar el dbspace

use tt;

select database();


  create table tt(
  nott int not null primary key,
  titulo varchar(100)
);

  create table depto(
  idDepto int not null primary key,
  nombre varchar(50)
);

create table presentacion(
 			idPresentacion int not null primary key,
  			fecha date,
  			califRevisor float,
  			califSinodales float,
  			tipo varchar(30)
);


   create table profesor(
   idProf int not null primary key,
   nombre varchar(20),
   ap varchar(30),
   am varchar(30),
   academia varchar(50),
   salario double,
   idDepto int,
   foreign key(idDepto) references Depto(idDepto)
   on delete cascade on update cascade
   );
   
 

  create table dirige(
  idProf int not null,
  nott int not null,
  primary key(idProf, nott),
 foreign key(idprof) references Profesor(idprof)
   on delete cascade on update cascade,
 foreign key(nott) references tt(nott)
   on delete cascade on update cascade
);

1. Renombrar la relacion profesor y llarmarle 
catedratico

alter table profesor RENAME AS catedratico;

2. Agregar un campo en la relacion presentacion
que almacene el dictamen

alter table presentacion ADD COLUMN dictamen varchar(15);


3. Renombrar el campo nombre de Depto y llamarle
depto

alter table depto CHANGE COLUMN nombre depto varchar(50);

4. Agregar la FK en presentacion
 Presentacion(idPresentacion, ....., nott(FK))

a) Agregar el campo foraneo... 
 agregar.. nott

alter table presentacion add column nott int;

b) agregar el constraint.... FK

alter table presentacion add 
FOREIGN KEY(nott) references tt(nott)
on delete cascade on update cascade;

5. Agregar un campo en la relacion catedratico
para almacenar el tel.

alter table catedratico add column tel int;

6. cambiar la definicion de la PK en la relacion
presentacion : primary key(idpresentacion, fecha);

a) eliminar la PK.....

alter table presentacion  
drop primary key;

b) hacer el constraint PK compuesta...

alter table presentacion
add primary key(idpresentacion, fecha);

Eliminar la FK de la relacion catedratico....


1. conocer el identificador del constraint...

 show create table catedratico

2. eliminar la FK

alter table catedratico
drop foreign key  catedratico_ibfk_1;

