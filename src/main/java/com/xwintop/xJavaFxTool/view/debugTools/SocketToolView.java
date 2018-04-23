package com.xwintop.xJavaFxTool.view.debugTools;

import lombok.Getter;
import lombok.Setter;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Map;

@Getter
@Setter
public abstract class SocketToolView implements Initializable {
    @FXML
    protected ComboBox<String> serverTcpUrlComboBox;
    @FXML
    protected TextField serverTcpPortTextField;
    @FXML
    protected Button serverTcpListenButton;
    @FXML
    protected ComboBox<String> serverUdpUrlComboBox;
    @FXML
    protected TextField serverUdpPortTextField;
    @FXML
    protected Button serverUdpListenButton;
    @FXML
    protected TableView<Map<String,String>> serverConnectTableView;
    @FXML
    protected TableColumn<Map<String,String>,String> serverConnectTableColumn;
    @FXML
    protected TextField serverDataSend1TextField;
    @FXML
    protected Button serverDataSend1Button;
    @FXML
    protected TextField serverDataSend2TextField;
    @FXML
    protected Button serverDataSend2Button;
    @FXML
    protected TextField serverDataSend3TextField;
    @FXML
    protected Button serverDataSend3Button;
    @FXML
    protected Button serverClearLogButton;
    @FXML
    protected TextArea serverLogTextArea;
    @FXML
    protected ComboBox<String> clientUrlComboBox;
    @FXML
    protected TextField clientPortTextField;
    @FXML
    protected Button clientTcpConnectButton;
    @FXML
    protected Button clientUdpConnectButton;
    @FXML
    protected TextField clientDataSend1TextField;
    @FXML
    protected Button clientDataSend1Button;
    @FXML
    protected TextField clientDataSend2TextField;
    @FXML
    protected Button clientDataSend2Button;
    @FXML
    protected TextField clientDataSend3TextField;
    @FXML
    protected Button clientDataSend3Button;
    @FXML
    protected Button clientClearLogButton;
    @FXML
    protected TextArea clientLogTextArea;

}