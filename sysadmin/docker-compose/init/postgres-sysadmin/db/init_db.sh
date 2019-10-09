#!/bin/bash
psql -f /docker-entrypoint-initdb.d/db/db.sql
psql -d sc_sysadmin -f /docker-entrypoint-initdb.d/ddl/sysadmin_ddl.sql
psql -d sc_sysadmin -f /docker-entrypoint-initdb.d/ddl/sysadmin_dml.sql
