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

            public static final String TOUCH_CATALOG_PAGE = "https://touch.com.ua/catalog/";
            public static final String TOUCH_APPLE_HOME_PAGE = "https://touch.com.ua/tekhnika-apple/";
            public static final String TOUCH_XIAOMI_HOME_PAGE = "https://touch.com.ua/tekhnika-xiaomi/";
            public static final String TOUCH_DGI_AND_GOPRO_HOME_PAGE = "https://touch.com.ua/tekhnika-dji-i-gopro/";
            public static final String TOUCH_SMARTPHONES_AND_TELEPHONES_HOME_PAGE = "https://touch.com.ua/smartfony-i-telefony/";
            public static final String TOUCH_TABS_AND_BOOKS_HOME_PAGE = "https://touch.com.ua/planshety-i-knigi/";
            public static final String TOUCH_GADGETS_AND_ELECTRICAL_TRANSPORT_HOME_PAGE = "https://touch.com.ua/gadzhety/";
            public static final String TOUCH_HEADPHONES_HOME_PAGE = "https://touch.com.ua/naushniki-i-akustika/";
            public static final String TOUCH_GADGETS_ACCESSORIES_HOME_PAGE = "https://touch.com.ua/aksessuary/";
            public static final String TOUCH_TV_AND_ACCESSORIES_HOME_PAGE = "https://touch.com.ua/televizory-i-aksessuary/";
            public static final String TOUCH_COMPUTER_TECHNIQUE_HOME_PAGE = "https://touch.com.ua/kompyuternaya-tekhnika/";
            public static final String TOUCH_PLAYSTATION_AND_GAMING_HOME_PAGE = "https://touch.com.ua/igrovaya-zona/";
            public static final String TOUCH_HOUSE_TECHNIQUE_HOME_PAGE = "https://touch.com.ua/tovary-dlya-doma/";
            public static final String TOUCH_BARBERSHOP_HOME_PAGE = "https://touch.com.ua/barbershop/";
            public static final String TOUCH_FASHION_AND_STYLE_HOME_PAGE = "https://touch.com.ua/moda-i-stil/";
            public static final String TOUCH_MARKDOWN_HOME_PAGE = "https://touch.com.ua/utsenka-i-b-u/";

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
