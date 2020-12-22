package tests.hoversTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HoversPage;
import tests.AbstractTest;

import java.util.List;

public class HoversTest extends AbstractTest {

    HoversPage hoversPage;

    @BeforeMethod
    public void initPage() {
        hoversPage = new HoversPage(driver);
    }

    @Test
    public void profilesCountTest() {

        hoversPage.openPage();

        Assert.assertEquals(
                hoversPage.getAllProfiles().size(),
                Values.COUNT_OF_PROFILES);
    }

    @Test
    public void profilesCaptionsTest() {

        hoversPage.openPage();

        Assert.assertEquals(
                hoversPage.getAllProfiles().size(),
                Values.COUNT_OF_PROFILES);

        List<String> captions = hoversPage.getAllCaptions();

        for (int i = 0; i < captions.size(); i++) {

            Assert.assertEquals(
                    captions.get(i),
                    Values.CAPTIONS.get(i));
        }

    }

    @Test
    public void checkUserProfilesTest() {

        hoversPage.openPage();

        int countOfProfiles = hoversPage.getAllProfiles().size();

        Assert.assertEquals(
                countOfProfiles,
                Values.COUNT_OF_PROFILES);

        for (int i = 0; i < countOfProfiles; i++) {

            hoversPage.openPage();

            Assert.assertEquals(
                    hoversPage.getAllProfileLinksContent(i),
                    Values.USERS_PROFILE_NOT_FOUND);
        }
    }
}
