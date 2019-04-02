package udfs.presto;

import com.linkedin.transport.api.udf.StdUDF;
import com.linkedin.transport.presto.StdUdfWrapper;
import java.lang.Override;

public class OverloadedUDFString extends StdUdfWrapper {
  public OverloadedUDFString() {
    super(new udfs.OverloadedUDFString());
  }

  @Override
  protected StdUDF getStdUDF() {
    return new udfs.OverloadedUDFString();
  }
}
