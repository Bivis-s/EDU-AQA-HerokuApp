package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTablesPage extends AbstractPage {

    protected final static String URL = AbstractPage.URL + "tables";


    private final String TABLE1_THEAD_CELLs_XPATH = "//table[@id='table1']//thead//tr//th";
    private final String TABLE1_THEAD_CELL_XPATH = "//table[@id='table1']//thead//tr//th[%s]";

    private By getTable1THeadBy(int numberOfColumn) {
        return By.xpath(String.format(TABLE1_THEAD_CELL_XPATH, numberOfColumn));
    }

    private final String TABLE1_TBODY_XPATH = "//table[@id='table1']//tbody";

    private final String TABLE1_TBODY_TRs_XPATH = "//table[@id='table1']//tbody//tr";
    private final String TABLE1_TBODY_TR_XPATH = "//table[@id='table1']//tbody//tr[%s]";

    private By getTable1RowBy(int NumberOfRow) {
        return By.xpath(String.format(TABLE1_TBODY_TR_XPATH, NumberOfRow));
    }

    private final String TABLE1_TBODY_1ST_ROW_CELLs_XPATH = "//table[@id='table1']//tbody//tr[1]//td";


    private final String TABLE1_TBODY_CELL_XPATH = "//table[@id='table1']//tbody//tr[%s]//td[%s]";

    private By getTable1CellBy(int numberOfRow, int numberOfColumn) {
        return By.xpath(String.format(TABLE1_TBODY_CELL_XPATH, numberOfRow, numberOfColumn));
    }


    public DataTablesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DataTablesPage openPage() {
        driver.get(URL);
        return this;
    }

    public String getTable1HeadCell(int numberOfCell) {
        return driver.findElement(
                getTable1THeadBy(numberOfCell))
                .getText();
    }

    public String getTable1TbodyCell(int numberOfRow, int numberOfColumn) {
        return driver.findElement(
                getTable1CellBy(numberOfRow, numberOfColumn))
                .getText();
    }

    public int getTable1HeadSize() {
        return driver.findElements(By.xpath(TABLE1_THEAD_CELLs_XPATH)).size();
    }

    public int getTable1TBodyRowsSize() {
        return driver.findElements(By.xpath(TABLE1_TBODY_TRs_XPATH)).size();
    }

    public int getTable1Body1stRowCellsSize() {
        return driver.findElements(By.xpath(TABLE1_TBODY_1ST_ROW_CELLs_XPATH)).size();
    }

}