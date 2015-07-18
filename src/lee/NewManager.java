package lee;
 

import org.crazyit.app.domain.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		News news = new News();
	 
		news.setTitle("12");
		news.setContent("abc");
		sess.save(news);
		tx.commit();
		sess.close();
		sf.close();

	}

}
