#!/bin/bash

psql -f /docker-entrypoint-initdb.d/db/db.sql
psql -d sc_auth -f /docker-entrypoint-initdb.d/ddl/oauth2_ddl.sql
psql -d sc_auth -f /docker-entrypoint-initdb.d/ddl/users_ddl.sql
psql -d sc_auth -f /docker-entrypoint-initdb.d/dml/oauth2_dml.sql
psql -d sc_auth -f /docker-entrypoint-initdb.d/dml/users_dml.sql
