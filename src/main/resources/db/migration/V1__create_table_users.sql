create table users(
    id serial primary key,
    name varchar(255) not null,
    email varchar(255) not null,
    password varchar(18) not null,
    role varchar(255) not null,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp
)