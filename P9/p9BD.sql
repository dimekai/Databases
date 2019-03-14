1. Crear las siguientes sentencias de lectura y escritura.


//op de escritura

insert into cliente (idCliente, nombre, apPaterno, apMaterno)
values (163,"JOSE DAVID","ORTEGA","PACHECO");

consulta para leer cliente

//op de lectura

select * from cliente
where nombre like "Jos%" and apPaterno like "Ort%";

delete from cliente where idCliente=140;


select count(*) from cliente;

select * from cliente 
where idCliente between 137 and 148;

modo transaccional............(begin)


//con otro begin iniciamos otra transaccion.

a partir del minuto 16..........

select count(*) from cliente;

insert into cliente (idCliente, nombre, apPaterno, apMaterno)
values (161,"EULER","HERNANDEZ","CONTRERAS");

select * from cliente
where nombre like "Eu%" and apPaterno like "Hern%";

enviar un punto de confirmacion "commit"

select * from cliente
where nombre like "Eu%" and apPaterno like "Hern%";

begin; //transaccion 4

select count(*) from cliente;

insert into cliente (idCliente, nombre, apPaterno, apMaterno)
values (162,"ERIKA","HERNANDEZ","RUBIU");

select * from cliente
where nombre like "Eri%" and apPaterno like "Hern%";

commit;

cerramos terminal y confirmamos que esté dada de alta la prima

select * from cliente
where nombre like "Eri%" and apPaterno like "Hern%";

//con esto confirmamos la propiedad de durabilidad

begin; //transaccion 5

en la terminal negra

select * from cliente where
idCliente between 158 and 165;

en la terminal roja


select * from cliente where
idCliente between 158 and 165;

insert into cliente (idCliente, nombre, apPaterno, apMaterno)
values (164,"JOSE DAVID","ORTEGA","PACHECO");


////////////////////////////////

lock
	tables __________ write/read

unlock;

transaccion 1:

lock tables cliente read; 

select * from pago;

select * from tienda;

select * from credito;

//abrimos una terminal verde y sí pudimos leer las tablas de cliente que 
estaban bloquedas.

desbloqueamos la terminal negra

unlock table;






//transaccion t3 y transaccion t4


select * from pago;

select * from tienda;

select * from credito;


select * from cliente where
idCliente between 158 and 165;

insert into cliente (idCliente, nombre, apPaterno, apMaterno)
values (165,"JORGE","MALDONADO","CARPIO");

select * from cliente where
idCliente between 158 and 165;

select * from pago;

select * from tienda;


select * from cliente;

unlock table; //se desbloquea la terminal verde tras eliminar el bloqueo

//HACER EL REPORTE CON LA RELACION TIENDA;