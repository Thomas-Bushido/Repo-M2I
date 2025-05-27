package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_JPA");
        EntityManager em = emf.createEntityManager();

        Account account = new Account(5000, "tom", "000000000000000");

        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        Account accountfind = em.find(Account.class,2);
        if(accountfind != null){
            System.out.println(accountfind);
        }else{
            System.out.println("No account find");
        }
        try{
            Account accountfindByReference = em.getReference(Account.class,4);
            System.out.println(accountfindByReference);
        }catch (EntityNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        TypedQuery<Account> query = em.createQuery("Select a from Account a where a.balance >500", Account.class);

        List<Account> accounts = query.getResultList();

        accounts.forEach(System.out::println);

        //update

        try{
            Account accountToUpdate = em.getReference(Account.class,2);
            em.getTransaction().begin();
            accountToUpdate.setBalance(450);
            em.getTransaction().commit();
        }catch (EntityNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(em.find(Account.class,2));

        Account accountToDelete = em.find(Account.class,5);
        if(accountToDelete != null){
            em.getTransaction().begin();
            em.remove(accountToDelete);
            em.getTransaction().commit();
        }
         */
/*

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        System.out.println(animal1.createAnimal("Lion", "12/05/25"));
        System.out.println(animal1.createAnimal("Loup", "05/02/15"));
        System.out.println(animal1.createAnimal("Aigle", "01/02/25"));
        System.out.println(animal1.createAnimal("Gorille", "01/03/25"));

*/




    }
}