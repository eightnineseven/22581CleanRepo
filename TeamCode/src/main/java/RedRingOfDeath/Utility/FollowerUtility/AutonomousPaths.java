package RedRingOfDeath.Utility.FollowerUtility;

import com.pedropathing.pathgen.BezierCurve;
import com.pedropathing.pathgen.Path;
import com.pedropathing.pathgen.PathBuilder;
import com.pedropathing.pathgen.PathChain;
import com.pedropathing.pathgen.Point;

import static RedRingOfDeath.Utility.FollowerUtility.PathEnums.*;


public class AutonomousPaths {
    public PathChain getPath(int path){
        PathBuilder builder = new PathBuilder();
        if(path == EXAMPLE_PATH_1){
            builder.addPath(
                    new BezierCurve(
                            //START
                            new Point(0,0,Point.CARTESIAN),

                            //CONTROL
                            new Point(0,0,Point.CARTESIAN),

                            //END
                            new Point(0,0,Point.CARTESIAN)
                    ));
            return builder.build();

        } else if(path==EXAMPLE_PATH_2){

            builder.addPath(
                    new BezierCurve(
                            //START
                            new Point(0,0,Point.CARTESIAN),

                            //CONTROL
                            new Point(0,0,Point.CARTESIAN),

                            //END
                            new Point(0,0,Point.CARTESIAN)
                    ));
            return builder.build();
        } else{
            return builder.build();
        }
    }
}
