package API.serv;

import API.dao.DaoC;
import API.model.MainTab;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class mtServ {
    private DaoC daoC;

    public void setDaoC(DaoC daoC) {
        this.daoC = daoC;
    }

    public void setT(DaoC daoC) {
        this.daoC = daoC;
    }

    @Transactional
    public void addT(MainTab mainTab) {
        this.daoC.addT(mainTab);
    }

    @Transactional
    public void updT(MainTab mainTab) {
        this.daoC.updT(mainTab);
    }

    @Transactional
    public void remT(int id) {
        this.daoC.remT(id);
    }

    @Transactional
    public MainTab getT(int id) {
        return this.daoC.getT(id);
    }

    @Transactional
    public List<MainTab> lisT() {
        return this.daoC.lisT();
    }
}
