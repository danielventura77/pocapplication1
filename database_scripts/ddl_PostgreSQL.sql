CREATE SEQUENCE public.contato_codigo_seq;

CREATE TABLE public.contato
(
  codigo integer NOT NULL DEFAULT nextval('contato_codigo_seq'),
  fk_cod_operadora bigint,
  data timestamp without time zone,
  nome character varying(255),
  telefone character varying(255),
  CONSTRAINT contato_pkey PRIMARY KEY (codigo)
  
)
WITH (
  OIDS=FALSE
);

CREATE SEQUENCE public.operadora_codigo_seq;

CREATE TABLE public.operadora
(
  codigo integer NOT NULL DEFAULT nextval('operadora_codigo_seq'),
  nome character varying(255),
  categoria character varying(255),
  preco numeric(5,2),
  CONSTRAINT operadora_pkey PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.operadora
  OWNER TO urvdbtkeygydob;



