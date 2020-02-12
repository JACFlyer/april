package edu.cnm.deepdive.april.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.april.model.entity.Assessment;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface AssessmentDao {


  @Insert
  Single<Long> insert(Assessment assessment);

  @Insert
  Single<List<Long>> insert(Collection<Assessment> assessment);

  @Insert
  Single<List<Long>> insert(Assessment... assessments);

  @Delete
  Single<Integer> delete(Assessment assessment);

  @Delete
  Single<Integer> delete(Collection<Assessment> assessment);

  @Delete
  Single<Integer> delete(Assessment... assessment);

  @Query("SELECT * FROM Assessment ORDER BY assessment_id")
  List<Assessment> select();

}