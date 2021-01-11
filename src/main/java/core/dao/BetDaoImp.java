package core.dao;

import core.db.Storage;
import core.lib.Dao;
import core.model.Bet;
import java.util.List;

@Dao
public class BetDaoImp implements BetDao {
    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
