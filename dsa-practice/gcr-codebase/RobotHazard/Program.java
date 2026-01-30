package RobotHazard;


import java.util.Scanner;
public class Program {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
          
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = sc.nextDouble();
            auditor.validateArmPrecision(armPrecision);


            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = sc.nextInt();
            auditor.validateWorkerDensity(workerDensity);

            sc.nextLine(); // clear buffer

            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = sc.nextLine();
            auditor.validateMachineryState(machineryState);

            
            double risk = auditor.CalculateHazardRisk(
                    armPrecision, workerDensity, machineryState
            );

            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
