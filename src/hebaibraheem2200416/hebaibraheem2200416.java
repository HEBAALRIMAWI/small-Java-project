package hebaibraheem2200416;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class hebaibraheem2200416 extends Application{

	 int x=180 , y=165 ;

		
	public void start(Stage ps) {
		ps.setTitle("Homework  :)");
		
	    Label l1 = new Label("Heba Ibraheem Aqil 2200416");
		l1.setLayoutX(x);	l1.setLayoutY(y);
		Button b1 = new Button("click to see your photo...");
		b1.setLayoutX(55);	b1.setLayoutY(220);
		
		Image iup = new Image(new File("up.png").toURI().toString());
       ImageView ivup = new  ImageView(iup); 
       ivup.setFitHeight(20);
       ivup.setFitWidth(20);
       
       Image idown = new Image(new File("down.png").toURI().toString());
       ImageView ivdown = new  ImageView(idown);
       ivdown.setFitHeight(20);
       ivdown.setFitWidth(20);
   
       Image ileft = new Image(new File("left.png").toURI().toString());
       ImageView ivleft = new  ImageView(ileft);
       ivleft.setFitHeight(20);
       ivleft.setFitWidth(20);
   
       Image iright = new Image(new File("right.png").toURI().toString());
       ImageView ivright = new  ImageView(iright);
       ivright.setFitHeight(20);
       ivright.setFitWidth(20);
   
		Button bup = new Button("",ivup);
		bup.setLayoutX(100);	bup.setLayoutY(140);

		Button bdown = new Button("",ivdown);
		bdown.setLayoutX(100);	bdown.setLayoutY(180);
		
		Button bleft = new Button("",ivleft);
		bleft.setLayoutX(60);	bleft.setLayoutY(160);
		
		Button bright = new Button("",ivright);
		bright.setLayoutX(140);	bright.setLayoutY(160);
		
		
		Pane p1 = new Pane();
		//p1.add(l1,3,1);
		p1.getChildren().add(l1);
		p1.getChildren().add(b1);
		p1.getChildren().add(bup);
		p1.getChildren().add(bdown);
		p1.getChildren().add(bleft);
		p1.getChildren().add(bright);
 
		
		Scene s1 = new Scene(p1,500,500);
	    ps.setScene(s1);
	    ps.show();
	    
		Image i1 = new Image(new File("photo.png").toURI().toString());
        ImageView iv = new  ImageView(i1);
        iv.setFitWidth(300);
        iv.setFitHeight(300);
		BorderPane p2 = new BorderPane(iv);
	    Stage stg2 = new Stage();
		Scene s2 = new Scene(p2,400,400);
		stg2.setScene(s2);
		stg2.setX(200);
		stg2.setY(400);
		//Label l3 = l1;
	
		
		   b1.setOnAction(
				    
		    	/*	(ActionEvent*/ e-> stg2.show()
		    		
		    		);
		   
		   bup.setOnAction(
				    
		    		e->
		    		
		    		//y--;
		    		//p1.add(new Label ("Heba Ibraheem Aqil 2200416"),x,y);
		    	    //Label l2 = new Label("Heba Ibraheem Aqil 2200416");
		    	    //Label l3 = l1;
		    	    //p1.add(l3,x,y);
	    			//p1.getChildren().clear();
			    	//Label l2 = new Label("Heba Ibraheem Aqil 2200416");
	    			//p1.add(l2,x,--y);
	    		
		    	
		    		l1.setLayoutY(--y)
		    				    		
		    		);
		 
		    bdown.setOnAction(
				    
		    		e->		{l1.setLayoutY(++y);
                           // int x =4;
                            x++;
		    		});
		   bleft.setOnAction(
				    
		    		e->  		    		l1.setLayoutX(--x)

		    		
		    		);
		   bright.setOnAction(
				    
		    		e-> 	l1.setLayoutX(++x)
		    		
		    		);
		    
	  
	  
		
		
	}
	
	
	public static void main (String args[]) {
		//launch(args);
		Application.launch(args);
	}
	
}
