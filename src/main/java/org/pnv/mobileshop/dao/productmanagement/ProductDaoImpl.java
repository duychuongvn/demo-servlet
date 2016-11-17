package org.pnv.mobileshop.dao.productmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.pnv.mobileshop.core.exception.TenchicalException;
import org.pnv.mobileshop.dao.BaseDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huynhduychuong on Nov 13, 2016.
 *
 */
public class ProductDaoImpl extends BaseDaoImpl<Product, Integer> implements ProductDao {

    private Logger logger = LoggerFactory.getLogger(ProductDaoImpl.class);
    /* (non-Javadoc)
     * @see org.pnv.mobileshop.dao.devicemanagement.ProductDao#findAll()
     */
    public List<Product> findAll() {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
             connection = getConnection();
             String sql = "SELECT * FROM product";
//             statement = connection.prepareStatement(sql);
            
//            ResultSet resultSet =  statement.executeQuery();
            // Convert resultset to List of Product
        } catch (SQLException e) {
            logger.error("Cannot connect to database " + e.getMessage(), e);
            throw new TenchicalException(e);
        }finally {
            close(statement);
            close(connection);
        }
        //TODO
        return null;
    }

}
