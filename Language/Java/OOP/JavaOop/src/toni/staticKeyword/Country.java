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
            // ini lebih ke kebalikan sih, kalau static di inner class justru malah jadi tidak bisa akses
            return "tidak boleh karena static";
        }
    }
}
