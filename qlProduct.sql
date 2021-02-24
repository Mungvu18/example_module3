create database qlProduct;
use qlProduct;
drop table if EXISTS `category`;
create table `category`(
                           id int(11) not null ,
                           name varchar(100) primary key
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into category values (1,'Tv');
insert into category values (2,'Phone');
insert into category values (3,'Computer');
insert into category values (4,'Fridge');

drop table if exists `product`;

create table product(
                        id int auto_increment primary key ,
                        name nvarchar(100) not null,
                        price double not null,
                        amount int(10) not null,
                        color nvarchar(25) not null ,
                        description varchar(500) not null,
                        category_name varchar(100) not null,
                        constraint `product_ibfk_1` foreign key (category_name) references category(name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `product` VALUES (1,'Iphone 11','11000000',20,'Red, Grey','Rất đẹp','Phone'),
                             (2,'Iphone 8 plus','8000000',12,'Green, Blue','Rất đẹp','Phone'),
                             (3,'Samsung Galaxy','15000000',2,'White','Rất đẹp','Phone'),
                             (4,'LG 42 inch','40000000',18,'Black','Rất tốt','TV'),
                             (5,'Asus Tuf 505 Gaming','25000000',5,'Black','Rất dễ dùng','Computer'),
                             (6,'Samsung G20','10000000',12,'Blue','Rất sang','Phone');
