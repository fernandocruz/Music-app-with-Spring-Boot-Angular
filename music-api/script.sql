-- Database: "musicDB"

-- DROP DATABASE "musicDB";

CREATE DATABASE "musicDB"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;



-- Table: music

-- DROP TABLE music;

CREATE TABLE music
(
  id bigserial NOT NULL,
  name character varying(50), -- music's name
  group_name character varying(50), -- The group that plays the song
  duration character varying(10), -- Duration of the song.
  CONSTRAINT pk_music PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE music
  OWNER TO postgres;
COMMENT ON COLUMN music.name IS 'music''s name';
COMMENT ON COLUMN music.group_name IS 'The group that plays the song';
COMMENT ON COLUMN music.duration IS 'Duration of the song.';

