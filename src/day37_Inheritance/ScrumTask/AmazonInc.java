package day37_Inheritance.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner PO = new ProductOwner("Suhib", 29, 'M', 1, 100000, company);

        BusinessAnalyst BA = new BusinessAnalyst("Cihad", 30, 'M', 2, 120000, company);

        ScrumMaster SM = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1 = new Tester("Chinara", 32, 'F', "QA", 4, 125000, company);

        Tester tester2 = new Tester("Yasaman", 31, 'F', "QE", 5, 130000, company);

        Tester tester3 = new Tester("Irena", 29, 'F', "SDET", 6, 128000, company);

        Tester tester4 = new Tester("Cihad", 26, 'M', "QA", 7, 125000, company);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer dev1 = new Developer("Daniela", 27,'F', "Java Developer", 8 ,128000, company);

        ScrumTeam scrumTeam = new ScrumTeam(PO, BA, SM);

        scrumTeam.addDeveloper(dev1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("-----------------------------");

        for (Tester tester : testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

    }
}
