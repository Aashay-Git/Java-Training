package com.fooddelivery.fooddelivery;

import com.fooddelivery.fooddelivery.config.AppConfig;
import com.fooddelivery.fooddelivery.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class FoodDeliveryApplication {



    public static void main(String[] args) throws SQLException {


        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodApp","root","Aashay_119");
        PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS user (userid int , username varchar(255), email varchar(255), address varchar(255), mobileNum varchar(255))");
        PreparedStatement ps2 = con.prepareStatement("INSERT INTO user values (?,?,?,?,?)");

        ps.execute();
        ps2.setInt(1, 1);
        ps2.setString(2, "Aashay");
        ps2.setString(3, "tempmail@mail.com");
        ps2.setString(4, "India, Bharat");
        ps2.setString(5, "1234567890");

//        ps2.execute();

        ps.close();
//        ps2.close();

        PreparedStatement ps3 = con.prepareStatement("SELECT * FROM user");

        System.out.println(ps3.execute());
//        ps3.execute();

        con.close();


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderController controller = ctx.getBean(OrderController.class);

        controller.createNewOrder();

    }

}
