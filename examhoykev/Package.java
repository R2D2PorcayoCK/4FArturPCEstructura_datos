public class Package{

    private int id;
    private Double weightKg;
    private String desc;

    public Package(int id, Double weightKg, String desc){
        this.id=id;
        this.weightKg=weightKg;
        this.desc=desc;
    }

    public Package() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isHeavy(){
        if(weightKg >= 10){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Package [id=" + id + ", weightKg=" + weightKg + ", desc=" + desc + "]";
    }


}