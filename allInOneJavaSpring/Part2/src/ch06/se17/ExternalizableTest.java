package ch06.se17;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Person implements Externalizable {
  String name;
  String job;

  Person() {
  }

  Person(String name, String job) {
    this.name = name;
    this.job = job;
  }

  @Override
  public String toString() {
    return name + ", " + job;
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = in.readUTF();
    job = in.readUTF();
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeUTF(name);
    out.writeUTF(job);
  }
}

public class ExternalizableTest {

}
