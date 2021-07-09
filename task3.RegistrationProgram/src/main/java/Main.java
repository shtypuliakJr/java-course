import controllers.Controller;
import models.Model;
import views.View;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * This is Main class of program (entry point)
 */
public class Main {
    /**
     * Entry point of program
     *
     * @param args no input parameters
     */
    public static void main(String[] args) {
        Bootstrapper bootstrapper = new Bootstrapper(args);
        bootstrapper.start();
    }

    public static class Bootstrapper {
        String[] args;

        public Bootstrapper(String[] args) {
            this.args = args;
        }

        public void start() {
            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(view, model);

            controller.startRegistration();
        }
    }
}

