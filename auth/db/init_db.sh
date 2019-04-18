#!/bin/bash

psql -f db/db.sql
psql -f ddl/oauth2_ddl.sql
psql -f ddl/users_ddl.sql
psql -f dml/oauth2_dml.sql
psql -f dml/users_dml.sql
