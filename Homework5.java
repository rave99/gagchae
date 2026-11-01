// Homework5.java

class Computer {
    // 요구사항: 모든 멤버 변수는 private 및 String 타입으로 선언
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    // 생성자 (public)
    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    // 컴퓨터 켜기
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    // 컴퓨터 스펙 정보 출력
    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Monitor {
    // 요구사항: 모든 멤버 변수는 private 및 String 타입으로 선언
    private String monitorSize;
    private String color;
    private String power;

    // 생성자 (public)
    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    // 모니터 켜기
    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    // 모니터 스펙 정보 출력
    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + monitorSize);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class PersonalComputer {
    // PersonalComputer는 Computer와 Monitor를 멤버로 가짐 (연관/포함 관계)
    private Computer computer;
    private Monitor monitor;

    // 생성자 (public)
    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    // PC를 켜면 본체와 모니터가 차례로 켜짐
    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    // 본체와 모니터의 스펙 정보 출력
    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
      
        // Monitor: 32인치(크기), 검은색(색상), 45W(전력소모)
        // Computer: Core i7(CPU), 32GB(메모리), 2TB(HDD), 흰색(쿨러/색상), 700W(파워)
        Monitor monitor = new Monitor("32 inch", "Black", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");

        // PersonalComputer 객체 생성 및 메소드 호출
        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}