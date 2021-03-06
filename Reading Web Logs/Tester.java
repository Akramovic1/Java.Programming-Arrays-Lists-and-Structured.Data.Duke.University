
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("short-test_log");
        la.printAll();
    }
    
    public void testUniqueIP (){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log.txt");
        System.out.println("There are " + la.countUniqueIPs() + " IPs");
    }
    public void tetPrintAllHigherThanNum(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log.txt");
        la.printAllHigherThanNum(400);
    }
    public void testUniqueIPVisitsOnDay(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        System.out.println(la.uniqueIPVisitsOnDay("Sep 27"));
    }
    public void testCountUniqueIPsInRange(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        System.out.println(la.countUniqueIPsInRange(200,299));
    }
    public void testCountVisitsPerIP(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log.txt");
        System.out.println("Number of times that IP address appears:" + la.countVisitsPerIP());
    }

    public void testMostNumberVisitsByIP(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log.txt");
        HashMap<String,Integer> counts=la.countVisitsPerIP();
        System.out.println("Number of most visits by IP: " + la.mostNumberVisitsByIP(counts));
    }

    public void testIPsMostVisits(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log.txt");
        HashMap<String,Integer> counts=la.countVisitsPerIP();
        System.out.println("Ip's with most visits: " + la.iPsMostVisits(counts));
    }
    
    /*public void testIPsForDays(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog3-short_log");
        System.out.println("Ip's per day: " + la.iPsForDays());
    }*/

    public void testDayWithMostIPVisits(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log.txt");
        System.out.println("Day with most IP visits is " + la.dayWithMostIPVisits(la.iPsForDays()));
    }

    public void testIPsWithMostVisitsOnDay(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log.txt");
        System.out.println("Ip's with most visits on day are: " + la.iPsWithMostVisitsOnDay(la.iPsForDays(),"Sep 29"));
    }
}
