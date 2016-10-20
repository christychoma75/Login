import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
* @author Christy choma
*octobor 20
*christychoma75@gmail.com
*the purpose is to develope an application to assist athletes
*/

public  class Groupsize extends Application {
	@Override
	public void start(Stage primryStage) {
	double athlete;
	double output;

	TextInputDialog numpeople = new TextInputDialog();
	numpeople.setContentText("Enter number of people here");
	Optional<String> input = numpeople.showAndWait();
	athlete = Double.parseDouble(input.get());
	System.out.println(athlete);
	if(athlete>10){
		output = athlete/2;
		Alert text = new Alert(AlertType.CONFIRMATION);
		text.setContentText("You have a total of " + athlete + "Groupsize of " + output);
		text.showAndWait();
	}else if(athlete>=3 && athlete<=10){
	output= athlete/3;
	Alert text = new Alert(AlertType.CONFIRMATION);
		text.setContentText("You have a total of " + athlete + "Groupsize of " + output);
		text.showAndWait();
	}else{
	Alert text = new Alert(AlertType.CONFIRMATION);
	text.setContentText(" The amount of people needs to be at least 3 ");
	text.showAndWait();
	}


	}
	}


