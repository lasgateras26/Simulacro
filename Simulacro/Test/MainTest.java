import com.alberto.Launcher;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.Before;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import java.lang.reflect.Type;

public class MainTest extends ApplicationTest {

    @Before
    public void setup() throws Exception {
        ApplicationTest.launch(Launcher.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
    }

    @Test
    public void prueba(){
        clickOn("#comboBox");
        type(KeyCode.DOWN);
        type(KeyCode.DOWN);
        type(KeyCode.DOWN);
        type(KeyCode.DOWN);

        clickOn("#datePicker");
        type(KeyCode.DOWN);

        clickOn("#btnReservar");
    }
}
