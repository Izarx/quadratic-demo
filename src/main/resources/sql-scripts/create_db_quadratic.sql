create database if not exists `quadratic`;
use `quadratic`;

drop table if exists `quadratic`;

create table `quadratic`(
`id` int(11) not null auto_increment,
`a` int(11) default null,
`b` int(11) default null,
`c` int(11) default null,
`x1` double precision(100, 10) default null,
`x2` double precision(100, 10) default null,
primary key (`id`)
)
engine=InnoDB auto_increment=1 default charset=latin1;
