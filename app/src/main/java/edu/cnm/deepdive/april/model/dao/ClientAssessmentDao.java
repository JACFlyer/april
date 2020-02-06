package edu.cnm.deepdive.april.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.april.model.entity.ClientAssessment;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface ClientAssessmentDao {


    //CRUD - Create
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    Single<Long> insert(ClientAssessment clientAssessment);


    @Insert
    Single<List<Long>> insert(Collection<ClientAssessment> clientAssessment);


    // CRUD - Update
    @Update
    int update(ClientAssessment clientAssessment);


    // CRUD - Delete
    @Delete
    int delete(ClientAssessment... clientAssessment);

    @Query("SELECT * FROM ClientAssessment ORDER BY time_stamp")
    LiveData<List<ClientAssessment>> select();


  }
