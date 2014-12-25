package scu.fly.main;
import org.cloudbus.cloudsim.CloudletScheduler;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Vm;


public class myVm extends Vm {
	
	private int vmType;
	private int hostID = -1;//用于标明VM所属的主机ID
	
	public int getHostID() {
		return hostID;
	}

	public void setHostID(int hostID) {
		this.hostID = hostID;
	}

	public myVm(int id,
			int userId,
			double mips,
			int numberOfPes,
			int ram, 
			long bw,
			long size,
			String vmm,
			CloudletScheduler cloudletScheduler){
	 
		super(id, userId, mips, numberOfPes, ram, bw, size, vmm, cloudletScheduler);
		vmType = 0;
	}
	
	public myVm(int id,
			int userId,
			double mips,
			int numberOfPes,
			int ram,
			long bw,
			long size,
			String vmm,
			CloudletScheduler cloudletScheduler,int type){
	 
		super(id, userId, mips, numberOfPes, ram, bw, size, vmm, cloudletScheduler);
		vmType = type;
	}
	
	
	
	public void setVmType(int type){
		if(type>=0 && type<=2) this.vmType = type;
		else Log.printLine("VM类型设置错误！");
	}
	
	public int getVmType(){
		return this.vmType;
	}
	public myVm clone(){
		return  new myVm(getId(), getUserId(), getMips(), getNumberOfPes(), getRam(), getBw(), getSize(), 
								getVmm(), getCloudletScheduler(), vmType);
		
	}
	
}
