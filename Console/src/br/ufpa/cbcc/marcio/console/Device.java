package br.ufpa.cbcc.marcio.console;

public abstract class Device {
private String tipoDevice;
  
  public Device(String tipoDevice)
      {
        this.setTipoDevice(tipoDevice);
        System.out.println("Device instanciado como: "+tipoDevice);
      }

public String getTipoDevice() {
	return tipoDevice;
}

private void setTipoDevice(String tipoDevice) {
	this.tipoDevice = tipoDevice;
}

}
