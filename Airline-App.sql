create database airlines_db;
use airlines_db;
show tables;
select * from airline;
select * from airport;

ALTER TABLE airport MODIFY COLUMN state VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
ALTER TABLE airport CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
select count(id) from airport;
select count(id) from airline;
select count(id) from airline_route;
select * from airline_route;

SELECT * FROM airline_route
WHERE iata_from = 'DXB' and iata_to='CMB';

SELECT DISTINCT air_line_iata, (max_duration + min_duration) / 2 AS avgDuration
FROM airline_route 
WHERE iata_from = 'DXB' AND iata_to = 'CMB'
ORDER BY avgDuration ASC;






