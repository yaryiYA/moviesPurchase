

-- INSERT INTO director (id, first_name, last_name, position)
-- VALUES ('23afe3a9-6d41-431a-94d5-a42830ac96d4', 'test-dir', 'test-dir', 'dir');
--
-- INSERT INTO film (id, title, country)
-- VALUES ('ed303866-759f-482b-b779-8d5c81f8681a', 'Avatar', 'Usa');
--
-- INSERT INTO role (id, title)
-- VALUES ('6d9f7853-26d9-42d4-b6e0-d579ec7d82c6', 'ADMIN');
-- --
-- INSERT INTO users (id, first_name, login, password, last_name, role_id)
-- VALUES ('71902b25-6c1c-42db-8419-767222a5e1be', 'ivan', 'ivanov', 'admin', 'password', '6d9f7853-26d9-42d4-b6e0-d579ec7d82c6');

--
-- INSERT INTO orders (id, user_id, film_id, price)
-- VALUES ('71902b25-6c1c-42db-8419-767222a5e1be', '71902b25-6c1c-42db-8419-767222a5e1be',
--         'ed303866-759f-482b-b779-8d5c81f8681a', 1000);
-- INSERT INTO director_films (director_id, films_id)
-- VALUES ('23afe3a9-6d41-431a-94d5-a42830ac96d4', 'ed303866-759f-482b-b779-8d5c81f8681a');