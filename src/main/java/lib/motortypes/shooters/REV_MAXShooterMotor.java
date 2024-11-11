package lib.motortypes.shooters;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkPIDController.ArbFFUnits;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.filter.SlewRateLimiter;
import lib.motormechanisms.controlrequests.CurrentRequest;
import lib.motormechanisms.controlrequests.LinearVelocityRequest;
import lib.motormechanisms.controlrequests.VoltageRequest;
import lib.motortypes.MotorControllerType;

public class REV_MAXShooterMotor extends CANSparkMax implements ShooterMotor {
    // TODO: Allen continue here. Don't forget to import imports.
    // TODO: create a SimpleMotorFeedforward object named feedforward.  private final.
    // TODO: create a SlewRateLimiter named slewRateLimiter. private final.

    public REV_MAXShooterMotor(REV_MAXShooterMotorConfig config) {
        super(config.deviceNumber(), MotorType.kBrushless);
        // TODO: call setInverted passing in invertedValue from config
        // TODO: call setIdleMode passing in value from config.
        // TODO: call getEncoder().setAverageDepth passing in value from config.
        // TODO: call getEncoder().setMeasurementPeriod passing in value from config.
        // TODO: call getEncoder().setPositionConversionFactor passing in 2 * Math.PI / sensorToMechanismRatio.
        // sensorToMechanismRatio comes from config.
        // TODO: call getEncoder().setVelocityConversionFactor passing in 2 * Math.PI / sensorToMechanismRatio / 60.0
        // TODO: call getPIDController().setP, I, D for voltageVelocity P, I, D using 1 for slotID.  These are 3 similar TODO's
        // TODO: initialize feedforward to new SimpleMotorFeedforward passing in ks, kv, ka from config.
        // TODO: initialize slewRateLimiter to new SlewRateLimiter passing in maxAcceleration from config
    }

    @Override
    public int getCanId() {
        // TODO: return getDeviceId();
        return 0; // TODO: remove this placeholder.
    }

    @Override
    public String getCanNetworkName() {
        // TODO: return "rio";
        return null; // TODO: remove this placeholder.
    }

    @Override
    public MotorControllerType getMotorControllerType() {
        // TODO: return MotorControllerType.REV_SPARK_MAX;
        return null; // TODO: remove this placeholder.
    }

    @Override
    public double getCurrentAmps() {
        // TODO: return getOutputCurrent();
        return 0.0; // TODO: remove this placeholder.

    }

    @Override
    public double getVoltageVolts() {
        // TODO: return getAppliedOutput() * getBusVoltage();
        return 0.0; // TODO: remove this placeholder.
    }

    @Override
    public double getVelocityMetersPerSecond() {
        // TODO: return getEncoder().getVelocity();
        return 0.0; // TODO: remove this placeholder.
    }

    @Override
    public void accept(VoltageRequest request) {
        // TODO: call getPIDController().setReference passing in volts from request and ControlType.kVoltage
    }

    @Override
    public void accept(CurrentRequest request) {
        // TODO: call getPIDController().setReference passing in current from request and ControlType.kCurrent
    }

    @Override
    public void acceptVelocityVoltage(LinearVelocityRequest request) {
        // TODO: create a double named feedforwardVoltage and get from feedforward's calculate method.
        // passing in getVelocity, velocity from request, 0.020
        // TODO: call getPIDController().setReference passing in velocity from request, ControlType.kVelocity, 1, feedforwardVoltage, ArbFFUnits.kVoltage
        // TODO: call slewRateLimiter's reset method passing in velocity converted to radians like before.
    }

    @Override
    public void acceptTrapVelocityVoltage(LinearVelocityRequest request) {
        // TODO: create a double called velocity, get from slewRateLimiter's calculate method passing in velocity from request.
        // TODO: create a double named feedforwardVoltage and get from feedforward's calculate method.
        // passing in getVelocity, velocity from request, 0.020
        // TODO: call getPIDController().setReference passing in velocity from request, ControlType.kVelocity, 1, feedforwardVoltage, ArbFFUnits.kVoltage
    }

    @Override
    public void acceptVelocityCurrent(LinearVelocityRequest request) {
        // TODO: call acceptVelocityVoltage(request);
    }

    @Override
    public void acceptTrapVelocityCurrent(LinearVelocityRequest request) {
        // TODO: call acceptTrapVelocityVoltage(request);
    }

}
