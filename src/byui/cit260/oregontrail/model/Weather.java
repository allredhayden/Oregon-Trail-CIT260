
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;


public class Weather implements Serializable {
    
    private String weatherType;

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.weatherType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Weather other = (Weather) obj;
        if (!Objects.equals(this.weatherType, other.weatherType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weather{" + "weatherType=" + weatherType + '}';
    }

    

    
}
