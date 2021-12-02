package subProj_1395

import subProj_1395.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1395")
    name = "subProj 1395"

    buildType(subProj_bt_1395_5)
    buildType(subProj_bt_1395_4)
    buildType(subProj_bt_1395_1)
    buildType(subProj_bt_1395_0)
    buildType(subProj_bt_1395_3)
    buildType(subProj_bt_1395_2)
})
