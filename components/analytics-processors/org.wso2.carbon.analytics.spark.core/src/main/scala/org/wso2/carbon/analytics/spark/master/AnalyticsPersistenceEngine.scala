/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.analytics.spark.master

import org.apache.spark.deploy.master.PersistenceEngine

import scala.reflect.ClassTag

/**
 * Created by niranda on 6/4/15.
 */
class AnalyticsPersistenceEngine extends PersistenceEngine{
  override def persist(name: String, obj: Object) = ???

  override def unpersist(name: String) = ???

  override def read[T](prefix: String)(implicit evidence$1: ClassTag[T]) = ???
}
