package tests.data_tables_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DataTablesPage;
import tests.AbstractTest;

public class DataTablesTest extends AbstractTest {
    private DataTablesPage dataTablesPage;

    @BeforeMethod
    public void initPage() {
        dataTablesPage = new DataTablesPage(getDriver());
    }

    @Test
    public void table1THeadSizeTest() {
        dataTablesPage.openPage();
        Assert.assertEquals(dataTablesPage.getTable1HeadSize(), Values.TABLE1_THEAD_SIZE);
    }

    @Test
    public void table1RowsCountTest() {
        dataTablesPage.openPage();
        Assert.assertEquals(dataTablesPage.getTable1TBodyRowsSize(), Values.TABLE1_ROWS_SIZE);
    }

    @Test
    public void table1Body1stRowColumnsCountTest() {
        dataTablesPage.openPage();
        Assert.assertEquals(dataTablesPage.getTable1Body1stRowCellsSize(), Values.TABLE1_1ST_ROW_COLUMNS_SIZE);
    }

    @Test
    public void table1THeadContentTest() {
        dataTablesPage.openPage();
        int rowsSize = dataTablesPage.getTable1HeadSize();
        Assert.assertEquals(rowsSize, Values.TABLE1_THEAD_SIZE);
        for (int i = 0; i < rowsSize; i++) {
            Assert.assertEquals(dataTablesPage.getTable1HeadCell(i + 1), Values.TABLE1_THEADS[i]);
        }
    }

    @Test
    public void table1TBodyContentTest() {
        dataTablesPage.openPage();
        int rowsSize = dataTablesPage.getTable1TBodyRowsSize();
        int columnsSize = dataTablesPage.getTable1Body1stRowCellsSize();
        // assert each sell in table
        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                Assert.assertEquals(dataTablesPage
                        .getTable1TbodyCell(i + 1, j + 1), Values.TABLE1_TBODYS[i][j]);
            }
        }
    }
}
