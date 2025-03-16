package Control;

import Modelo.ConversionesYOperaciones;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

/**
 *
 * @author Gabriel Torres & Emerson Vera
 */
/**
 * Sample Skeleton for 'sistemasNumericos.fxml' Controller Class
 */
public class SistemasNumericosController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="chOperacionBin"
    private ChoiceBox<Character> chOperacionBin; // Value injected by FXMLLoader

    @FXML // fx:id="chOperacionHex"
    private ChoiceBox<Character> chOperacionHex; // Value injected by FXMLLoader

    @FXML // fx:id="chOperacionOct"
    private ChoiceBox<Character> chOperacionOct; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCalcularBin"
    private Button cmdCalcularBin; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCalcularHex"
    private Button cmdCalcularHex; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCalcularOct"
    private Button cmdCalcularOct; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirBin"
    private Button cmdConvertirBin; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirDec"
    private Button cmdConvertirDec; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirHex"
    private Button cmdConvertirHex; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirOct"
    private Button cmdConvertirOct; // Value injected by FXMLLoader

    @FXML // fx:id="tabConversiones"
    private Tab tabConversiones; // Value injected by FXMLLoader

    @FXML // fx:id="tabOperaciones"
    private Tab tabOperaciones; // Value injected by FXMLLoader

    @FXML // fx:id="tabPaneTodo"
    private TabPane tabPaneTodo; // Value injected by FXMLLoader

    @FXML // fx:id="txtBinDec"
    private TextField txtBinDec; // Value injected by FXMLLoader

    @FXML // fx:id="txtBinHex"
    private TextField txtBinHex; // Value injected by FXMLLoader

    @FXML // fx:id="txtBinOct"
    private TextField txtBinOct; // Value injected by FXMLLoader

    @FXML // fx:id="txtDecBin"
    private TextField txtDecBin; // Value injected by FXMLLoader

    @FXML // fx:id="txtDecHex"
    private TextField txtDecHex; // Value injected by FXMLLoader

    @FXML // fx:id="txtDecOct"
    private TextField txtDecOct; // Value injected by FXMLLoader

    @FXML // fx:id="txtHexBin"
    private TextField txtHexBin; // Value injected by FXMLLoader

    @FXML // fx:id="txtHexDec"
    private TextField txtHexDec; // Value injected by FXMLLoader

    @FXML // fx:id="txtHexOct"
    private TextField txtHexOct; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngreseBinario"
    private TextField txtIngreseBinario; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngreseDecimal"
    private TextField txtIngreseDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngreseHexadecimal"
    private TextField txtIngreseHexadecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngreseOctal"
    private TextField txtIngreseOctal; // Value injected by FXMLLoader

    @FXML // fx:id="txtOctBin"
    private TextField txtOctBin; // Value injected by FXMLLoader

    @FXML // fx:id="txtOctDec"
    private TextField txtOctDec; // Value injected by FXMLLoader

    @FXML // fx:id="txtOctHex"
    private TextField txtOctHex; // Value injected by FXMLLoader

    @FXML // fx:id="txtOperacionBin1"
    private TextField txtOperacionBin1; // Value injected by FXMLLoader

    @FXML // fx:id="txtOperacionBin2"
    private TextField txtOperacionBin2; // Value injected by FXMLLoader

    @FXML // fx:id="txtOperacionHex1"
    private TextField txtOperacionHex1; // Value injected by FXMLLoader

    @FXML // fx:id="txtOperacionHex2"
    private TextField txtOperacionHex2; // Value injected by FXMLLoader

    @FXML // fx:id="txtOperacionOct1"
    private TextField txtOperacionOct1; // Value injected by FXMLLoader

    @FXML // fx:id="txtOperacionOct2"
    private TextField txtOperacionOct2; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultadoBin"
    private TextField txtResultadoBin; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultadoHex"
    private TextField txtResultadoHex; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultadoOct"
    private TextField txtResultadoOct; // Value injected by FXMLLoader

    private ObservableList<Character> operaciones = FXCollections.observableArrayList();
    ConversionesYOperaciones c = new ConversionesYOperaciones();

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String contenido) {
        Alert alert = new Alert(tipo, contenido, ButtonType.CLOSE);
        alert.setTitle(titulo);
        alert.showAndWait();
    }

    void alertaNumero1Bin() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El primer numero no es binario");
    }

    void alertaNumero2Bin() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El segundo numero no es binario");
    }

    void alertaNumero1Oct() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El primer numero no es Octal");
    }

    void alertaNumero2Oct() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El segundo numero no es Octal");
    }

    void alertaNumero1Hex() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El primer numero no es Hexadecimal");
    }

    void alertaNumero2Hex() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El segundo numero no es Hexadecimal");
    }

    void alertaDecimalInvalido() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El numero a convertir no es Decimal positivo");
    }

    void alertaBinariaInvalido() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El numero a convertir no es Binario positivo");
    }

    void alertaOctalInvalido() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El numero a convertir no es Octal positivo");
    }

    void alertaHexadecimalInvalido() {
        mostrarAlerta(Alert.AlertType.ERROR, "NUMERO INCORRECTO", "El numero a convertir no es Hexadecimal positivo");
    }

    @FXML
    void calcularBin(ActionEvent event) {
        if (!c.validarBinario(txtOperacionBin1.getText())) {
            alertaNumero1Bin();
            txtResultadoBin.setText("");
        } else if (!c.validarBinario(txtOperacionBin2.getText())) {
            alertaNumero2Bin();
            txtResultadoBin.setText("");
        } else {
            if (chOperacionBin.getSelectionModel().getSelectedItem() == '+') {
                txtResultadoBin.setText(c.sumarNumerosBinarios(txtOperacionBin1.getText(), txtOperacionBin2.getText()));
            }
            if (chOperacionBin.getSelectionModel().getSelectedItem() == '-') {
                txtResultadoBin.setText(c.restarNumerosBinarios(txtOperacionBin1.getText(), txtOperacionBin2.getText()));
            }
            if (chOperacionBin.getSelectionModel().getSelectedItem() == '*') {
                txtResultadoBin.setText(c.multiplicacionNumerosBinarios(txtOperacionBin1.getText(), txtOperacionBin2.getText()));
            }
            if (chOperacionBin.getSelectionModel().getSelectedItem() == '/') {
                txtResultadoBin.setText(c.divisionNumerosBinarios(txtOperacionBin1.getText(), txtOperacionBin2.getText()));
            }
        }
    }

    @FXML
    void calcularOct(ActionEvent event) {
        if (!c.validarOctal(txtOperacionOct1.getText())) {
            alertaNumero1Oct();
            txtResultadoOct.setText("");
        } else if (!c.validarOctal(txtOperacionOct2.getText())) {
            alertaNumero2Oct();
            txtResultadoOct.setText("");
        } else {
            if (chOperacionOct.getSelectionModel().getSelectedItem() == '+') {
                txtResultadoOct.setText(c.sumarNumerosOctales(txtOperacionOct1.getText(), txtOperacionOct2.getText()));
            }
            if (chOperacionOct.getSelectionModel().getSelectedItem() == '-') {
                txtResultadoOct.setText(c.restaOctal(txtOperacionOct1.getText(), txtOperacionOct2.getText()));
            }
            if (chOperacionOct.getSelectionModel().getSelectedItem() == '*') {
                txtResultadoOct.setText(c.multiplicacionNumerosOctales(txtOperacionOct1.getText(), txtOperacionOct2.getText()));
            }
            if (chOperacionOct.getSelectionModel().getSelectedItem() == '/') {
                txtResultadoOct.setText(c.divisionNumerosOctales(txtOperacionOct1.getText(), txtOperacionOct2.getText()));
            }
        }
    }

    @FXML
    void calcularHex(ActionEvent event) {
        if (!c.validarHexadecimal(txtOperacionHex1.getText())) {
            alertaNumero1Hex();
            txtResultadoHex.setText("");
        } else if (!c.validarHexadecimal(txtOperacionHex2.getText())) {
            alertaNumero2Hex();
            txtResultadoHex.setText("");
        } else {
            if (chOperacionHex.getSelectionModel().getSelectedItem() == '+') {
                txtResultadoHex.setText(c.sumarNumerosHexadecimal(txtOperacionHex1.getText(), txtOperacionHex2.getText()));
            }
            if (chOperacionHex.getSelectionModel().getSelectedItem() == '-') {
                txtResultadoHex.setText(c.restaHexadecimal(txtOperacionHex1.getText(), txtOperacionHex2.getText()));
            }
            if (chOperacionHex.getSelectionModel().getSelectedItem() == '*') {
                txtResultadoHex.setText(c.multiplicacionNumerosHexadecimales(txtOperacionHex1.getText(), txtOperacionHex2.getText()));
            }
            if (chOperacionHex.getSelectionModel().getSelectedItem() == '/') {
                txtResultadoHex.setText(c.divisionNumerosHexadecimales(txtOperacionHex1.getText(), txtOperacionHex2.getText()));
            }
        }
    }

    @FXML
    void convertirDec(ActionEvent event) {
        if (!c.validarDecimal(txtIngreseDecimal.getText())) {
            alertaDecimalInvalido();
            txtDecBin.setText("");
            txtDecOct.setText("");
            txtDecHex.setText("");
        } else {
            txtDecBin.setText(c.decimalABinario(Integer.parseInt(txtIngreseDecimal.getText())));
            txtDecOct.setText(c.decimalAOctal(Integer.parseInt(txtIngreseDecimal.getText())));
            txtDecHex.setText(c.decimalAHexadecimal(Integer.parseInt(txtIngreseDecimal.getText())));
        }
    }

    @FXML
    void convertirBin(ActionEvent event) {
        if (!c.validarBinario(txtIngreseBinario.getText())) {
            alertaBinariaInvalido();
            txtBinDec.setText("");
            txtBinOct.setText("");
            txtBinHex.setText("");
        } else {
            txtBinDec.setText(Long.toString(c.binarioADecimal(txtIngreseBinario.getText())));
            txtBinOct.setText(c.binarioAOctal(txtIngreseBinario.getText()));
            txtBinHex.setText(c.binarioAHexadecimal(txtIngreseBinario.getText()));
        }
    }

    @FXML
    void convertirOct(ActionEvent event) {
        if (!c.validarOctal(txtIngreseOctal.getText())) {
            alertaOctalInvalido();
            txtOctDec.setText("");
            txtOctBin.setText("");
            txtOctHex.setText("");
        } else {
            txtOctDec.setText(Long.toString(c.octalADecimal(txtIngreseOctal.getText())));
            txtOctBin.setText(c.octalABinario(txtIngreseOctal.getText()));
            txtOctHex.setText(c.octalAHexadecimal(txtIngreseOctal.getText()));
        }
    }

    @FXML
    void convertirHex(ActionEvent event) {
        if (!c.validarHexadecimal(txtIngreseHexadecimal.getText())) {
            alertaHexadecimalInvalido();
            txtHexDec.setText("");
            txtHexBin.setText("");
            txtHexOct.setText("");
        } else {
            txtHexDec.setText(Long.toString(c.hexadecimalADecimal(txtIngreseHexadecimal.getText())));
            txtHexBin.setText(c.hexadecimalABinario(txtIngreseHexadecimal.getText()));
            txtHexOct.setText(c.hexadecimalAOctal(txtIngreseHexadecimal.getText()));
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert chOperacionBin != null : "fx:id=\"chOperacionBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert chOperacionHex != null : "fx:id=\"chOperacionHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert chOperacionOct != null : "fx:id=\"chOperacionOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdCalcularBin != null : "fx:id=\"cmdCalcularBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdCalcularHex != null : "fx:id=\"cmdCalcularHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdCalcularOct != null : "fx:id=\"cmdCalcularOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdConvertirBin != null : "fx:id=\"cmdConvertirBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdConvertirDec != null : "fx:id=\"cmdConvertirDec\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdConvertirHex != null : "fx:id=\"cmdConvertirHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert cmdConvertirOct != null : "fx:id=\"cmdConvertirOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert tabConversiones != null : "fx:id=\"tabConversiones\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert tabOperaciones != null : "fx:id=\"tabOperaciones\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert tabPaneTodo != null : "fx:id=\"tabPaneTodo\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtBinDec != null : "fx:id=\"txtBinDec\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtBinHex != null : "fx:id=\"txtBinHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtBinOct != null : "fx:id=\"txtBinOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtDecBin != null : "fx:id=\"txtDecBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtDecHex != null : "fx:id=\"txtDecHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtDecOct != null : "fx:id=\"txtDecOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtHexBin != null : "fx:id=\"txtHexBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtHexDec != null : "fx:id=\"txtHexDec\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtHexOct != null : "fx:id=\"txtHexOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtIngreseBinario != null : "fx:id=\"txtIngreseBinario\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtIngreseDecimal != null : "fx:id=\"txtIngreseDecimal\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtIngreseHexadecimal != null : "fx:id=\"txtIngreseHexadecimal\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtIngreseOctal != null : "fx:id=\"txtIngreseOctal\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOctBin != null : "fx:id=\"txtOctBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOctDec != null : "fx:id=\"txtOctDec\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOctHex != null : "fx:id=\"txtOctHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOperacionBin1 != null : "fx:id=\"txtOperacionBin1\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOperacionBin2 != null : "fx:id=\"txtOperacionBin2\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOperacionHex1 != null : "fx:id=\"txtOperacionHex1\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOperacionHex2 != null : "fx:id=\"txtOperacionHex2\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOperacionOct1 != null : "fx:id=\"txtOperacionOct1\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtOperacionOct2 != null : "fx:id=\"txtOperacionOct2\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtResultadoBin != null : "fx:id=\"txtResultadoBin\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtResultadoHex != null : "fx:id=\"txtResultadoHex\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";
        assert txtResultadoOct != null : "fx:id=\"txtResultadoOct\" was not injected: check your FXML file 'sistemasNumericos.fxml'.";

        initChoiceBox();
        chOperacionBin.getSelectionModel().clearAndSelect(0);
        chOperacionOct.getSelectionModel().clearAndSelect(0);
        chOperacionHex.getSelectionModel().clearAndSelect(0);
    }

    private void initChoiceBox() {
        char[] operaciones = {'+', '-', '*', '/'};
        for (int i = 0; i < operaciones.length; i++) {
            chOperacionBin.getItems().add(operaciones[i]);
            chOperacionOct.getItems().add(operaciones[i]);
            chOperacionHex.getItems().add(operaciones[i]);
        }
    }
}
