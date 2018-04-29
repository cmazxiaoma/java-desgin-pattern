package 服务定位模式;

public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static IService getService(String jndiName) {
        IService service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        IService newService = (IService) context.lookup(jndiName);
        cache.addService(newService);
        return newService;
    }
}
