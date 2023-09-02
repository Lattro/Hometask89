import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Queries
{
    public void addPet(String name, int age,
                       String color, int owner) throws SQLException, ClassNotFoundException {
        var db = Connect.getConnect();
        String sqlquery = "insert into pets(name,age,color,owner) values" +
                "('"+name+"',"+age+",'"+color+"',"+owner+")";
        Statement statement = db.createStatement();
        statement.executeUpdate(sqlquery);
        db.close();
    }
    public List<Pet> selectYoungPets() throws ClassNotFoundException, SQLException
    {
        List<Pet> list = new ArrayList<>();
        String sqlQuery = " select * from pets where age<8";
        var db = Connect.getConnect();
        Statement statement = db.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        while(resultSet.next())
        {
            list.add(new Pet(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("color"),
                    resultSet.getInt("owner")) );
        }
        db.close();
        return  list;
    }
}
