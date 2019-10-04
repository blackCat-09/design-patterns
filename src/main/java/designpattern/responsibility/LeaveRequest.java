package designpattern.responsibility;

/**
 * DATE  2019-09-01
 * 请假人信息
 *
 */
public class LeaveRequest {

    // 姓名
    private String name;
    // 请假人天生
    private int numOfDays;

    public LeaveRequest(String name, int numOfDays) {
        this.name = name;
        this.numOfDays = numOfDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }
}
