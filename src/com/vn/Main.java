package com.vn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Main {
   @SuppressWarnings("unchecked")
   
   public static void main(String[] args) {
      //My test
      String sourceFileName =
         "F://jasper_report_template.jrxml";
      DataBeanList DataBeanList = new DataBeanList();
      ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();

      JRBeanCollectionDataSource beanColDataSource =
      new JRBeanCollectionDataSource(dataList);
      
      Map parameters = new HashMap();
      try {
    	  JasperCompileManager.compileReportToFile(sourceFileName);
         JasperFillManager.fillReportToFile(
         sourceFileName,
         parameters,
         beanColDataSource);
      } catch (JRException e) {
         e.printStackTrace();
      }
   }
}
