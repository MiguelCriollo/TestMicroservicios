CREATE TABLE IF NOT EXISTS "grades"(
    id SERIAL PRIMARY KEY,
    grade INTEGER,
    comment TEXT,
    student_id SERIAL,
    FOREIGN KEY (student_id) REFERENCES "student"(id)

);
INSERT INTO "grades" (grade, comment, student_id)
VALUES
    (10, 'NO',  1),
    (9, 'NO', 1),
    (10, 'NO',  1),
    (9, 'NO', 2),
    (10, 'NO',  2),
    (9, 'NO', 2),
    (9, 'NO',  3);