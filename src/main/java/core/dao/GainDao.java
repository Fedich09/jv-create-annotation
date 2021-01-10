package core.dao;

import core.model.Gain;
import java.util.List;

public interface GainDao {
    void add(Gain gain);

    List<Gain> getAll();
}
