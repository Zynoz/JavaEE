create table students
(
    id                   serial8      not null,
    version              int               default 0 not null,
    first_name           varchar(64)  not null,
    last_name            varchar(64)  not null,
    contact_email        varchar(100) null,
    contact_phone        varchar(20)  null,
    birth_date           date         not null,
    parent_first_name    varchar(64)  null,
    parent_last_name     varchar(64)  null,
    parent_contact_email varchar(100) null,
    parent_contact_phone varchar(20)  null,
    created_             timestamp    null default now(),
    constraint students_pk
        primary key (id)
);
