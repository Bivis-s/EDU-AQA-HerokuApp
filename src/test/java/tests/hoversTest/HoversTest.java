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

        // open page
        hoversPage.openPage();

        // assert count of profiles on page
        Assert.assertEquals(
                hoversPage.getAllProfiles().size(),
                Values.COUNT_OF_PROFILES);
    }

    @Test
    public void profilesCaptionsTest() {

        // open page
        hoversPage.openPage();

        // assert count of profiles on page
        Assert.assertEquals(
                hoversPage.getAllProfiles().size(),
                Values.COUNT_OF_PROFILES);

        // get captions of all profiles
        List<String> captions = hoversPage.getAllCaptions();

        // assert each caption
        for (int i = 0; i < captions.size(); i++) {

            Assert.assertEquals(
                    captions.get(i),
                    Values.CAPTIONS.get(i));
        }

    }

    @Test
    public void checkUserProfilesTest() {

        // open page
        hoversPage.openPage();

        // get count of profiles on page
        int countOfProfiles = hoversPage.getAllProfiles().size();

        // assert count of profiles on page
        Assert.assertEquals(
                countOfProfiles,
                Values.COUNT_OF_PROFILES);

        // assert each profile link content in new page
        for (int i = 0; i < countOfProfiles; i++) {

            hoversPage.openPage();

            Assert.assertEquals(
                    hoversPage.getAllProfileLinkContent(i),
                    Values.USERS_PROFILE_NOT_FOUND);
        }

    }
}
