package Vista;

import Modelo.ConversionesYOperaciones;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel Torres & Emerson Vera
 */
public class SistemasNumericos extends Application {

    public static void main(String[] args) throws Exception {
        ConversionesYOperaciones modelo = new ConversionesYOperaciones();
        System.out.println(modelo.restaOctalOperacion("12", "13"));
        System.out.println(modelo.divisionNumerosOctales("325", "11"));
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/sistemasNumericos.fxml"));
            Parent root = loader.load();
            // Crear la escena con el contenido cargado
            Scene scene = new Scene(root);
            // Configurar el escenario (stage)
            primaryStage.setTitle("Conversiones Y Operaciones");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
