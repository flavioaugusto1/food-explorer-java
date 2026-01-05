create table meals(
    id serial primary key,
    name varchar(255) not null,
    description varchar(255),
    image text,
    price decimal not null,
    category_id integer not null,
    constraint fk_meal_category foreign key (category_id) references category(id)
)