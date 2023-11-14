/* 
INSERT INTO clientes (rut, nombre) VALUES ('clienteRut', 'clienteNombre');
INSERT INTO cuentas (nombre_banco, cliente_id) VALUES ('cuentaNombreBanco', 'clienteId');
INSERT INTO productos (nombre) VALUES ('productoNombre');
INSERT INTO pacs (cliente_id, producto_id, fecha, monto) VALUES ('clienteId', 'productoId', 'pacFecha', 'pacMonto'); 
*/

-- CREATE TABLE IF NOT EXISTS clientes (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     rut VARCHAR(255),
--     nombre VARCHAR(255)
-- );

-- CREATE TABLE IF NOT EXISTS cuentas (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     nombre_banco VARCHAR(255),
--     cliente_id BIGINT,
--     FOREIGN KEY (cliente_id) REFERENCES clientes(id)
-- );

-- CREATE TABLE IF NOT EXISTS productos (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     nombre VARCHAR(255)
-- );

-- CREATE TABLE IF NOT EXISTS pacs (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     cliente_id BIGINT,
--     producto_id BIGINT,
--     fecha DATETIME,
--     monto DOUBLE,
--     FOREIGN KEY (cliente_id) REFERENCES clientes(id),
--     FOREIGN KEY (producto_id) REFERENCES productos(id)
-- );

INSERT INTO clientes (rut, nombre) VALUES ('11.111.111-1', 'Elza pallo');
INSERT INTO cuentas (nombre_banco, cliente_id) VALUES ('Banchile', 1);
INSERT INTO productos (nombre) VALUES ('APV');
INSERT INTO pacs (cliente_id, producto_id, fecha, monto) VALUES (1, 1, '2023-11-14', 1000.0);
