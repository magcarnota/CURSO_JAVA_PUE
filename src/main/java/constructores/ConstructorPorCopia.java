package constructores;

import java.util.Objects;

/**
 * Constructor por copia
 * @author magcarnota
 */
public class ConstructorPorCopia {
    private String msg;
    private int value;

    ConstructorPorCopia(String msg, int value) {
        this.msg = msg;
        this.value = value;
    }

    ConstructorPorCopia(ConstructorPorCopia paraCopiar) {
        this.msg = paraCopiar.msg;
        this.value = paraCopiar.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructorPorCopia that = (ConstructorPorCopia) o;
        return value == that.value && Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, value);
    }
}
