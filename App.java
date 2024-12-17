package JavaCodesForExam;
interface InnerApp {

    void click();

    void capture();
}

class Camera implements InnerApp {
    public void click() {
        System.out.println("Clicking a button...");
    }

    public void capture() {
        System.out.println("Capturing a picture...");
    }

    void record() {
        System.out.println("Recording a video...");
    }
}

class App {

    public static void main(String[] args) {
        Camera c = new Camera();
        c.click();
        c.capture();
        c.record();

    }
}