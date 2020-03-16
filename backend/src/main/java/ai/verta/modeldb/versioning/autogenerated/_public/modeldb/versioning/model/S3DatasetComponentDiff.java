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

public class S3DatasetComponentDiff implements ProtoType {
    public PathDatasetComponentDiff Path;

    public S3DatasetComponentDiff() {
        this.Path = null;
    }

    public Boolean isEmpty() {
        if (this.Path != null) {
            return false;
        }
        return true;
    }

    public Boolean equals(S3DatasetComponentDiff other) {
        if (other == null) {
            return false;
        }
        {
            Function3<PathDatasetComponentDiff,PathDatasetComponentDiff,Boolean> f = (x, y) -> x.equals(y);
            if (this.Path != null || other.Path != null) {
                if (this.Path == null && other.Path != null)
                    return false;
                if (this.Path != null && other.Path == null)
                    return false;
                if (!f.apply(this.Path, other.Path))
                    return false;
            }
        }
        return true;
    }

    public S3DatasetComponentDiff setPath(PathDatasetComponentDiff value) {
        this.Path = value;
        return this;
    }

    static public S3DatasetComponentDiff fromProto(ai.verta.modeldb.versioning.S3DatasetComponentDiff blob) {
        if (blob == null) {
            return null;
        }

        S3DatasetComponentDiff obj = new S3DatasetComponentDiff();
        {
            Function<ai.verta.modeldb.versioning.S3DatasetComponentDiff,PathDatasetComponentDiff> f = x -> PathDatasetComponentDiff.fromProto(blob.getPath());
            obj.Path = f.apply(blob);
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.S3DatasetComponentDiff.Builder toProto() {
        ai.verta.modeldb.versioning.S3DatasetComponentDiff.Builder builder = ai.verta.modeldb.versioning.S3DatasetComponentDiff.newBuilder();
        {
            if (this.Path != null) {
                Function<ai.verta.modeldb.versioning.S3DatasetComponentDiff.Builder,Void> f = x -> { builder.setPath(this.Path.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitS3DatasetComponentDiff(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepPathDatasetComponentDiff(this.Path);
    }

    public S3DatasetComponentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitS3DatasetComponentDiff(this);
    }

    public S3DatasetComponentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Path = visitor.postVisitDeepPathDatasetComponentDiff(this.Path);
        return this.postVisitShallow(visitor);
    }
}
