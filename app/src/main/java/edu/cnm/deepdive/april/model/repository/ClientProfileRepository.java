package edu.cnm.deepdive.april.model.repository;

import android.app.Application;
import edu.cnm.deepdive.april.service.AprilDatabase;
import android.app.Application;
import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import edu.cnm.deepdive.april.BuildConfig;
import edu.cnm.deepdive.april.model.dao.AssessmentDao;
import edu.cnm.deepdive.april.model.dao.ClientProfileDao;
import edu.cnm.deepdive.april.model.dao.LaborDao;
import edu.cnm.deepdive.april.model.dao.FetalConditionDao;
import edu.cnm.deepdive.april.model.entity.Assessment;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import edu.cnm.deepdive.april.model.entity.Labor;
import edu.cnm.deepdive.april.model.entity.FetalCondition;
import edu.cnm.deepdive.april.service.AprilDatabase;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.ResponseBody;


public class ClientProfileRepository {

    private static final int NETWORK_THREAD_COUNT = 10;

    private final AprilDatabase database;

    private static Application context;

    private ClientProfileRepository() {
      if (context == null) {
        throw new IllegalStateException();
      }
      database = AprilDatabase.getInstance();
    }

    public static void setContext(Application context) {
      edu.cnm.deepdive.april.model.repository.ClientProfileRepository.context = context;
    }
  }
