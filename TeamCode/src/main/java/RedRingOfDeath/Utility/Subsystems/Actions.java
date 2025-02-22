package RedRingOfDeath.Utility.Subsystems;

import com.arcrobotics.ftclib.command.WaitCommand;
import com.arcrobotics.ftclib.command.*;

public class Actions {
    public SequentialCommandGroup closeAndOpenExampleMechanism(){
        return new SequentialCommandGroup(
                new InstantCommand(Systems::closeExampleMechanism),
                new WaitCommand(1000),
                new InstantCommand(Systems::openExampleMechanism)

        );
    }
}

