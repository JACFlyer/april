package edu.cnm.deepdive.april.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.april.model.entity.Assessment;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import edu.cnm.deepdive.april.model.entity.Labor;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;


@Dao
public interface LaborDao {

  @Insert
  Single<Long> insert(Labor labor);

  @Insert
  Single<List<Long>> insert(Collection<Labor> labors);

  @Insert
  Single<List<Long>> insert(Labor... labors);

  @Delete
  Single<Integer> delete(Labor labor);

  @Delete
  Single<Integer> delete(Collection<Labor> labors);

  @Delete
  Single<Integer> delete(Labor... labors);

  @Query("SELECT * FROM Labor ORDER BY labor_id")
  List<Labor> select();

  @Query("SELECT * FROM Labor WHERE labor_id = :id")
  Single<Labor> select(long id);

}
