package tests.data_tables_test;

public class Values {
    public static final int TABLE1_ROWS_SIZE = 4;
    public static final int TABLE1_1ST_ROW_COLUMNS_SIZE = 6;
    public static final int TABLE1_THEAD_SIZE = 6;
    public static final String[] TABLE1_THEADS = new String[]{
            "Last Name", "First Name", "Email", "Due", "Web Site", "Action"};
    public static final String[][] TABLE1_TBODYS = new String[][]{
            {"Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com", "edit delete"},
            {"Bach", "Frank", "fbach@yahoo.com", "$51.00", "http://www.frank.com", "edit delete"},
            {"Doe", "Jason", "jdoe@hotmail.com", "$100.00", "http://www.jdoe.com", "edit delete"},
            {"Conway", "Tim", "tconway@earthlink.net", "$50.00", "http://www.timconway.com", "edit delete"}};
}
