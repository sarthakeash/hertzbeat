/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hertzbeat.alert.dao;

import java.util.List;
import java.util.Set;
import org.apache.hertzbeat.common.entity.alerter.AlertGroupConverge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;

/**
 * AlertConverge Dao
 */
public interface AlertGroupConvergeDao extends JpaRepository<AlertGroupConverge, Long>, JpaSpecificationExecutor<AlertGroupConverge> {

    /**
     * Delete group alarm converge based on the ID list
     * @param ids alert converge id list
     */
    @Modifying
    void deleteAlertGroupConvergesByIdIn(Set<Long> ids);

    /**
     * Query the enable true group alarm converge list
     * @return group alarm converge list
     */
    List<AlertGroupConverge> findAlertGroupConvergesByEnableIsTrue();
    
}
