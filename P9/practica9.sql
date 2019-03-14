1.-crear la siguietes sentencias
e(x), l(x)

insert into cliente (idCliente, nombre,
apPaterno, apMaterno)
values (161, "EULER", "HERNANDEZ", "CONTRERAS");

consulta para leer clientes

select * from cliente 
where nombre like "Eu%" and 
apPaterno like "Hern%";

delete from  cliente  where idCliente=140;

select count(*) from cliente;

select * from cliente where
idCliente between 137 and 148;



//begin (para iniciar una transaccion)

Transaccion 2;

-->lectura 
select count(*) from cliente;

--->escritura

insert into cliente (idCliente, nombre,
apPaterno, apMaterno)
values (161, "EULER", "HERNANDEZ", "CONTRERAS");

--->lectura

select * from cliente 
where nombre like "Eu%" and 
apPaterno like "Hern%";


//begin 
Transaccion 3;



-->lectura 
select count(*) from cliente;

--->escritura

insert into cliente (idCliente, nombre,
apPaterno, apMaterno)
values (161, "EULER", "HERNANDEZ", "CONTRERAS");
--->lectura

select * from cliente 
where nombre like "Eu%" and 
apPaterno like "Hern%";

//punto de confirmacion para hacer
durabilidad


begin;

transaccion 4;

select count(*) form cliente;


--->escritura

insert into cliente (idCliente, nombre,
apPaterno, apMaterno)
values (162, "ERIKA", "HERNANDEZ", "RUBIO");

--->lectura

select * from cliente 
where nombre like "Eri%" and 
apPaterno like "Hern%";


--->punto de confirmacion
commit;

--cierras terminal 
habres y checas que excista la 162


select * from cliente 
where nombre like "Eri%" and 
apPaterno like "Hern%";


transaccion 5;


begin;

--en la terminal NEGRA

select * from cliente where
idCliente between 158 and 165;

--sin utilizar transaccion enla terminal ROJA
select * from cliente where
idCliente between 158 and 165;

--pasamos a la NEGRA

--escritura

insert into cliente (idCliente, nombre,
apPaterno, apMaterno)
values (163, "DAVID", "ORTEGA", "PACHECO");

--lectura
select * from cliente where
idCliente between 158 and 165;

--si lo pones en la roja
select * from cliente where
idCliente between 158 and 165;
 --no aparece el ultimo registro
 -- debemos de omitir un COMMIT;

--para que aparezca en la roja debemos de ommitir un 
--commit en la NEGRA para que aparezca en la roja

commit;

--nuevamente nos vamos a la ROJA 
--y hacemos la consulta
select * from cliente where
idCliente between 158 and 165;


--lectura
select * from cliente 
where nombre like "Eri%" and 
apPaterno like "Hern%";




--BLOQUEOS (lectura, escritura)

bl(cliente)
l(cliente)
l(pago)
l(tienda)
l(redito)

--bammos a bloquear cliete en modo lectura
lock tabnles cliente read;

select * from cliente where
idCliente between 158 and 165;
-- no lo puedes ver para nada
select * from tienda;
select * from pago;
select * from credito;


--si abres otra ventana y seleccionas;
--si se va a poder hacer las consultas

select * from tienda;
select * from pago;
select * from credito;


--NEGRA
--vamos desbloquear

unlock table;

--hacemos las mismas consultas de lectura anteriores;

select * from tienda;
select * from pago;
select * from credito;


usemos la T3, T4;

bE(cliete)
lock tables cliente write;
l(cliente)
e(cliente)
l(pago)
l(tienda)
l(redito)


--consultemos 

select * from cliente where
idCliente between 158 and 165;


--escritura
insert into cliente (idCliente, nombre,
apPaterno, apMaterno)
values (164, "JORGE", "MALDONADO", "CARPIO");

--checamos que este ahi con la lectura

select * from cliente where
idCliente between 158 and 165;

--ojo no se va a poder porque esta bloqueada
select * from tienda;
select * from pago;
select * from credito;


-- nos vamos a la verde para saber si se puede
-- si se ven porque es un bloqueo compartido
select * from tienda;
select * from pago;
select * from credito;


--si nos vamos a la VERDE
select * from cliente where
idCliente between 158 and 165;
--no se va a poder se queda bloqueada hasta que apliquemos un UNLOCK TABLE;



