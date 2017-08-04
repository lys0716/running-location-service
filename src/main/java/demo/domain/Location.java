package demo.domain;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Location {
    enum GpsStatus{
        EXCELLENT, OK, UNRELIABLE, BAD, NOFIX, UNKNOWN;
    }

    public enum RunnerMovementType{
        STOPPED, IN_MOTION;

        public boolean isMoving() {
            return this != STOPPED;
        }
    }

    private Long id;

    private final UnitInfo unitInfo;

    private MedicalInfo medicalInfo;

    private double latitude;
    private double longtitude;

    private String heading;
    private double gpsSpeed;
    private GpsStatus gpsStatus;

    private double odometer;
    private double totalRunningTime;
    private double totalIdleTime;
    private double totalCaloriesBurnt;
    private String address;
    private Date timestamp = new Date;
    private RunnerMovementType runnerMovementType = RunnerMovementType.STOPPED;
    private String serviceType;

    public Location(String runningId) {
        this.unitInfo = new UnitInfo(runningId);
    }
}
