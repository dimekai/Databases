1. Cargar el Script de tt.sql

Al utilizar el wincard
like "HER_jasjknsjkas" con el "_" ignoras un caracter

1. Mostrar el no de tt, de aquellos tts que 
fueron dirigidos por el profesor Andres Ortigoza
	
	SELECT t.*
	FROM tt t, profesor p, dirige d
	WHERE t.nott = d.nott
	AND d.idprof = p.idprof
	AND p.nombre like "Andr_%"
	AND p.apPaterno like "Orti%"
	ORDER BY t.nott;

2. Mostrar toda la informacion de aquellos tts que 
tienen en su titulo "redes neuronales"

	SELECT * from tt
	WHERE titulo like "%redes neuronales%"
	ORDER BY nott;
	
3. Mostrar el dictamen y la calificacion de los sinodales
de aquellos tts que ha dirigido la profresora Fabiola Ocampo

	SELECT t.nott, p.califSinodales, p.dictamen
	FROM tt t, presentacion p, dirige d, profesor x
	WHERE p.nott = t.nott
	AND t.nott = d.nott
	AND d.idprof = x.idprof
	AND x.nombre = "Fabiola"
	AND x.apPaterno = "Ocampo"
	ORDER BY 3;
	
4. Mostrar el no de tt, de aquellos profesores
que se apellidan Martinez. Incluir el nombre completo del profesor

SELECT t.nott, p.*
FROM tt t, dirige d, profesor p
WHERE t.nott = d.nott
AND d.idprof = p.idprof
AND (p.apPaterno like "Mart_ne%"
OR p.apMaterno like "Mat_ne%")
ORDER BY p.apPaterno;

5. Mostrar el grado de estudios que tienen los profesores
que se apellidan Maldonado.
	
	SELECT p.*, ge.descripcion
	FROM profesor p, gradoestudios ge, gradoprof x
	WHERE p.idprof = x.idprof
	AND x.idgrado = ge.idgrado
	AND (p.apPaterno like "Maldona%"
	OR p.apMaterno like "Maldona%")
	ORDER BY 2;
	
6. Cuales son los tts que han reprobado, mostrar sus respectivos directores
	
	SELECT p.nott, p.dictamen, d.nombre, d.apPaterno, d.apMaterno
	FROM presentacion p, tt t, dirige x, profesor d
	WHERE p.nott = t.nott
	AND t.nott = x.nott
	AND x.idprof = d.idprof
	AND p.dictamen like "reprob%"
	ORDER BY 4;
	
7. Que tts se han presentado en el año 2009, mostrar directores

	SELECT p.nott, d.nombre, d.apPaterno, d.apMaterno
	FROM presentacion p, tt t, dirige x, profesor d
	WHERE p.nott = t.nott
	AND t.nott = x.nott
	AND x.idprof = d.idprof
	AND p.fecha between "2009-01-01" AND "2009-12-31"
	ORDER BY 3;
	
8. Que sinodales tienen el tt 2010-0046
	
	SELECT p.*
	FROM profesor p, sinodalia s
	WHERE (s.s1 = p.idprof
	OR s.s2 = p.idprof
	OR s.s3 = p.idprof)
	AND s.nott = "2010-0046"
	ORDER BY p.apPaterno;
	
	como s1,s2 y s3 son FK, establecemos el hecho de filtrar
	para que el enlace se valido con respecto al idprof 
	
9. Cuantos tts ha dirigido EULER
	
	SELECT COUNT(*) FROM 
	profesor p, dirige d, tt t
	WHERE t.nott = d.nott
	AND d.idprof = p.idprof
	AND p.nombre = "EULER"
	AND p.apPaterno like "Hern_n%";
	
	NOMBRES DE TTS
	SELECT t.* FROM 
	profesor p, dirige d, tt t
	WHERE t.nott = d.nott
	AND d.idprof = p.idprof
	AND p.nombre = "EULER"
	AND p.apPaterno like "Hern_n%";
	
	QUIENES HAN SIDO LOS SINODALES DE LOS TTS
	SELECT p.nombre, p.apPaterno, p.apMaterno
	FROM profesor p, tt t, sinodalia s, dirige d
	WHERE t.nott = d.nott
	AND d.idprof = (SELECT idprof FROM profesor 
					WHERE nombre = "EULER" 
					AND apPaterno like "Hern_nde%")
	AND t.nott = s.nott
	AND (s.s1 = p.idprof
	OR s.s2 = p.idprof
	OR s.s3 = p.idprof);
	
10. 


	
	
	WHERE e.EMPNO = d.MGRNO
	
	AND d.deptno = e.workdept