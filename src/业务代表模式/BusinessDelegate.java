package 业务代表模式;

public class BusinessDelegate {

    private BusinessLookUp lookUpService = new BusinessLookUp();
    private IBusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
