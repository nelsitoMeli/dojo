public class ClienteFactory {
    public Cliente create(String cliente) {
        return cliente.equals("android") ? new Android() : new iOS();
    }

    public Cliente create(String cliente, String version) {
        switch (cliente) {
            case "android" :
                switch (version) {
                    case "10":
                        return new Android10();
                    case "103":
                        return new Android103();
                    default:
                        return new Android();
                }
            case "ios" :
                switch (version) {
                    case "9":
                        return new iOS9();
                    default:
                        return new iOS();
                }
            default:
                return new DefaultCliente();
        }
    }
}
