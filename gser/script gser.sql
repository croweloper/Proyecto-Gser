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

end&&
delimiter ;

call sp_RegistrarUsuario( 'Deivi', 'Herrera', 'obesotelees456',1, '72696054', '931702058', '123456')



