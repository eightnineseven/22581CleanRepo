package RedRingOfDeath.Utility.Subsystems;



import static RedRingOfDeath.Utility.Subsystems.Values.*;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Systems {
    public static Servo exampleMechanism;

    public Systems(HardwareMap hardwareMap) {
        exampleMechanism = hardwareMap.get(Servo.class, "examplePort");
    }


        public static void closeExampleMechanism() {
            exampleMechanism.setPosition(EXAMPLE_MECHANISM_CLOSE);
        }
        public static void openExampleMechanism () {
            exampleMechanism.setPosition(EXAMPLE_MECHANISM_OPEN);

        }

}
