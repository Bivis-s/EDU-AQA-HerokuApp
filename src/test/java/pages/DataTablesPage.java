package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTablesPage extends AbstractPage {
    protected final static String DATA_TABLES_URL = URL + "tables";
    private final String TABLE1_THEAD_CELLS_XPATH = "//table[@id='table1']//thead//tr//th";
    private final String TABLE1_THEAD_CELL_XPATH = "//table[@id='table1']//thead//tr//th[%s]";
    private final String TABLE1_TBODY_TRS_XPATH = "//table[@id='table1']//tbody//tr";
    private final String TABLE1_TBODY_1ST_ROW_CELLS_XPATH = "//table[@id='table1']//tbody//tr[1]//td";
    private final String TABLE1_TBODY_CELL_XPATH = "//table[@id='table1']//tbody//tr[%s]//td[%s]";

    private By getTable1THeadBy(int numberOfColumn) {
        return By.xpath(String.format(TABLE1_THEAD_CELL_XPATH, numberOfColumn));
    }

    private By getTable1CellBy(int numberOfRow, int numberOfColumn) {
        return By.xpath(String.format(TABLE1_TBODY_CELL_XPATH, numberOfRow, numberOfColumn));
    }

    public DataTablesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(DATA_TABLES_URL);
    }

    public String getTable1HeadCell(int numberOfCell) {
        return driver.findElement(getTable1THeadBy(numberOfCell)).getText();
    }

    public String getTable1TbodyCell(int numberOfRow, int numberOfColumn) {
        return driver.findElement(getTable1CellBy(numberOfRow, numberOfColumn)).getText();
    }

    public int getTable1HeadSize() {
        return driver.findElements(By.xpath(TABLE1_THEAD_CELLS_XPATH)).size();
    }

    public int getTable1TBodyRowsSize() {
        return driver.findElements(By.xpath(TABLE1_TBODY_TRS_XPATH)).size();
    }

    public int getTable1Body1stRowCellsSize() {
        return driver.findElements(By.xpath(TABLE1_TBODY_1ST_ROW_CELLS_XPATH)).size();
    }
}