package subProj_1385

import subProj_1385.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1385")
    name = "subProj 1385"

    buildType(subProj_bt_1385_3)
    buildType(subProj_bt_1385_4)
    buildType(subProj_bt_1385_5)
    buildType(subProj_bt_1385_0)
    buildType(subProj_bt_1385_1)
    buildType(subProj_bt_1385_2)
})
