import io.cucumber.core.cli.Main;

public class TestDriver {
    public static void main(String[] args) {
        Main.main(new String[]{
                "--glue", "StepDefinitions",
                "src/test/resources/features"
        });
    }
}