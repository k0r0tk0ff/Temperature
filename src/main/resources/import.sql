insert into countries(country_id, name) values (1, 'ru');
insert into countries(country_id, name) values (2, 'en');
insert into countries(country_id, name) values (3, 'fr');
insert into countries(country_id, name) values (4, 'sp');

insert into cities(city_id, country_id, name) values (1, 1, 'Moscow');
insert into cities(city_id, country_id, name) values (2, 1, 'StPeterburg');
insert into cities(city_id, country_id, name) values (3, 1, 'Saratov');

insert into temperatures(temperature_id, date, temperature_value, city_id) values (1, '2018-01-01', '22.5', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (2, '2018-01-02', '23.5', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (3, '2018-01-03', '20.0', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (4, '2018-01-04', '22.0', 1);
insert into temperatures(temperature_id, date, temperature_value, city_id) values (5, '2018-01-05', '21.5', 1);