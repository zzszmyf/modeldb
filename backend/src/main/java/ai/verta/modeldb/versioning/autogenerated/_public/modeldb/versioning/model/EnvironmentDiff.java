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

public class EnvironmentDiff implements ProtoType {
    public PythonEnvironmentDiff Python;
    public DockerEnvironmentDiff Docker;
    public List<EnvironmentVariablesDiff> EnvironmentVariables;
    public DiffStatusEnumDiffStatus CommandLineStatus;
    public List<String> CommandLineA;
    public List<String> CommandLineB;

    public EnvironmentDiff() {
        this.Python = null;
        this.Docker = null;
        this.EnvironmentVariables = null;
        this.CommandLineStatus = null;
        this.CommandLineA = null;
        this.CommandLineB = null;
    }

    public Boolean isEmpty() {
        if (this.Python != null) {
            return false;
        }
        if (this.Docker != null) {
            return false;
        }
        if (this.EnvironmentVariables != null) {
            return false;
        }
        if (this.CommandLineStatus != null) {
            return false;
        }
        if (this.CommandLineA != null) {
            return false;
        }
        if (this.CommandLineB != null) {
            return false;
        }
        return true;
    }

    // TODO: not consider order on lists
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof EnvironmentDiff)) return false;
        EnvironmentDiff other = (EnvironmentDiff) o;

        {
            Function3<PythonEnvironmentDiff,PythonEnvironmentDiff,Boolean> f = (x, y) -> x.equals(y);
            if (this.Python != null || other.Python != null) {
                if (this.Python == null && other.Python != null)
                    return false;
                if (this.Python != null && other.Python == null)
                    return false;
                if (!f.apply(this.Python, other.Python))
                    return false;
            }
        }
        {
            Function3<DockerEnvironmentDiff,DockerEnvironmentDiff,Boolean> f = (x, y) -> x.equals(y);
            if (this.Docker != null || other.Docker != null) {
                if (this.Docker == null && other.Docker != null)
                    return false;
                if (this.Docker != null && other.Docker == null)
                    return false;
                if (!f.apply(this.Docker, other.Docker))
                    return false;
            }
        }
        {
            Function3<List<EnvironmentVariablesDiff>,List<EnvironmentVariablesDiff>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<EnvironmentVariablesDiff,EnvironmentVariablesDiff,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.EnvironmentVariables != null || other.EnvironmentVariables != null) {
                if (this.EnvironmentVariables == null && other.EnvironmentVariables != null)
                    return false;
                if (this.EnvironmentVariables != null && other.EnvironmentVariables == null)
                    return false;
                if (!f.apply(this.EnvironmentVariables, other.EnvironmentVariables))
                    return false;
            }
        }
        {
            Function3<DiffStatusEnumDiffStatus,DiffStatusEnumDiffStatus,Boolean> f = (x, y) -> x.equals(y);
            if (this.CommandLineStatus != null || other.CommandLineStatus != null) {
                if (this.CommandLineStatus == null && other.CommandLineStatus != null)
                    return false;
                if (this.CommandLineStatus != null && other.CommandLineStatus == null)
                    return false;
                if (!f.apply(this.CommandLineStatus, other.CommandLineStatus))
                    return false;
            }
        }
        {
            Function3<List<String>,List<String>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<String,String,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.CommandLineA != null || other.CommandLineA != null) {
                if (this.CommandLineA == null && other.CommandLineA != null)
                    return false;
                if (this.CommandLineA != null && other.CommandLineA == null)
                    return false;
                if (!f.apply(this.CommandLineA, other.CommandLineA))
                    return false;
            }
        }
        {
            Function3<List<String>,List<String>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<String,String,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.CommandLineB != null || other.CommandLineB != null) {
                if (this.CommandLineB == null && other.CommandLineB != null)
                    return false;
                if (this.CommandLineB != null && other.CommandLineB == null)
                    return false;
                if (!f.apply(this.CommandLineB, other.CommandLineB))
                    return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        this.Python,
        this.Docker,
        this.EnvironmentVariables,
        this.CommandLineStatus,
        this.CommandLineA,
        this.CommandLineB
        );
      }

    public EnvironmentDiff setPython(PythonEnvironmentDiff value) {
        this.Python = value;
        return this;
    }
    public EnvironmentDiff setDocker(DockerEnvironmentDiff value) {
        this.Docker = value;
        return this;
    }
    public EnvironmentDiff setEnvironmentVariables(List<EnvironmentVariablesDiff> value) {
        this.EnvironmentVariables = value;
        return this;
    }
    public EnvironmentDiff setCommandLineStatus(DiffStatusEnumDiffStatus value) {
        this.CommandLineStatus = value;
        return this;
    }
    public EnvironmentDiff setCommandLineA(List<String> value) {
        this.CommandLineA = value;
        return this;
    }
    public EnvironmentDiff setCommandLineB(List<String> value) {
        this.CommandLineB = value;
        return this;
    }

    static public EnvironmentDiff fromProto(ai.verta.modeldb.versioning.EnvironmentDiff blob) {
        if (blob == null) {
            return null;
        }

        EnvironmentDiff obj = new EnvironmentDiff();
        {
            Function<ai.verta.modeldb.versioning.EnvironmentDiff,PythonEnvironmentDiff> f = x -> PythonEnvironmentDiff.fromProto(blob.getPython());
            obj.Python = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.EnvironmentDiff,DockerEnvironmentDiff> f = x -> DockerEnvironmentDiff.fromProto(blob.getDocker());
            obj.Docker = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.EnvironmentDiff,List<EnvironmentVariablesDiff>> f = x -> blob.getEnvironmentVariablesList().stream().map(EnvironmentVariablesDiff::fromProto).collect(Collectors.toList());
            obj.EnvironmentVariables = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.EnvironmentDiff,DiffStatusEnumDiffStatus> f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getCommandLineStatus());
            obj.CommandLineStatus = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.EnvironmentDiff,List<String>> f = x -> blob.getCommandLineAList();
            obj.CommandLineA = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.EnvironmentDiff,List<String>> f = x -> blob.getCommandLineBList();
            obj.CommandLineB = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.EnvironmentDiff.Builder toProto() {
        ai.verta.modeldb.versioning.EnvironmentDiff.Builder builder = ai.verta.modeldb.versioning.EnvironmentDiff.newBuilder();
        {
            if (this.Python != null) {
                Function<ai.verta.modeldb.versioning.EnvironmentDiff.Builder,Void> f = x -> { builder.setPython(this.Python.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Docker != null) {
                Function<ai.verta.modeldb.versioning.EnvironmentDiff.Builder,Void> f = x -> { builder.setDocker(this.Docker.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.EnvironmentVariables != null) {
                Function<ai.verta.modeldb.versioning.EnvironmentDiff.Builder,Void> f = x -> { builder.addAllEnvironmentVariables(this.EnvironmentVariables.stream().map(y -> y.toProto().build()).collect(Collectors.toList())); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.CommandLineStatus != null) {
                Function<ai.verta.modeldb.versioning.EnvironmentDiff.Builder,Void> f = x -> { builder.setCommandLineStatus(this.CommandLineStatus.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.CommandLineA != null) {
                Function<ai.verta.modeldb.versioning.EnvironmentDiff.Builder,Void> f = x -> { builder.addAllCommandLineA(this.CommandLineA); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.CommandLineB != null) {
                Function<ai.verta.modeldb.versioning.EnvironmentDiff.Builder,Void> f = x -> { builder.addAllCommandLineB(this.CommandLineB); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitEnvironmentDiff(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepPythonEnvironmentDiff(this.Python);
        visitor.preVisitDeepDockerEnvironmentDiff(this.Docker);
        visitor.preVisitDeepListOfEnvironmentVariablesDiff(this.EnvironmentVariables);
        visitor.preVisitDeepDiffStatusEnumDiffStatus(this.CommandLineStatus);
        visitor.preVisitDeepListOfString(this.CommandLineA);
        visitor.preVisitDeepListOfString(this.CommandLineB);
    }

    public EnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitEnvironmentDiff(this);
    }

    public EnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Python = visitor.postVisitDeepPythonEnvironmentDiff(this.Python);
        this.Docker = visitor.postVisitDeepDockerEnvironmentDiff(this.Docker);
        this.EnvironmentVariables = visitor.postVisitDeepListOfEnvironmentVariablesDiff(this.EnvironmentVariables);
        this.CommandLineStatus = visitor.postVisitDeepDiffStatusEnumDiffStatus(this.CommandLineStatus);
        this.CommandLineA = visitor.postVisitDeepListOfString(this.CommandLineA);
        this.CommandLineB = visitor.postVisitDeepListOfString(this.CommandLineB);
        return this.postVisitShallow(visitor);
    }
}
