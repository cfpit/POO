-- selecciono la base por defecto
use pubs;

-- veo las tablas de la base
show tables;

-- listar todos los campos de la tabla titles
select * from titles;

-- listar titulo, categoria y precio de los libros
select 	title as libro,  
		type categoria,
        price precio
from 	titles;

-- listar los libros que cuesten mas de 20 U$s
select 	*
from	titles
where	price > 20;

-- listar los autores q vivan en California y no tengan
-- contrato con ninguna editorial
select	concat(au_fname,' ',au_lname) as autor,
		state estado,
        contract contrato
from	authors
where	state = 'CA' and contract = 0;

-- listar autores de California, Michigan o Kansas
select 	* 
from 	authors
-- where	state in ('CA','MI','KS');
-- where	not state in ('CA','MI','KS');
where	state not in ('CA','MI','KS');

-- listar las ventas del año 1990
select 	* 
from 	sales
-- where	ord_date between '1990-01-01' and '1990-12-31';
where	year(ord_date) = 1990;

-- listar los empleados cuyo apellido empiece con M
select	*
from	employee
where	lname like 'm%';

-- listar los empleados cuyo apellido termine con z
select	*
from	employee
where	lname like '%z';

-- listar los empleados cuyo nombre empiece con m, el 2do caracter 
-- sea cualquiera, el 3er caracter sea r y continue de cualquier forma
-- 	Maria, Marcelo, Martin, Mercedes, Moria, Mirtha, Marcos, Mirko 
select	*
from	employee
where	fname like 'm_r%';

-- listar los empleados ordenados alfabeticamente por apellido y nombre
select		*
from		employee
order by	lname, fname;

-- listar el apellido, horas que trabaja x mes y fecha de ingreso
-- en el trabajo de los empleados, ordenados por cantidad de horas
-- en forma descendente y por fecha de ingreso.
select		lname apellido,
			job_lvl as 'trabajo mensual',
			hire_date 'fecha de ingreso'
from		employee
order by	2 desc, 3;

-- Funciones de Agrupacion
-- listar el titulo mas caro, el mas barato, el promedio de precios,
-- la cantidad de titulos y el total de precios de todos los titulos
select	max(price) 'titulo mas caro',
		min(price) 'titulo mas barato',
		avg(price) promedio,
		count(title_id) cantidad,
		sum(price) total
from	titles;

-- Agrupaciones
-- listar la cantidad y el titulo mas caro de cada categoria de titulo.
-- No incluir aquellas categorias sin nombre. Incluir solo aquellas 
-- categorias cuya cantidad de titulos perteneciente sea mayor a 2.
-- Mostrar los 3 primeros registros
select		type as categoria,
			count(title_id) cantidad,
			max(price) 'titulo mas caro'
from		titles
where		type != ''
group by	type
having		count(title_id) > 2
order by	2 desc
limit		3;
-- Cuando mezclo campos con funciones de agrupacion en la columnas de un SELECT, 
-- DEBO agrupar por los campos
-- where filtra registros condicionando campos
-- having filtra registros de una agrupacion, condicionando funciones agrupadas








