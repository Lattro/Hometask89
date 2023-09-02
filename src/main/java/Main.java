import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        List<Pet> list = new ArrayList<>();
        Queries queries = new Queries();
        queries.addPet("белка",5,"рыжая",1);
        queries.addPet("ворона",5,"черная",4);
        queries.addPet("бегемот",5,"серый",2);
        list.addAll(queries.selectYoungPets());
        for (Pet pet: list)
        {
            System.out.print("ID - "+pet.getId()+" ");
            System.out.print("Название питомца - "+pet.getName()+" ");
            System.out.print("Возраст - "+pet.getAge()+" ");
            System.out.print("Цвет - "+pet.getColor()+" ");
            System.out.print("ID владельца - "+pet.getOwner()+" ");
            System.out.println();
        }
    }
}
