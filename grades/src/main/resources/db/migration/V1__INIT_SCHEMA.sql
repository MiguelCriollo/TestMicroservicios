CREATE TABLE IF NOT EXISTS "student"(
    id SERIAL PRIMARY KEY,
    firstname VARCHAR,
    lastname VARCHAR,
    fullname VARCHAR,
    age INTEGER
);
INSERT INTO "student" (firstname, lastname, fullname, age)
VALUES
    ('Miguel', 'Criollo', 'Miguel Criollo', 21),
    ('Juanito', 'Alcachofa', 'Juanito Alcachofa', 20),
    ('Bichiyal', 'Medellin', 'Bichiyal Medellin', 666);