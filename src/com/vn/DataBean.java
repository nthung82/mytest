package com.vn;

public class DataBean {
   private String name;
   private String country;

   public String getName() {
	   System.err.println(1);
      return name;
   }
   //----------111

   public void setName(String name) {
      this.name = name;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }
}