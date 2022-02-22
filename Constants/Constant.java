package Constants;

import java.time.Duration;

// Class of constants: values of testing product which will never change
public class Constant {

    // Class for expectations time limit
    public static class Timeouts{

        // Constants for expectations time limit
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 10;
    }

    // Class of URLs addresses
    public static class Urls{

        // URLs for the Home page
        public static class Home{

            // Main page URL
            public static final String TOUCH_HOME_PAGE = "https://touch.com.ua/";

        }

        // URLs for the Catalog page
        public static class Catalog {

            // Whole Catalog page URL
            public static final String TOUCH_CATALOG_PAGE = "https://touch.com.ua/catalog/";

            // Apple production page URL
            public static final String TOUCH_APPLE_HOME_PAGE = "https://touch.com.ua/tekhnika-apple/";

            // Xiaomi production page URL
            public static final String TOUCH_XIAOMI_HOME_PAGE = "https://touch.com.ua/tekhnika-xiaomi/";
        }
    }

    // Class of constant values
    public static class Values{

        // Class of values on Catalog page
        public static class Catalog{

            // Number of rows in Catalog list
            public static final int NUMBER_OF_BUTTONS = 16;
        }

    }
}
