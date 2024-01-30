package Simple_Interest_Using_AbstraactClass_Interface;

class SBI implements Bank {


    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}
class HDFC implements Bank{
    @Override
    public float rateOfInterest() {
        return 12.5f;
    }
}

class PNB implements Bank{

    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}