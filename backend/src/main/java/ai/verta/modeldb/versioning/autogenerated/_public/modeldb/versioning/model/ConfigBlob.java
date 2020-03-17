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

public class ConfigBlob implements ProtoType {
    public List<HyperparameterSetConfigBlob> HyperparameterSet;
    public List<HyperparameterConfigBlob> Hyperparameters;

    public ConfigBlob() {
        this.HyperparameterSet = null;
        this.Hyperparameters = null;
    }

    public Boolean isEmpty() {
        if (this.HyperparameterSet != null) {
            return false;
        }
        if (this.Hyperparameters != null) {
            return false;
        }
        return true;
    }

    // TODO: not consider order on lists
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof ConfigBlob)) return false;
        ConfigBlob other = (ConfigBlob) o;

        {
            Function3<List<HyperparameterSetConfigBlob>,List<HyperparameterSetConfigBlob>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<HyperparameterSetConfigBlob,HyperparameterSetConfigBlob,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.HyperparameterSet != null || other.HyperparameterSet != null) {
                if (this.HyperparameterSet == null && other.HyperparameterSet != null)
                    return false;
                if (this.HyperparameterSet != null && other.HyperparameterSet == null)
                    return false;
                if (!f.apply(this.HyperparameterSet, other.HyperparameterSet))
                    return false;
            }
        }
        {
            Function3<List<HyperparameterConfigBlob>,List<HyperparameterConfigBlob>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<HyperparameterConfigBlob,HyperparameterConfigBlob,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.Hyperparameters != null || other.Hyperparameters != null) {
                if (this.Hyperparameters == null && other.Hyperparameters != null)
                    return false;
                if (this.Hyperparameters != null && other.Hyperparameters == null)
                    return false;
                if (!f.apply(this.Hyperparameters, other.Hyperparameters))
                    return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        this.HyperparameterSet,
        this.Hyperparameters
        );
      }

    public ConfigBlob setHyperparameterSet(List<HyperparameterSetConfigBlob> value) {
        this.HyperparameterSet = value;
        return this;
    }
    public ConfigBlob setHyperparameters(List<HyperparameterConfigBlob> value) {
        this.Hyperparameters = value;
        return this;
    }

    static public ConfigBlob fromProto(ai.verta.modeldb.versioning.ConfigBlob blob) {
        if (blob == null) {
            return null;
        }

        ConfigBlob obj = new ConfigBlob();
        {
            Function<ai.verta.modeldb.versioning.ConfigBlob,List<HyperparameterSetConfigBlob>> f = x -> blob.getHyperparameterSetList().stream().map(HyperparameterSetConfigBlob::fromProto).collect(Collectors.toList());
            obj.HyperparameterSet = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.ConfigBlob,List<HyperparameterConfigBlob>> f = x -> blob.getHyperparametersList().stream().map(HyperparameterConfigBlob::fromProto).collect(Collectors.toList());
            obj.Hyperparameters = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.ConfigBlob.Builder toProto() {
        ai.verta.modeldb.versioning.ConfigBlob.Builder builder = ai.verta.modeldb.versioning.ConfigBlob.newBuilder();
        {
            if (this.HyperparameterSet != null) {
                Function<ai.verta.modeldb.versioning.ConfigBlob.Builder,Void> f = x -> { builder.addAllHyperparameterSet(this.HyperparameterSet.stream().map(y -> y.toProto().build()).collect(Collectors.toList())); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Hyperparameters != null) {
                Function<ai.verta.modeldb.versioning.ConfigBlob.Builder,Void> f = x -> { builder.addAllHyperparameters(this.Hyperparameters.stream().map(y -> y.toProto().build()).collect(Collectors.toList())); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitConfigBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepListOfHyperparameterSetConfigBlob(this.HyperparameterSet);
        visitor.preVisitDeepListOfHyperparameterConfigBlob(this.Hyperparameters);
    }

    public ConfigBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitConfigBlob(this);
    }

    public ConfigBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.HyperparameterSet = visitor.postVisitDeepListOfHyperparameterSetConfigBlob(this.HyperparameterSet);
        this.Hyperparameters = visitor.postVisitDeepListOfHyperparameterConfigBlob(this.Hyperparameters);
        return this.postVisitShallow(visitor);
    }
}
