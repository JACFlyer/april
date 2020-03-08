package edu.cnm.deepdive.april.model.repository;

import android.app.Application;
import edu.cnm.deepdive.april.model.dao.ClientProfileDao;
import edu.cnm.deepdive.april.model.dao.FetalConditionDao;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import edu.cnm.deepdive.april.model.entity.FetalCondition;
import edu.cnm.deepdive.april.service.AprilDatabase;
import io.reactivex.schedulers.Schedulers;

public class FCRepository {

  private static final int NETWORK_THREAD_COUNT = 10;

    private final AprilDatabase database;

    private static Application context;

    private FCRepository() {
      if (context == null) {
        throw new IllegalStateException();
      }
      database = AprilDatabase.getInstance();
    }

    public static void setContext(Application context) {
      edu.cnm.deepdive.april.model.repository.FCRepository.context = context;
    }

  /** Establishing Create CRUD-Operation **/
  private void insertFetalCondition(FetalCondition fetalCondition) {
    FetalConditionDao fetalConditionDao = database.getFetalConditionDao();
    FetalCondition fetalCondition1 = new FetalCondition();
    fetalCondition.setId(fetalCondition.getId());
    fetalConditionDao.insert(fetalCondition)
        .subscribeOn(Schedulers.io())
        .subscribe(/* TODO Handle repository specific error result */);
  }


  /**
   public LiveData<List<FetalCondition>> get() {
   return database.getFetalConditionDao();
   }**/






}
