package core.dao;

import core.db.Storage;
import core.lib.Dao;
import core.model.Gain;
import java.util.List;

@Dao
public class GainDaoImpl implements GainDao {

    @Override
    public void add(Gain gain) {
        Storage.gains.add(gain);
    }

    @Override
    public List<Gain> getAll() {
        return Storage.gains;
    }
}
