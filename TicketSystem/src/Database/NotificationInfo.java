/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @OriginalAuthor - @drgimatt
 * Notification class contains the notification.
 * 
 */
public class NotificationInfo {
    private String id;
    private String notifyUser;
    private String eventUser;
    private String eventType;
    private int seenNotif;
    private String date;

    // Constructor for creating a NotificationInfo with all attributes    

    public NotificationInfo(String id, String notifyUser, String eventUser, String eventType, int seenNotif, String date) {
        this.id = id;
        this.notifyUser = notifyUser;
        this.eventUser = eventUser;
        this.eventType = eventType;
        this.seenNotif = seenNotif;
        this.date = date;
    }

    public NotificationInfo(String notifyUser, String eventUser, String eventType, int seenNotif, String date) {
        this.notifyUser = notifyUser;
        this.eventUser = eventUser;
        this.eventType = eventType;
        this.seenNotif = seenNotif;
        this.date = date;
    }
    
    public String getId() {
        return id;
    }

    public String getNotifyUser() {
        return notifyUser;
    }

    public String getEventUser() {
        return eventUser;
    }

    public String getEventType() {
        return eventType;
    }    
    
    public int getSeenNotif() {
        return seenNotif;
    }
    
    public String getDate(){
        return date;
    }

    
  
    


}






