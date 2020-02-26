package edu.cnm.deepdive.april.model.repository;

import android.app.Application;
import edu.cnm.deepdive.april.service.AprilDatabase;



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
