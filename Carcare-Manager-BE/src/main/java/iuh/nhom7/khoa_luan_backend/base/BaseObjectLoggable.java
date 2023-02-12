package iuh.nhom7.khoa_luan_backend.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseObjectLoggable {
    protected final transient Logger logger = LogManager.getLogger(this.getClass());
    protected Logger getLogger() {
        return this.logger;
    }
}
