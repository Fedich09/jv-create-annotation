package core.dao;

import core.model.Bet;
import java.util.List;

public interface BetDao {
    void add(Bet bet);

    List<Bet> getAll();
}
