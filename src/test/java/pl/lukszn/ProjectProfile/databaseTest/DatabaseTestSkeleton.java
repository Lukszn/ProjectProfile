package pl.lukszn.ProjectProfile.databaseTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestRule.*;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public abstract class DatabaseTestSkeleton {
	
	private static final String UNIT_NAME = "TestPU";
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		entityManagerFactory = Persistence.createEntityManagerFactory(UNIT_NAME);
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@AfterClass
	public static void afterClass() {
		entityManager.close();
		entityManagerFactory.close();
	}
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Rule
	public TestRule transactionRule = new TestRule() {
	
		public Statement apply(final Statement base, final Description description) {
			return new Statement() {
				@Override
				public void evaluate() throws Throwable{
					EntityTransaction transaction = null;
					try {
						transaction = entityManager.getTransaction();
						if (transaction != null) {
							transaction.begin();
						}
						base.evaluate();
						if(transaction != null && transaction.isActive()) {
							transaction.commit();
						}
					} catch (final Throwable exception) {
						if (transaction != null && transaction.isActive()) {
							transaction.rollback();
						}
						throw exception;
					}
				}
			};
		}
	};

}
