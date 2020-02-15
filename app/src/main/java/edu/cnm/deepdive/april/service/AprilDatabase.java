package edu.cnm.deepdive.april.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.april.model.dao.AssessmentDao;
import edu.cnm.deepdive.april.model.dao.ClientProfileDao;
import edu.cnm.deepdive.april.model.entity.Assessment;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import edu.cnm.deepdive.april.model.entity.FetalCondition;
import edu.cnm.deepdive.april.model.entity.Labor;
import edu.cnm.deepdive.april.service.AprilDatabase.Converters;
import java.util.Date;



  @Database(
      entities = {ClientProfile.class, Assessment.class},
      version = 1,
      exportSchema = true
  )
  @TypeConverters({Converters.class})

  public abstract class AprilDatabase extends RoomDatabase {

    private static final String DB_NAME = "client_db";

    private static Application context;

    public static void setContext(Application context) {
      AprilDatabase.context = context;
    }

    public static AprilDatabase getInstance() {
      return InstanceHolder.INSTANCE;
    }

    public abstract ClientProfileDao getClientProfileDao();

    public abstract AssessmentDao getAssessmentDao();

    private static class InstanceHolder {

      private static final AprilDatabase INSTANCE = Room.databaseBuilder(
          context, AprilDatabase.class, DB_NAME)
          .build();

    }

    public static class Converters {

      @TypeConverter
      public static Long fromDate(Date date) {
        return (date != null) ? date.getTime() : null;
      }

      @TypeConverter
      public static Date fromLong(Long value) {
        return (value != null) ? new Date(value) : null;
      }

    }












}
