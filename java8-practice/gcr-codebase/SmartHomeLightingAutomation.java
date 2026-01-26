@FunctionalInterface
interface LightBehavior {
    void perform();
}

public class SmartHomeLightingAutomation {
     public static void main(String[] args) {

        LightBehavior motionSensor = () ->
                System.out.println("Motion detected → Lights turned ON");

        LightBehavior morningRoutine = () ->
                System.out.println("Morning time → Soft white lights activated");

        LightBehavior voiceAssistant = () ->
                System.out.println("Voice command → Party lights ON");

        // triggers
        motionSensor.perform();
        morningRoutine.perform();
        voiceAssistant.perform();
    }
}
