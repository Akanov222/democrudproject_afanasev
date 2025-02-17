CREATE TABLE users (

    id bigint not null GENERATED ALWAYS AS IDENTITY,
    name varchar,
    email varchar,
    birth date,
    age int,
    PRIMARY KEY(id)
);

