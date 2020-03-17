// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class HyperparameterConfigBlob implements ProtoType {
    public String Name;
    public HyperparameterValuesConfigBlob Value;

    public HyperparameterConfigBlob() {
        this.Name = null;
        this.Value = null;
    }

    public Boolean isEmpty() {
        if (this.Name != null) {
            return false;
        }
        if (this.Value != null) {
            return false;
        }
        return true;
    }

    // TODO: not consider order on lists
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof HyperparameterConfigBlob)) return false;
        HyperparameterConfigBlob other = (HyperparameterConfigBlob) o;

        {
            Function3<String,String,Boolean> f = (x, y) -> x.equals(y);
            if (this.Name != null || other.Name != null) {
                if (this.Name == null && other.Name != null)
                    return false;
                if (this.Name != null && other.Name == null)
                    return false;
                if (!f.apply(this.Name, other.Name))
                    return false;
            }
        }
        {
            Function3<HyperparameterValuesConfigBlob,HyperparameterValuesConfigBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.Value != null || other.Value != null) {
                if (this.Value == null && other.Value != null)
                    return false;
                if (this.Value != null && other.Value == null)
                    return false;
                if (!f.apply(this.Value, other.Value))
                    return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        this.Name,
        this.Value
        );
      }

    public HyperparameterConfigBlob setName(String value) {
        this.Name = value;
        return this;
    }
    public HyperparameterConfigBlob setValue(HyperparameterValuesConfigBlob value) {
        this.Value = value;
        return this;
    }

    static public HyperparameterConfigBlob fromProto(ai.verta.modeldb.versioning.HyperparameterConfigBlob blob) {
        if (blob == null) {
            return null;
        }

        HyperparameterConfigBlob obj = new HyperparameterConfigBlob();
        {
            Function<ai.verta.modeldb.versioning.HyperparameterConfigBlob,String> f = x -> (blob.getName());
            obj.Name = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.HyperparameterConfigBlob,HyperparameterValuesConfigBlob> f = x -> HyperparameterValuesConfigBlob.fromProto(blob.getValue());
            obj.Value = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.HyperparameterConfigBlob.Builder toProto() {
        ai.verta.modeldb.versioning.HyperparameterConfigBlob.Builder builder = ai.verta.modeldb.versioning.HyperparameterConfigBlob.newBuilder();
        {
            if (this.Name != null) {
                Function<ai.verta.modeldb.versioning.HyperparameterConfigBlob.Builder,Void> f = x -> { builder.setName(this.Name); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Value != null) {
                Function<ai.verta.modeldb.versioning.HyperparameterConfigBlob.Builder,Void> f = x -> { builder.setValue(this.Value.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitHyperparameterConfigBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepString(this.Name);
        visitor.preVisitDeepHyperparameterValuesConfigBlob(this.Value);
    }

    public HyperparameterConfigBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitHyperparameterConfigBlob(this);
    }

    public HyperparameterConfigBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Name = visitor.postVisitDeepString(this.Name);
        this.Value = visitor.postVisitDeepHyperparameterValuesConfigBlob(this.Value);
        return this.postVisitShallow(visitor);
    }
}
