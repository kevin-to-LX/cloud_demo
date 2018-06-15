CREATE TABLE public.properties
(
    id INT PRIMARY KEY NOT NULL,
    key VARCHAR(100) NOT NULL,
    value VARCHAR(100) NOT NULL,
    application VARCHAR(100) NOT NULL,
    profile VARCHAR(100) NOT NULL,
    label VARCHAR(100) NOT NULL

);