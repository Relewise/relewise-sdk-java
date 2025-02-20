package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CompanyUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyUpdate extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.CompanyUpdate, Relewise.Client";
    public Company company;
    public CompanyUpdateUpdateKind kind;
    public @Nullable Company[] parents;
    public Boolean replaceExistingParents;
    public static CompanyUpdate create(Company company, Boolean replaceExistingParents, Company... parents)
    {
        return new CompanyUpdate(company, replaceExistingParents, parents);
    }
    public CompanyUpdate(Company company, Boolean replaceExistingParents, Company... parents)
    {
        this.company = company;
        this.replaceExistingParents = replaceExistingParents;
        this.parents = parents;
        this.kind = CompanyUpdateUpdateKind.UpdateAndAppend;
    }
    public static CompanyUpdate create(Company company, Boolean replaceExistingParents, @Nullable Company[] parents, CompanyUpdateUpdateKind kind)
    {
        return new CompanyUpdate(company, replaceExistingParents, parents, kind);
    }
    public CompanyUpdate(Company company, Boolean replaceExistingParents, @Nullable Company[] parents, CompanyUpdateUpdateKind kind)
    {
        this.company = company;
        this.replaceExistingParents = replaceExistingParents;
        this.parents = parents;
        this.kind = kind;
    }
    public static CompanyUpdate create(Company company)
    {
        return new CompanyUpdate(company);
    }
    public CompanyUpdate(Company company)
    {
        this.company = company;
        this.kind = CompanyUpdateUpdateKind.UpdateAndAppend;
    }
    public static CompanyUpdate create(Company company, CompanyUpdateUpdateKind kind)
    {
        return new CompanyUpdate(company, kind);
    }
    public CompanyUpdate(Company company, CompanyUpdateUpdateKind kind)
    {
        this.company = company;
        this.kind = kind;
    }
    public CompanyUpdate()
    {
        this.kind = CompanyUpdateUpdateKind.UpdateAndAppend;
    }
    public Company getCompany()
    {
        return this.company;
    }
    public CompanyUpdateUpdateKind getKind()
    {
        return this.kind;
    }
    public @Nullable Company[] getParents()
    {
        return this.parents;
    }
    public Boolean getReplaceExistingParents()
    {
        return this.replaceExistingParents;
    }
    public CompanyUpdate setCompany(Company company)
    {
        this.company = company;
        return this;
    }
    public CompanyUpdate setKind(CompanyUpdateUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
    public CompanyUpdate setParents(Company... parents)
    {
        this.parents = parents;
        return this;
    }
    public CompanyUpdate addToParents(Company parent)
    {
        if (this.parents == null)
        {
            this.parents = new Company[] { parent };
        }
        else
        {
            ArrayList<Company> existingList = new ArrayList<>(Arrays.asList(this.parents));
            existingList.add(parent);
            this.parents = existingList.toArray(new Company[0]);
        }
        return this;
    }
    public CompanyUpdate setReplaceExistingParents(Boolean replaceExistingParents)
    {
        this.replaceExistingParents = replaceExistingParents;
        return this;
    }
}
