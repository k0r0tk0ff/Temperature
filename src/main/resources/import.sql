insert into countries(country_id, name) values (1, 'ru');
--insert into countries(country_id, name) values (2, 'en');
--insert into countries(country_id, name) values (3, 'fr');
--insert into countries(country_id, name) values (4, 'sp');

insert into cities(city_id, country_id, name) values (1, 1, 'Moscow');
insert into cities(city_id, country_id, name) values (2, 1, 'StPeterburg');
insert into cities(city_id, country_id, name) values (3, 1, 'Saratov');
--insert into cities(city_id, country_id, name) values (4, 1, 'Madrid');

insert into temperatures(temperature_id, date, temperature_value, city_id) values (1, '2018-08-15', '22.5', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (2, '2018-08-16', '23.5', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (3, '2018-08-17', '20.0', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (4, '2018-08-18', '22.0', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (5, '2018-08-19', '21.5', 1);

insert into temperatures(temperature_id, date, temperature_value, city_id) values (6, '2018-08-15', '21', 2);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (7, '2018-08-16', '22', 2);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (8, '2018-08-17', '23', 2);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (9, '2018-08-18', '24', 2);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (10, '2018-08-19', '26', 2);

insert into temperatures(temperature_id, date, temperature_value, city_id) values (11, '2018-08-15', '28', 3);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (12, '2018-08-16', '24', 3);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (13, '2018-08-17', '28', 3);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (14, '2018-08-18', '24', 3);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (15, '2018-08-19', '28', 3);

