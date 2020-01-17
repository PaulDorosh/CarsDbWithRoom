package Data;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import Model.Car;

@Database(entities = {Car.class}, version = 1, exportSchema = false)
public abstract class CarsAppDatabase extends RoomDatabase {

    public abstract CarDAO getCarDAO();

}
