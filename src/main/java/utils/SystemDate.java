package utils;

import java.time.LocalDateTime;

public class SystemDate {
    public String getCurrentDate(){
            LocalDateTime now = LocalDateTime.now();
            return now.toString();
    }
}
