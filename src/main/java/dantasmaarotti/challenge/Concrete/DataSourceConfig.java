package dantasmaarotti.challenge.Concrete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

//@Configuration
//public class DataSourceConfig {

//    @Bean
//    public DataSource dataSource(){
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL)
//                .addScript("db/hsqldb/db.sql")
//                .build();
//        return db;
//    }

//}
