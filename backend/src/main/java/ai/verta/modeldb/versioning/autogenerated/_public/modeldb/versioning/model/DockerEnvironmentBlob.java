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

public class DockerEnvironmentBlob implements ProtoType {
    public String Repository;
    public String Tag;
    public String Sha;

    public DockerEnvironmentBlob() {
        this.Repository = null;
        this.Tag = null;
        this.Sha = null;
    }

    public Boolean isEmpty() {
        if (this.Repository != null) {
            return false;
        }
        if (this.Tag != null) {
            return false;
        }
        if (this.Sha != null) {
            return false;
        }
        return true;
    }

    public Boolean equals(DockerEnvironmentBlob other) {
        if (other == null) {
            return false;
        }
        {
            Function3<String,String,Boolean> f = (x, y) -> x.equals(y);
            if (this.Repository != null || other.Repository != null) {
                if (this.Repository == null && other.Repository != null)
                    return false;
                if (this.Repository != null && other.Repository == null)
                    return false;
                if (!f.apply(this.Repository, other.Repository))
                    return false;
            }
        }
        {
            Function3<String,String,Boolean> f = (x, y) -> x.equals(y);
            if (this.Tag != null || other.Tag != null) {
                if (this.Tag == null && other.Tag != null)
                    return false;
                if (this.Tag != null && other.Tag == null)
                    return false;
                if (!f.apply(this.Tag, other.Tag))
                    return false;
            }
        }
        {
            Function3<String,String,Boolean> f = (x, y) -> x.equals(y);
            if (this.Sha != null || other.Sha != null) {
                if (this.Sha == null && other.Sha != null)
                    return false;
                if (this.Sha != null && other.Sha == null)
                    return false;
                if (!f.apply(this.Sha, other.Sha))
                    return false;
            }
        }
        return true;
    }

    public DockerEnvironmentBlob setRepository(String value) {
        this.Repository = value;
        return this;
    }
    public DockerEnvironmentBlob setTag(String value) {
        this.Tag = value;
        return this;
    }
    public DockerEnvironmentBlob setSha(String value) {
        this.Sha = value;
        return this;
    }

    static public DockerEnvironmentBlob fromProto(ai.verta.modeldb.versioning.DockerEnvironmentBlob blob) {
        if (blob == null) {
            return null;
        }

        DockerEnvironmentBlob obj = new DockerEnvironmentBlob();
        {
            Function<ai.verta.modeldb.versioning.DockerEnvironmentBlob,String> f = x -> (blob.getRepository());
            obj.Repository = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.DockerEnvironmentBlob,String> f = x -> (blob.getTag());
            obj.Tag = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.DockerEnvironmentBlob,String> f = x -> (blob.getSha());
            obj.Sha = f.apply(blob);
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.DockerEnvironmentBlob.Builder toProto() {
        ai.verta.modeldb.versioning.DockerEnvironmentBlob.Builder builder = ai.verta.modeldb.versioning.DockerEnvironmentBlob.newBuilder();
        {
            if (this.Repository != null) {
                Function<ai.verta.modeldb.versioning.DockerEnvironmentBlob.Builder,Void> f = x -> { builder.setRepository(this.Repository); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Tag != null) {
                Function<ai.verta.modeldb.versioning.DockerEnvironmentBlob.Builder,Void> f = x -> { builder.setTag(this.Tag); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Sha != null) {
                Function<ai.verta.modeldb.versioning.DockerEnvironmentBlob.Builder,Void> f = x -> { builder.setSha(this.Sha); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitDockerEnvironmentBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepString(this.Repository);
        visitor.preVisitDeepString(this.Tag);
        visitor.preVisitDeepString(this.Sha);
    }

    public DockerEnvironmentBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitDockerEnvironmentBlob(this);
    }

    public DockerEnvironmentBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Repository = visitor.postVisitDeepString(this.Repository);
        this.Tag = visitor.postVisitDeepString(this.Tag);
        this.Sha = visitor.postVisitDeepString(this.Sha);
        return this.postVisitShallow(visitor);
    }
}
