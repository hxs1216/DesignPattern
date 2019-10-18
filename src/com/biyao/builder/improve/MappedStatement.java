/*
 *    Copyright 2009-2012 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.biyao.builder.improve;

/**
 * @author Clinton Begin
 */

/**
 * mybatis内部使用建造者模式
 *
 */
public final class MappedStatement {

  private String resource;
  private String id;
  private Integer fetchSize;
  private Integer timeout;
  private boolean flushCacheRequired;
  private boolean useCache;
  private boolean resultOrdered;
  private String[] keyProperties;
  private String[] keyColumns;
  private boolean hasNestedResultMaps;
  private String databaseId;
  private String[] resultSets;

  MappedStatement() {
    // constructor disabled
  }

  //静态内部类，建造者模式
  public static class Builder {
    private MappedStatement mappedStatement = new MappedStatement();

    public Builder(String id) {
      mappedStatement.id = id;
    }

    public Builder resource(String resource) {
      mappedStatement.resource = resource;
      return this;
    }

    public String id() {
      return mappedStatement.id;
    }

    public Builder fetchSize(Integer fetchSize) {
      mappedStatement.fetchSize = fetchSize;
      return this;
    }

    public Builder timeout(Integer timeout) {
      mappedStatement.timeout = timeout;
      return this;
    }

    public Builder flushCacheRequired(boolean flushCacheRequired) {
      mappedStatement.flushCacheRequired = flushCacheRequired;
      return this;
    }

    public Builder useCache(boolean useCache) {
      mappedStatement.useCache = useCache;
      return this;
    }

    public Builder resultOrdered(boolean resultOrdered) {
      mappedStatement.resultOrdered = resultOrdered;
      return this;
    }

    public MappedStatement build() {
      return mappedStatement;
    }
  }

  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getFetchSize() {
    return fetchSize;
  }

  public void setFetchSize(Integer fetchSize) {
    this.fetchSize = fetchSize;
  }

  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public boolean isFlushCacheRequired() {
    return flushCacheRequired;
  }

  public void setFlushCacheRequired(boolean flushCacheRequired) {
    this.flushCacheRequired = flushCacheRequired;
  }

  public boolean isUseCache() {
    return useCache;
  }

  public void setUseCache(boolean useCache) {
    this.useCache = useCache;
  }

  public boolean isResultOrdered() {
    return resultOrdered;
  }

  public void setResultOrdered(boolean resultOrdered) {
    this.resultOrdered = resultOrdered;
  }

  public String[] getKeyProperties() {
    return keyProperties;
  }

  public void setKeyProperties(String[] keyProperties) {
    this.keyProperties = keyProperties;
  }

  public String[] getKeyColumns() {
    return keyColumns;
  }

  public void setKeyColumns(String[] keyColumns) {
    this.keyColumns = keyColumns;
  }

  public boolean isHasNestedResultMaps() {
    return hasNestedResultMaps;
  }

  public void setHasNestedResultMaps(boolean hasNestedResultMaps) {
    this.hasNestedResultMaps = hasNestedResultMaps;
  }

  public String getDatabaseId() {
    return databaseId;
  }

  public void setDatabaseId(String databaseId) {
    this.databaseId = databaseId;
  }

  public String[] getResultSets() {
    return resultSets;
  }

  public void setResultSets(String[] resultSets) {
    this.resultSets = resultSets;
  }
}
