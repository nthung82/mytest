package com.vn;

import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class JasperReportsIntro
{
  public static void main(String[] args)
  {
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    try
    {
      jasperReport = JasperCompileManager.compileReport(
          "src/jasperreports_demo.jrxml");
      jasperPrint = JasperFillManager.fillReport(
          jasperReport, new HashMap(), new JREmptyDataSource());
      JasperExportManager.exportReportToPdfFile(
          jasperPrint, "D:/simple_report.pdf");
    }
    catch (JRException e)
    {
      e.printStackTrace();
    }
  }
}