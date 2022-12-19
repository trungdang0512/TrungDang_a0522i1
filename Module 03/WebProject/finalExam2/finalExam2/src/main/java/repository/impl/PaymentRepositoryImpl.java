package repository.impl;

import model.Payment;
import repository.IPaymentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepositoryImpl implements IPaymentRepository {
    BaseRepository baseRepository = new BaseRepository();
    private final String SELECT = "select * from Payment;";
    @Override
    public List<Payment> findAll() {
        List<Payment> payments= new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int iPayment =resultSet.getInt("idPayMent");
                String namePayment = resultSet.getString("namePayment");
                Payment payment = new Payment(iPayment,namePayment);
                payments.add(payment);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return payments;
    }
}
