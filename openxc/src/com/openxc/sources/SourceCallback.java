package com.openxc.sources;

import com.openxc.remote.RawMeasurement;

/**
 * A receipient of measurement updates from a vehicle data source.
 *
 * A VehicleDataSource is given a callback that implements this interface. When
 * new measurements arrive from the source, it uses the
 * {@link #receive(RawMeasurement)} method to pass along the new value.
 */
public interface SourceCallback {
    /**
     * Receive a new measurement with at least a value and optionally an event.
     *
     * @param measurement the new measurement.
     */
    public void receive(RawMeasurement measurement);
}
