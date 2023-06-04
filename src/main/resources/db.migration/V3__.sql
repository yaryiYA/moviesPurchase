ALTER TABLE users
    ADD CONSTRAINT uc_users_login UNIQUE (login);

ALTER TABLE director
ALTER
COLUMN last_name TYPE VARCHAR(20) USING (last_name::VARCHAR(20));