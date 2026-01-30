package RobotHazard;



public class RobotHazardAuditor {
	

	  
		 public void validateArmPrecision(double armPrecision) throws RobotSafetyException {
		        if (armPrecision < 0.0 || armPrecision > 1.0) {
		            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		        }
		    }

		    public void validateWorkerDensity(int workerDensity) throws RobotSafetyException {
		        if (workerDensity < 1 || workerDensity > 20) {
		            throw new RobotSafetyException("Error: Worker density must be 1-20");
		        }
		    }

		    public void validateMachineryState(String machineryState) throws RobotSafetyException {
		        if (!machineryState.equals("Worn")
		                && !machineryState.equals("Faulty")
		                && !machineryState.equals("Critical")) {
		            throw new RobotSafetyException("Error: Unsupported machinery state");
		        }
		    }

		
		    public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState)
		            throws RobotSafetyException {

		        validateArmPrecision(armPrecision);
		        validateWorkerDensity(workerDensity);
		        validateMachineryState(machineryState);

		        double machineRiskFactor;

		        switch (machineryState) {
		            case "Worn":
		                machineRiskFactor = 1.3;
		                break;
		            case "Faulty":
		                machineRiskFactor = 2.0;
		                break;
		            case "Critical":
		                machineRiskFactor = 3.0;
		                break;
		            default:
		                throw new RobotSafetyException("Error: Unsupported machinery state");
		        }

		        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
		    }
	}

