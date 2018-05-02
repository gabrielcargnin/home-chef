CREATE TABLE en_item_estoque
(
  quantidade      INTEGER NOT NULL,
  validade        DATE,
  id_ingrediente  INTEGER,
  id_item_estoque SERIAL  NOT NULL
    CONSTRAINT en_item_estoque_id_item_estoque_pk
    PRIMARY KEY,
  id_unidade      INTEGER NOT NULL
);

CREATE UNIQUE INDEX en_item_estoque_id_item_estoque_uindex
  ON en_item_estoque (id_item_estoque);

CREATE TABLE en_ingrediente
(
  id_ingrediente   SERIAL  NOT NULL
    CONSTRAINT en_ingrediente_pkey
    PRIMARY KEY,
  nome             TEXT    NOT NULL,
  preco            NUMERIC NOT NULL,
  id_unidade       INTEGER,
  quantidade_preco INTEGER,
  id_unidade_preco INTEGER
);

CREATE UNIQUE INDEX en_ingrediente_id_ingrediente_uindex
  ON en_ingrediente (id_ingrediente);

ALTER TABLE en_item_estoque
  ADD CONSTRAINT en_item_estoque_en_ingrediente_id_ingrediente_fk
FOREIGN KEY (id_ingrediente) REFERENCES en_ingrediente;

CREATE TABLE en_unidade
(
  id_unidade    SERIAL NOT NULL
    CONSTRAINT en_unidade_pkey
    PRIMARY KEY,
  nome_plural   TEXT   NOT NULL,
  nome_singular TEXT   NOT NULL,
  unidade       TEXT   NOT NULL
);

CREATE UNIQUE INDEX en_unidade_id_unidade_uindex
  ON en_unidade (id_unidade);

ALTER TABLE en_item_estoque
  ADD CONSTRAINT en_item_estoque_en_unidade_id_unidade_fk
FOREIGN KEY (id_unidade) REFERENCES en_unidade;

ALTER TABLE en_ingrediente
  ADD CONSTRAINT en_ingrediente_en_unidade_id_unidade_fk
FOREIGN KEY (id_unidade) REFERENCES en_unidade;

ALTER TABLE en_ingrediente
  ADD CONSTRAINT en_ingrediente_en_unidade_id_unidade_preco_fk
FOREIGN KEY (id_unidade_preco) REFERENCES en_unidade;

CREATE TABLE re_unidade_unidade
(
  id_unidade_origem  INTEGER NOT NULL
    CONSTRAINT re_unidade_unidade_en_unidade_id_unidade_fk
    REFERENCES en_unidade,
  id_unidade_destino INTEGER NOT NULL
    CONSTRAINT re_unidade_unidade_en_unidade_id_unidade_destino_fk
    REFERENCES en_unidade,
  multiplicador      NUMERIC NOT NULL,
  CONSTRAINT re_unidade_unidade_pkey
  PRIMARY KEY (id_unidade_origem, id_unidade_destino)
);

CREATE TABLE re_ingrediente_receita
(
  id_ingrediente_receita SERIAL  NOT NULL
    CONSTRAINT en_ingrediente_receita_pkey
    PRIMARY KEY,
  id_ingrediente         INTEGER NOT NULL
    CONSTRAINT en_ingrediente_receita_en_ingrediente_id_ingrediente_fk
    REFERENCES null (),
  id_receita             INTEGER NOT NULL,
  quantidade             NUMERIC NOT NULL
);

CREATE UNIQUE INDEX en_ingrediente_receita_id_ingrediente_receita_uindex
  ON re_ingrediente_receita (id_ingrediente_receita);

CREATE TABLE en_receita
(
  id_receita     SERIAL  NOT NULL
    CONSTRAINT en_receita_id_receita_pk
    PRIMARY KEY,
  id_dificuldade INTEGER NOT NULL
    CONSTRAINT en_receita_en_dificuldade_id_dificuldade_fk
    REFERENCES null (),
  modo_preparo   TEXT,
  nome           TEXT,
  tempo          INTEGER NOT NULL
);

CREATE UNIQUE INDEX en_receita_id_receita_uindex
  ON en_receita (id_receita);

ALTER TABLE re_ingrediente_receita
  ADD CONSTRAINT re_ingrediente_receita_en_receita_id_receita_fk
FOREIGN KEY (id_receita) REFERENCES en_receita;

CREATE TABLE en_dificuldade
(
  id_dificuldade SERIAL NOT NULL
    CONSTRAINT en_dificuldade_pkey
    PRIMARY KEY,
  nome           TEXT   NOT NULL
);

CREATE UNIQUE INDEX en_dificuldade_id_dificuldade_uindex
  ON en_dificuldade (id_dificuldade);

