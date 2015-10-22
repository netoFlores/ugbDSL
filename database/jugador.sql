

CREATE DATABASE  IF NOT EXISTS basketball;

use basketball;


CREATE TABLE IF NOT EXISTS equipo(
	id_equipo int primary key auto_increment not null,
	nombre varchar(50) not null,
	fecha_in TIMESTAMP not null DEFAULT 0,
	fecha_mod TIMESTAMP not null DEFAULT now() ON UPDATE now()
);

CREATE TABLE IF NOT EXISTS jugador(
	id_jugador int primary key auto_increment not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	fecha date not null,
	equipo int,
	posicion varchar(50),
	fecha_in TIMESTAMP not null DEFAULT 0,
	fecha_mod TIMESTAMP not null DEFAULT now() ON UPDATE now()
);

ALTER TABLE jugador ADD CONSTRAINT jugadorXEquipo FOREIGN key (equipo) REFERENCES equipo(id_equipo);

CREATE TABLE IF NOT EXISTS partido(
	id_partido int primary key auto_increment not null,
	equipoA int not null,
	equipoB int not null,
	puntoA int DEFAULT 0,
	puntoB int DEFAULT 0,
	fecha_in TIMESTAMP not null DEFAULT 0,
	fecha_mod TIMESTAMP not null DEFAULT now() ON UPDATE now()
);


CREATE TABLE IF NOT EXISTS usuario(
	id_usuario int primary key auto_increment not null,
	username varchar(30) unique not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	fecha_nac date not null,
	email varchar(200) unique not null,
	clave varchar(50) not null,
	telefono varchar(9),
	pais varchar(50),
	fecha_in timestamp not null DEFAULT 0,
	fecha_mod timestamp not null DEFAULT now() ON UPDATE now()
);

ALTER TABLE	partido ADD CONSTRAINT partidoXEquipo FOREIGN kEY (equipoA) REFERENCES  equipo(id_equipo);
ALTER TABLE	partido ADD CONSTRAINT partidoXEquipo2 FOREIGN kEY (equipoB) REFERENCES  equipo(id_equipo);



#Agregamos un usuario para que utilice esa tabla.
GRANT ALL PRIVILEGES ON basketball.* to 'own_basketball'@'localhost' IDENTIFIED BY 'welcome1';
