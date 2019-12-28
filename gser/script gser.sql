-- Procedures

use gser_db;

select * from usuario;

-- sp_UsuarioLogin(?,?);

drop procedure if exists sp_UsuarioLogin;

delimiter &&
create procedure sp_UsuarioLogin(in mail text,in pass text)
begin
select * from usuario where usu_mail = mail and usu_pass = pass;
end&&
delimiter ;

call sp_UsuarioLogin('croweloper@gmail.com','123456');
call sp_UsuarioLogin('admin','123456');


INSERT INTO `gser_db`.`usuario` (`usu_nom`, `usu_ape`, `usu_mail`,  `usu_tdoc`, `usu_ndoc`, `usu_movil`, `usu_pass`,`usu_fecreg`) 
VALUES ( 'Deivi', 'Herrera', 'obesotelees123',1, '72696054', '931702058', '123456',now());

-- sp_RegistrarUsuario(?,?,?,?,?,?);


drop procedure if exists sp_RegistrarUsuario;

delimiter &&
create procedure sp_RegistrarUsuario(in usunom text,in usuape text,in mail text,in tipodoc int,in doc varchar(11),in usumovil varchar(9),in pass text)
begin

INSERT INTO `gser_db`.`usuario` (`usu_nom`, `usu_ape`, `usu_mail`,  `usu_tdoc`, `usu_ndoc`, `usu_movil`, `usu_pass`,`usu_fecreg`) 
VALUES ( usunom, usuape, mail,tipodoc, doc, usumovil, pass,now());

SELECT * FROM usuario WHERE usu_cod = (SELECT MAX(usu_cod) from usuario);
end&&
delimiter ;

call sp_RegistrarUsuario( 'Deivi', 'Herrera', 'obesotelees456',1, '42424362', '931702058', '123456');

-- 
-- Servicios 
--

select * from servicio;

call sp_ListarServiciosUsuario(?);

call sp_ListarServiciosCategoria(?);

call sp_ListarServicios(?);


-- sp_RegistrarServicio(?,?,?,?,?,?,?,?);


drop procedure if exists sp_RegistrarServicio;

delimiter &&
create procedure sp_RegistrarServicio(in codusu bigint,in catsercod int,in incluye text,in noincluye text,in servadicionales text,in preciominimo decimal(5,2),in foto text,in etiquetas text)
begin

INSERT INTO servicio (ser_codusu, ser_catsercod, ser_incluye, ser_noincluye, ser_servadicionales, serv_preciominimo, ser_foto, ser_etiquetas, ser_fecreg, ser_fecmod, ser_estado) 
VALUES ( codusu, catsercod, incluye, noincluye, servadicionales, preciominimo, foto, etiquetas, now(), null, 1);

SELECT * FROM servicio WHERE ser_cod = (SELECT MAX(ser_cod) from servicio);

end&&
delimiter ;

call sp_RegistrarServicio( 2, 1, 'Clases con Napa', 'no incluye lo que no incluye ps', 'nada adicional', 50.0, null, 'educacion,napa,pelao');
call sp_RegistrarServicio( 3, 1, 'Clases con Ñol', null, null, 50.0, null, null);
call sp_RegistrarServicio( 4, 1, 'Clases con el Cansiller Palpatin', null, null, 50.0, null, null);

select * from servicio;
	
