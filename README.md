# JPAMavenExample

This is a starter project that uses Maven, EclipseLink JPA, and PostgreSQL.

## Building

1. mvn clean install
2. mvn eclipse:eclipse

## Adding PostgreSQL connection info

In persistence.xml, change:

1. YOUR\_USERNAME to your postgres username
2. YOUR\_PASSWORD to your postgres password
3. YOUR\_DB to your database name

Note: the given javax.persistence.jdbc.url assumes you're running postgres locally with the default port.

## Running

1. Import project into Eclipse
2. Run in Eclipse
