-- Consultas Relacionadas
use pubs;

-- listar el titulo, precio, categoria y nombre de la
-- editorial que publico los libros durante el año 1990
select		t.title titulo,
			t.type categoria,
			t.price precio,
			p.pub_name editorial
from		titles as t
inner join	publishers p
on			p.pub_id = t.pub_id
where		year(t.pubdate) = 1990;

-- listar los libros que no fueron vendidos
-- tabla ppal: titles
-- tabla secundaria: sales
select	t.title libro
		-- ,s.*
from	sales s	right join titles t
on		s.title_id = t.title_id
where	s.stor_id is null;






