CREATE TABLE director
(
    id         UUID NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    position   VARCHAR(255),
    CONSTRAINT pk_director PRIMARY KEY (id)
);

CREATE TABLE film
(
    id      UUID NOT NULL,
    title   VARCHAR(255),
    country VARCHAR(255),
    CONSTRAINT pk_film PRIMARY KEY (id)
);

CREATE TABLE film_directors
(
    directors_id UUID NOT NULL,
    film_id      UUID NOT NULL,
    CONSTRAINT pk_film_directors PRIMARY KEY (directors_id, film_id)
);

CREATE TABLE "order"
(
    id      UUID NOT NULL,
    user_id UUID,
    price   DECIMAL(19, 2),
    CONSTRAINT pk_order PRIMARY KEY (id)
);

CREATE TABLE order_films
(
    films_id UUID NOT NULL,
    order_id UUID NOT NULL,
    CONSTRAINT pk_order_films PRIMARY KEY (films_id, order_id)
);

CREATE TABLE role
(
    id    UUID NOT NULL,
    title VARCHAR(255),
    CONSTRAINT pk_role PRIMARY KEY (id)
);

CREATE TABLE users
(
    id         UUID         NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255),
    role_id    UUID,
    login      VARCHAR(255) NOT NULL,
    password   VARCHAR(255) NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE "order"
    ADD CONSTRAINT FK_ORDER_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE users
    ADD CONSTRAINT FK_USERS_ON_ROLE FOREIGN KEY (role_id) REFERENCES role (id);

ALTER TABLE film_directors
    ADD CONSTRAINT fk_fildir_on_director FOREIGN KEY (directors_id) REFERENCES director (id);

ALTER TABLE film_directors
    ADD CONSTRAINT fk_fildir_on_film FOREIGN KEY (film_id) REFERENCES film (id);

ALTER TABLE order_films
    ADD CONSTRAINT fk_ordfil_on_film FOREIGN KEY (films_id) REFERENCES film (id);

ALTER TABLE order_films
    ADD CONSTRAINT fk_ordfil_on_order FOREIGN KEY (order_id) REFERENCES "order" (id);