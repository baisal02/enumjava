package Weekdays;

public enum Weekdays {
    MONDAY("Duishombu java okuim"),TUESDAY("Sheishembi angliyskiy okuim"),WEDNSDAY("Sharshembi java okuim"),THURSDAY("Beishembi session bolot"),FRIDAY("Juma java okuim"),SATURDAY("Ishembi sabak jok"),SUNDAY("Jekshembi sabak jok");
    //Weekdays MONDAY = new Weekdays(s);
    //MONDAY.Method
    //


    String s;
    Weekdays(String s){
        this.s=s;
    }
    public String plan(){
        return s;
    }
}
