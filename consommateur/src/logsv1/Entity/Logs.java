package logsv1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "36011216.LOGS")
public class Logs {

    private int idLog;
    private String message;


    public Logs(String message) {
        this.message = message;
    }

    public Logs() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getidLog() {
        return idLog;
    }

    public void setidLog(int idLog) {
        this.idLog = idLog;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }
}