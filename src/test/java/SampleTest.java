import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SampleTest {

    @Test
    @DisplayName("2+2 = 4")
    void PassedTest() {
      assertThat(2 + 2, is(equalTo(4)));
    }

    @Test
    @DisplayName("2+2 != 5")
    void FailedTest() {
      assertThat(2 + 2, is(not(5)));
  }
}
