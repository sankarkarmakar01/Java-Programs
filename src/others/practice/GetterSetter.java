package others.practice;

    class GetSet {
        public String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public class GetterSetter {
        public static void main(String[] args) {
            GetSet obj = new GetSet();
            obj.setName("Sankar");
            String name = obj.getName();
            System.out.println(name);
        }

}
