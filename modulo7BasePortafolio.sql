USE portafolio;

-- Tabla "Usuarios"
CREATE TABLE Usuarios (
  id int PRIMARY KEY AUTO_INCREMENT,
  run int,
  nombre VARCHAR(100) NOT NULL,
  apellido VARCHAR(100) NOT NULL,
  tipo ENUM('Vendedor', 'Supervisor', 'Administrativo') NOT NULL
);

CREATE TABLE Vendedores (  
  idVendedor Int PRIMARY KEY AUTO_INCREMENT, 
  idRuta VARCHAR(100) NOT NULL,
  nombreVendedor VARCHAR(100) NOT NULL,
  correoVendedor VARCHAR(100) NOT NULL,
  fechaIngreso VARCHAR(100) NOT NULL,
  id_usuario int,
  FOREIGN KEY (id_usuario) REFERENCES Usuarios(id)
);

CREATE TABLE Supervisores (
  idSupervisor int PRIMARY KEY AUTO_INCREMENT,
  nombreSupervisor VARCHAR(100) NOT NULL,
  correoSupervisor VARCHAR(100) NOT NULL,
  id_usuario INT,
  FOREIGN KEY (id_usuario) REFERENCES Usuarios(id)
);

CREATE TABLE Administrativos (
  idAdministrativo INT PRIMARY KEY AUTO_INCREMENT,
  area VARCHAR(100) NOT NULL,
  correoAdmin VARCHAR(100) NOT NULL,
  id_usuario INT,
  FOREIGN KEY (id_usuario) REFERENCES Usuarios(id)
);

 
CREATE TABLE Contacto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    comentario VARCHAR (50) NOT NULL
);

CREATE USER 'portafolio'@'localhost' IDENTIFIED BY 'Aria180317.,';
GRANT ALL PRIVILEGES ON portafolio. * TO 'portafolio'@'localhost';
SELECT User FROM mysql.user;


