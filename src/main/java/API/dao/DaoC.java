package API.dao;

import API.model.MainTab;
import org.hibernate.*;
import org.slf4j.*;
import java.util.List;

public class DaoC {
    private static final Logger logger = LoggerFactory.getLogger(DaoC.class);
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    public void addT(MainTab mainTab)
    {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(mainTab);
        logger.info("successfully saved: " + mainTab);
    }

    public void updT(MainTab mainTab)
    {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(mainTab);
        logger.info("successfully update: " + mainTab);
    }

    public void remT(int id)
    {
        Session session = this.sessionFactory.getCurrentSession();
        MainTab mainTab = (MainTab) session.load(MainTab.class, new Integer(id));
        if(mainTab!=null)
        {
            session.delete(mainTab);
        }
        logger.info("successfully removed: " + mainTab);
    }

    public MainTab getT(int id)
    {
        Session session =this.sessionFactory.getCurrentSession();
        MainTab mainTab = (MainTab) session.load(MainTab.class, new Integer(id));
        logger.info("successfully loaded: " + mainTab);
        return mainTab;
    }

    @SuppressWarnings("unchecked")
    public List<MainTab> lisT()
    {
        Session session = this.sessionFactory.getCurrentSession();
        List<MainTab> tList = session.createQuery("from MainTab").list();
        for(MainTab mainTab: tList)
        {
            logger.info("list: " + mainTab);
        }
        return tList;
    }

}
