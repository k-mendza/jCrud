CREATE TABLE public.language
(
    id bigserial NOT NULL,
    cd "char" NOT NULL,
    description character varying(50),
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.language
    OWNER to postgres;

