package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.DatePicker;

        import java.time.LocalDate;

public class Controller {
    @FXML
    private DatePicker datepicker;

    @FXML protected void ButtonClicked(ActionEvent actionEvent) {
        System.out.println("click");
        datepicker.setValue(LocalDate.now());

    }
}
