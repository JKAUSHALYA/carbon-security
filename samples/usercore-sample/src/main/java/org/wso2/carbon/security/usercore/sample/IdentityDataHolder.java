/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.security.usercore.sample;

 import org.wso2.carbon.security.usercore.common.CarbonRealmServiceImpl;
 import org.wso2.carbon.security.usercore.service.RealmService;

/**
 * Data holder for identity gateway sample.
 */
public class IdentityDataHolder {

    private RealmService carbonRealmService;
    private static final IdentityDataHolder instance = new IdentityDataHolder();

    private IdentityDataHolder() {
        super();
    }

    public static IdentityDataHolder getInstance() {
        return instance;
    }

    public void registerCarbonRealmService(RealmService carbonRealmService) {
        this.carbonRealmService = carbonRealmService;
    }

    public RealmService getCarbonRealmService() {
        return this.carbonRealmService;
    }
}