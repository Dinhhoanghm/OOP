package AimsProject.hust.soict.dsai.test.store;

import java.util.ArrayList;

import AimsProject.hust.soict.dsai.aims.cart.Cart;
import AimsProject.hust.soict.dsai.aims.media.Book;
import AimsProject.hust.soict.dsai.aims.screen.controller.ViewStoreController;
import AimsProject.hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {
    private static Store store;

    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        String STORE_FXML_FILE_PATH = "/AimsProject/hust/soict/dsai/aims/screen/view/store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(cart, store);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        store = new Store();

        ArrayList<String> authors1 = new ArrayList<>();
        authors1.add("Author 1");
        authors1.add("Author 2");
        Book book1 = new Book( "Book Title 1", "Book Category 1", 10.99f,authors1,1,"fwrgerbt");

        ArrayList<String> authors2 = new ArrayList<>();
        authors2.add("Author 3");
        authors2.add("Author 4");
        Book book2 = new Book( "Book Title 2", "Book Category 2", 12.99f, authors2, 2,"aâacaf");


        store.addMedia(book1);
        store.addMedia(book2);

        cart = new Cart();

        launch(args);
    }
}