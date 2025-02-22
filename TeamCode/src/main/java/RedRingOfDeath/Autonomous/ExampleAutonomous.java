package RedRingOfDeath.Autonomous;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.WaitCommand;
import com.arcrobotics.ftclib.command.WaitUntilCommand;
import com.pedropathing.follower.Follower;
import com.pedropathing.util.Constants;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


import RedRingOfDeath.Utility.FollowerUtility.AutonomousPaths;
import RedRingOfDeath.Utility.FollowerUtility.FollowPathCommand;
import RedRingOfDeath.Utility.Subsystems.Actions;
import RedRingOfDeath.Utility.Subsystems.Systems;
import pedroPathing.constants.FConstants;
import pedroPathing.constants.LConstants;
import static RedRingOfDeath.Utility.FollowerUtility.PathEnums.*;


public class ExampleAutonomous extends CommandOpMode {
    @Override
    public void initialize() {
        Follower follower = new Follower(hardwareMap);
        Constants.setConstants(FConstants.class, LConstants.class);
        Actions actions = new Actions();
        AutonomousPaths paths = new AutonomousPaths();
        double maxPower = 1;
        schedule(
                //initialization
                new WaitUntilCommand(this::opModeIsActive),


                new FollowPathCommand(follower, paths.getPath(EXAMPLE_PATH_1), maxPower),
                new WaitUntilCommand(()->!follower.isBusy()),

                actions.closeAndOpenExampleMechanism(),

                new FollowPathCommand(follower, paths.getPath(EXAMPLE_PATH_2), maxPower),
                new WaitUntilCommand(()->!follower.isBusy())
        );
    }
}
