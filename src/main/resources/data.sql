/* 
INSERT INTO clientes (rut, nombre) VALUES ('clienteRut', 'clienteNombre');
INSERT INTO cuentas (nombre_banco, cliente_id) VALUES ('cuentaNombreBanco', 'clienteId');
INSERT INTO productos (nombre) VALUES ('productoNombre');
INSERT INTO pacs (cliente_id, producto_id, fecha, monto) VALUES ('clienteId', 'productoId', 'pacFecha', 'pacMonto'); 
*/

INSERT INTO clientes (rut, nombre) VALUES ('11.111.111-1', 'Elza pallo');
INSERT INTO cuentas (nombre_banco, cliente_id) VALUES ('Banchile', 1);
INSERT INTO productos (nombre) VALUES ('APV');
INSERT INTO pacs (cliente_id, producto_id, fecha, monto) VALUES (1, 1, '2023-11-14', 1000.0);
