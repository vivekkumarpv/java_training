create database ms_bus_info;
use ms_bus_info;
show tables;
desc bus;
desc bus_runs_on_week_days;
desc hibernate_sequence;
select * from bus;
select * from bus_runs_on_week_days;
select distinct destination from bus where destination like 'k%' ;
select * from ticket