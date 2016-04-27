package br.ufpa.cbcc.marcio.console;

public abstract class Device {
private String tipoDevice;
  
  public Device(String tipoDevice)
      {
        this.setTipoDevice(tipoDevice);
        System.out.println("Device instanciado como: "+tipoDevice);
      }
public Device(Device device){
	this.tipoDevice=device.tipoDevice;
	System.out.println("Device instanciado como copia: "+tipoDevice);
}
public String getTipoDevice() {
	return tipoDevice;
}

private void setTipoDevice(String tipoDevice) {
	this.tipoDevice = tipoDevice;
}

}
