package toni.staticKeyword;

public class Country {
    private String name;

    public String getName(){
        return name;
    }

    public static class City {
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getNameCountry(){
//            return Country.this.getName();
            return "tidak boleh karena static";
        }
    }
}
