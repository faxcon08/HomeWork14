package lesson_14;

public class Car2  extends Car1{

    /////////////////////////////////// contstructor /////////////////


      public Car2(String brand, String model, double engineVolume, String color, int year, String country) {
          setBrand(brand);
          setModel(model);
          setEngineVolume(engineVolume);
          setColor(color);
          setYear(year);
          setCountry(country);
      }



    ////////////////////////////////////// utility ///////////////////
    private String simpleCheckString(String str, String forDefaultValue) {
        if(str==null || str.isBlank()){
            System.out.println("Некорректный ввод. Значение будет измененено на :"+forDefaultValue);
            return  forDefaultValue;
        }
        return str.trim().replaceAll("\\s+", " ");

    }
    /////////////////////////////////////// setters /////////////////////////

    @Override
    public void setBrand(String brand) {
        super.setBrand(simpleCheckString(brand,"Default_Brand"));
    }
    @Override
    public void setModel(String model) {
        super.setModel(simpleCheckString(model,"Default_model"));
    }
    @Override
    public void setEngineVolume(double engineVolume) {
        double defaultVolume = 1.5;
        if(engineVolume>0)
            super.setEngineVolume(engineVolume);
        else {
            System.out.println("Некорректный ввод. Значение будет измененено на :"+defaultVolume);
            super.setEngineVolume(defaultVolume);
        }
    }
    @Override
    public void setColor(String color) {
        super.setColor(simpleCheckString(color,"Default_White"));
    }
    @Override
    public void setYear(int year) {
        int defaultYear = 2000;
        if(year>1900)
            super.setYear(year);
        else {
            System.out.println("Некорректный ввод. Значение будет измененено на :"+defaultYear);
            super.setYear(defaultYear);
        }
    }
    @Override
    public void setCountry(String country) {
        super.setCountry(simpleCheckString(country,"Default_country"));
    }


}
