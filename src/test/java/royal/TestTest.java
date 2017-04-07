package royal;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Sample Test
 */
public class TestTest extends Base {

    private static final String TEXT = "100 HOUR SALE";

    private static final String SEARCH_BUTTON_CSS = "#find-a-cruise";
    private static final String TITLE = ".show-for-desktop .text-large";

    @Test
    public void firstTest() {
        goTo("https://www.royalcaribbean.com/");
        await().until(el(SEARCH_BUTTON_CSS)).clickable();
        el(SEARCH_BUTTON_CSS).click();

        assertThat(el(TITLE).text()).isEqualTo(TEXT);
    }


}

