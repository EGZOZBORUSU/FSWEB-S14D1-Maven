package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        // Varsayılan olarak dizileri belirli bir kapasite ile başlatalım
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to working");
        setSalary(getSalary() + 1500); 
    }

    // Junior Developer Ekleme Metodu
    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
            } else {
                System.out.println("İlgili index dolu, kayıt ezilemez!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index bulunamadı: " + e.getMessage());
        }
    }

    // Mid Developer Ekleme Metodu (Overload)
    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
            } else {
                System.out.println("İlgili index dolu, kayıt ezilemez!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index bulunamadı: " + e.getMessage());
        }
    }

    // Senior Developer Ekleme Metodu (Overload)
    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
            } else {
                System.out.println("İlgili index dolu, kayıt ezilemez!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index bulunamadı: " + e.getMessage());
        }
    }
}