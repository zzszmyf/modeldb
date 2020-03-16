// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.ProtoType;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class PythonEnvironmentDiff implements ProtoType {
    public DiffStatusEnumDiffStatus VersionStatus;
    public VersionEnvironmentBlob VersionA;
    public VersionEnvironmentBlob VersionB;
    public List<PythonRequirementEnvironmentDiff> Requirements;
    public List<PythonRequirementEnvironmentDiff> Constraints;

    public PythonEnvironmentDiff() {
        this.VersionStatus = null;
        this.VersionA = null;
        this.VersionB = null;
        this.Requirements = null;
        this.Constraints = null;
    }

    public Boolean isEmpty() {
        if (this.VersionStatus != null) {
            return false;
        }
        if (this.VersionA != null) {
            return false;
        }
        if (this.VersionB != null) {
            return false;
        }
        if (this.Requirements != null) {
            return false;
        }
        if (this.Constraints != null) {
            return false;
        }
        return true;
    }

    public Boolean equals(PythonEnvironmentDiff other) {
        if (other == null) {
            return false;
        }
        {
            Function3<DiffStatusEnumDiffStatus,DiffStatusEnumDiffStatus,Boolean> f = (x, y) -> x.equals(y);
            if (this.VersionStatus != null || other.VersionStatus != null) {
                if (this.VersionStatus == null && other.VersionStatus != null)
                    return false;
                if (this.VersionStatus != null && other.VersionStatus == null)
                    return false;
                if (!f.apply(this.VersionStatus, other.VersionStatus))
                    return false;
            }
        }
        {
            Function3<VersionEnvironmentBlob,VersionEnvironmentBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.VersionA != null || other.VersionA != null) {
                if (this.VersionA == null && other.VersionA != null)
                    return false;
                if (this.VersionA != null && other.VersionA == null)
                    return false;
                if (!f.apply(this.VersionA, other.VersionA))
                    return false;
            }
        }
        {
            Function3<VersionEnvironmentBlob,VersionEnvironmentBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.VersionB != null || other.VersionB != null) {
                if (this.VersionB == null && other.VersionB != null)
                    return false;
                if (this.VersionB != null && other.VersionB == null)
                    return false;
                if (!f.apply(this.VersionB, other.VersionB))
                    return false;
            }
        }
        {
            Function3<List<PythonRequirementEnvironmentDiff>,List<PythonRequirementEnvironmentDiff>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<PythonRequirementEnvironmentDiff,PythonRequirementEnvironmentDiff,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.Requirements != null || other.Requirements != null) {
                if (this.Requirements == null && other.Requirements != null)
                    return false;
                if (this.Requirements != null && other.Requirements == null)
                    return false;
                if (!f.apply(this.Requirements, other.Requirements))
                    return false;
            }
        }
        {
            Function3<List<PythonRequirementEnvironmentDiff>,List<PythonRequirementEnvironmentDiff>,Boolean> f = (x2, y2) -> IntStream.range(0, Math.min(x2.size(), y2.size())).mapToObj(i -> { Function3<PythonRequirementEnvironmentDiff,PythonRequirementEnvironmentDiff,Boolean> f2 = (x, y) -> x.equals(y); return f2.apply(x2.get(i), y2.get(i));}).filter(x -> x != null).collect(Collectors.toList()).isEmpty();
            if (this.Constraints != null || other.Constraints != null) {
                if (this.Constraints == null && other.Constraints != null)
                    return false;
                if (this.Constraints != null && other.Constraints == null)
                    return false;
                if (!f.apply(this.Constraints, other.Constraints))
                    return false;
            }
        }
        return true;
    }

    public PythonEnvironmentDiff setVersionStatus(DiffStatusEnumDiffStatus value) {
        this.VersionStatus = value;
        return this;
    }
    public PythonEnvironmentDiff setVersionA(VersionEnvironmentBlob value) {
        this.VersionA = value;
        return this;
    }
    public PythonEnvironmentDiff setVersionB(VersionEnvironmentBlob value) {
        this.VersionB = value;
        return this;
    }
    public PythonEnvironmentDiff setRequirements(List<PythonRequirementEnvironmentDiff> value) {
        this.Requirements = value;
        return this;
    }
    public PythonEnvironmentDiff setConstraints(List<PythonRequirementEnvironmentDiff> value) {
        this.Constraints = value;
        return this;
    }

    static public PythonEnvironmentDiff fromProto(ai.verta.modeldb.versioning.PythonEnvironmentDiff blob) {
        if (blob == null) {
            return null;
        }

        PythonEnvironmentDiff obj = new PythonEnvironmentDiff();
        {
            Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff,DiffStatusEnumDiffStatus> f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getVersionStatus());
            obj.VersionStatus = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff,VersionEnvironmentBlob> f = x -> VersionEnvironmentBlob.fromProto(blob.getVersionA());
            obj.VersionA = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff,VersionEnvironmentBlob> f = x -> VersionEnvironmentBlob.fromProto(blob.getVersionB());
            obj.VersionB = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff,List<PythonRequirementEnvironmentDiff>> f = x -> blob.getRequirementsList().stream().map(PythonRequirementEnvironmentDiff::fromProto).collect(Collectors.toList());
            obj.Requirements = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff,List<PythonRequirementEnvironmentDiff>> f = x -> blob.getConstraintsList().stream().map(PythonRequirementEnvironmentDiff::fromProto).collect(Collectors.toList());
            obj.Constraints = f.apply(blob);
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder toProto() {
        ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder builder = ai.verta.modeldb.versioning.PythonEnvironmentDiff.newBuilder();
        {
            if (this.VersionStatus != null) {
                Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder,Void> f = x -> { builder.setVersionStatus(this.VersionStatus.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.VersionA != null) {
                Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder,Void> f = x -> { builder.setVersionA(this.VersionA.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.VersionB != null) {
                Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder,Void> f = x -> { builder.setVersionB(this.VersionB.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Requirements != null) {
                Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder,Void> f = x -> { builder.addAllRequirements(this.Requirements.stream().map(y -> y.toProto().build()).collect(Collectors.toList())); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Constraints != null) {
                Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder,Void> f = x -> { builder.addAllConstraints(this.Constraints.stream().map(y -> y.toProto().build()).collect(Collectors.toList())); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitPythonEnvironmentDiff(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepDiffStatusEnumDiffStatus(this.VersionStatus);
        visitor.preVisitDeepVersionEnvironmentBlob(this.VersionA);
        visitor.preVisitDeepVersionEnvironmentBlob(this.VersionB);
        visitor.preVisitDeepListOfPythonRequirementEnvironmentDiff(this.Requirements);
        visitor.preVisitDeepListOfPythonRequirementEnvironmentDiff(this.Constraints);
    }

    public PythonEnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitPythonEnvironmentDiff(this);
    }

    public PythonEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        this.VersionStatus = visitor.postVisitDeepDiffStatusEnumDiffStatus(this.VersionStatus);
        this.VersionA = visitor.postVisitDeepVersionEnvironmentBlob(this.VersionA);
        this.VersionB = visitor.postVisitDeepVersionEnvironmentBlob(this.VersionB);
        this.Requirements = visitor.postVisitDeepListOfPythonRequirementEnvironmentDiff(this.Requirements);
        this.Constraints = visitor.postVisitDeepListOfPythonRequirementEnvironmentDiff(this.Constraints);
        return this.postVisitShallow(visitor);
    }
}
