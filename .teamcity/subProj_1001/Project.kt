package subProj_1001

import subProj_1001.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1001")
    name = "subProj 1001"

    buildType(subProj_bt_1001_4)
    buildType(subProj_bt_1001_5)
    buildType(subProj_bt_1001_2)
    buildType(subProj_bt_1001_3)
    buildType(subProj_bt_1001_0)
    buildType(subProj_bt_1001_1)
})
