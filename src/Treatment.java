interface Treatment {
    void prescribeTreatment(String treatment);
}

interface Prescription {
    void givePrescription(String medication);
}
class Patient implements Treatment, Prescription {
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void prescribeTreatment(String treatment) {
        System.out.println(name + " is prescribed: " + treatment);
    }

    @Override
    public void givePrescription(String medication) {
        System.out.println(name + " is given medication: " + medication);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}