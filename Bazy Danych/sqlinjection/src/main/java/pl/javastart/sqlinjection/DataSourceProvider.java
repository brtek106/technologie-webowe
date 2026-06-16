package pl.javastart.sqlinjection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

class DataSourceProvider {
    private static DataSource dataSource;

    private DataSourceProvider() {}

    static DataSource getDataSource() throws NamingException {
        if (dataSource == null) {
            InitialContext initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/secret");
        }
        return dataSource;
    }
}
