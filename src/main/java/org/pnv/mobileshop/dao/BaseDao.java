package org.pnv.mobileshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.pnv.mobileshop.core.configuration.DatabaseConfiguration;
import org.pnv.mobileshop.core.exception.TenchicalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huynhduychuong on Nov 13, 2016.
 *
 */
public class BaseDao {

    private Logger logger = LoggerFactory.getLogger(BaseDao.class);

    protected Connection getConnection() throws SQLException {
        DatabaseConfiguration dbConfig = DatabaseConfiguration.getInstance();
        try {
            Class.forName(dbConfig.getDriverName());
        } catch (ClassNotFoundException e) {
            throw new TenchicalException(e);
        }
        return DriverManager.getConnection(dbConfig.getConnectionUrl(), dbConfig.getUsername(), dbConfig.getPassword());
    }

    protected void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                logger.error("Cannot close database connection", e);
            }
        }
    }

    protected void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                logger.error("Cannot close database statement", e);
            }
        }
    }
}
